package feladatsor03.feladat05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * 5. Olvass be egy Properties fájlt és próbáld kiolvasni a Properties
 * objektumból a felhasználó által a parancssoron megadott kulcshoz tartozó
 * értéket! Ha nem szerepel ilyen hozzárendelés a Properties objektumban, akkor
 * dobj egy saját kivételt (PropertyKeyNotFoundException)! Ha a fájl nem
 * létezik, akkor IOException-t kapunk, ezt csomaguljuk be egy másik saját
 * kivétel típusba (PropertiesReadError), figyelve arra, hogy az eredeti
 * IOException, mint ok szerepeljen az új, saját kivételben! A létrejött
 * kivételt dobjuk tovább! Teszteljük a programunkat!
 */

class PropertiesReadError extends Exception {
    private static final long serialVersionUID = 3469015685561021926L;

    public PropertiesReadError() {
        super();
    }

    public PropertiesReadError(String message) {
        super(message);
    }

    public PropertiesReadError(String message, Throwable cause) {
        super(message, cause);
    }
}

class PropertyKeyNotFoundException extends Exception {
    private static final long serialVersionUID = 3408208708671263095L;

    public PropertyKeyNotFoundException() {
        super();
    }

    public PropertyKeyNotFoundException(String message) {
        super(message);
    }

    public PropertyKeyNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}

public class PropertiesHandler {

    private static final String OPTIONS_FILE_PATH = "resources/feladatsor03/feladat05/user.properties";

    public static void createPropertiesFile() {

        Properties options = new Properties();

        options.setProperty("memory", "512MB");
        options.setProperty("os", "win8.1");
        options.setProperty("autostart", "false");

        try {
            PrintWriter optionsWriter = new PrintWriter(OPTIONS_FILE_PATH);

            try {
                options.store(optionsWriter, "This is a comment");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }

            optionsWriter.close();

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

    }

    public static Properties readPropertiesFile(String filePath) throws PropertiesReadError {

        Properties defaultOptions = new Properties();
        defaultOptions.setProperty("storage", "HDD");

        Properties props = new Properties(defaultOptions);

        try {
            props.load(new FileInputStream(filePath));
        } catch (IOException e) {
            throw new PropertiesReadError("Failed to load the properties file.", e);
        }

        return props;
    }

    public static void main(String[] args) {

        createPropertiesFile();

        try {
            Properties options = readPropertiesFile(OPTIONS_FILE_PATH);

            try (BufferedReader sysIn = new BufferedReader(new InputStreamReader(System.in))) {
                String inStr;

                System.out.print("Property key: ");
                while (((inStr = sysIn.readLine()) != null) && (!inStr.equals("exit"))) {
                    String propertyValue = options.getProperty(inStr);

                    if (propertyValue == null) {
                        throw new PropertyKeyNotFoundException("There isn't such property as \"" + inStr
                                + "\" in the Properties file");
                    }

                    System.out.println("Property value: " + propertyValue);
                    System.out.print("Property key: ");
                }
            } catch (Exception e) {
                e.printStackTrace();
                for (Throwable t : e.getSuppressed()) {
                    System.err.println(t.toString());
                }
            }
        } catch (PropertiesReadError e1) {
            e1.printStackTrace();
            System.err.println(e1 + "is thrown because of " + e1.getCause());
        }

    }
}
