package feladatsor01.feladat04;

/** 4. Készítsünk különféle kiíró osztályokat, az egyik a paraméterül kapott szöveget csupa kisbetűvel
    (String.toLowerCase()), a másik csupa nagybetűvel (String.toUpperCase()) írja ki! */

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