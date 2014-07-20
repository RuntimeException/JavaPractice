package feladatsor01.feladat05;

/** Készítsünk interfészt, ami a kiíró metódust deklarálja és a kiíró osztályoknál valósítsuk meg ezt az interfészt!*/

public class MainPrinter {

    public static void main(String[] args) {
        MyPrinter printer = new MyPrinter();
        printer.print("Hello, World!");
        printer.printUpper("Hello, World!");
        printer.printLower("Hello, World!");
    }
}

class MyPrinter {
    public void print(String str) {
        System.out.println(str);
    }

    public void printUpper(String str) {
        System.out.println(str.toUpperCase());
    }

    public void printLower(String str) {
        System.out.println(str.toLowerCase());
    }
}