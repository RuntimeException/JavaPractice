package feladatsor01.feladat05;

/** K�sz�ts�nk interf�szt, ami a ki�r� met�dust deklar�lja �s a ki�r� oszt�lyokn�l val�s�tsuk meg ezt az interf�szt!*/

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