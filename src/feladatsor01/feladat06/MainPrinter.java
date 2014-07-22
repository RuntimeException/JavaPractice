package feladatsor01.feladat06;

/**
 * 6. Készítsünk interfészt, ami a kiíró metódust deklarálja és a kiíró osztályoknál valósítsuk meg ezt az interfészt!
 */

public class MainPrinter implements Printer {

    public static void main(String[] args) {
        MainPrinter printer = new MainPrinter();
        printer.print("Hello, World!");
        printer.printUpper("Hello, World!");
        printer.printLower("Hello, World!");
    }

    public void print(String text) {
        System.out.println(text);
    }

    public void printUpper(String text) {
        System.out.println(text.toUpperCase());
    }

    public void printLower(String text) {
        System.out.println(text.toLowerCase());
    }
}