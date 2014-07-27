package feladatsor03.feladat03;

/**
 * 3. Add össze 100 000-szer az "abcd" String-et! Mit tapasztalsz? Próbáld meg a
 * StringBuilder osztállyal!
 */

public class StringOneHundredThousand {
    public String text;

    public String lameStringAdder(String str, int count) {
        String strTemp = str;
        
        for (int i = 1; i < count; i++) {
            strTemp += str;
        }
        return strTemp;
    }
    
    public String superStringAdder(String str, int count) {
        StringBuilder strBldr = new StringBuilder(str);
        
        for (int i = 1; i < count; i++) {
            strBldr.append(str);
        }
        return strBldr.toString();
    }

    public static void main(String[] args) {
        StringOneHundredThousand sot = new StringOneHundredThousand();
        
        System.out.println("lameStringAdder - Start");
        sot.text = sot.lameStringAdder("Motherfucker!!!", 100000);
        System.out.println("lameStringAdder - End");
        
        System.out.println("superStringAdder - Start");
        sot.text = sot.superStringAdder("Motherfucker!!!", 100000);
        System.out.println("superStringAdder - End");
    }
}
