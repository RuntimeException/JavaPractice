package feladatsor01.feladat02;

/** 2. Helyezd el a "Hello World" kiírását egy példánymetódusba. Ekkor a main metódusban meg kell példányosítani
   az osztályodat és meghívni rajta a kiíró metódust. */

public class MainHello {

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.sayHello();
    }
}

class Hello {
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}