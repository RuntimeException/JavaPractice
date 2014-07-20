package feladatsor01.feladat06;

/**
 * 5. A k�t ki�r� oszt�lyt p�ld�nyos�tsuk meg egy harmadik oszt�ly main
 * mat�dus�ban, majd h�vjuk meg a ki�r� met�dusukat ugyanazzal a param�terrel!
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