package feladatsor01.feladat03;

/** 3. Tegyük paraméterezhetővé a szöveget, a kiíró metódus fogadjon egy string paramétert! */ 

public class MainPrinter {

    public static void main(String[] args) {
        MyPrinter printer = new MyPrinter();
        printer.sayString("Hello, World!");
    }
}

class MyPrinter {
    
    public void sayString(String str) {
        System.out.println(str);
    }
    
}