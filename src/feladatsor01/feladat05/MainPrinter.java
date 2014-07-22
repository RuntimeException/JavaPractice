package feladatsor01.feladat05;

/** 5. A két kiíró osztályt példányosítsuk meg egy harmadik osztály main matódusában, majd hívjuk meg a kiíró
   metódusukat ugyanazzal a paraméterrel!*/

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