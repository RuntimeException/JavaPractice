package feladatsor01.feladat02;

/** 2. Helyezd el a "Hello World" ki�r�s�t egy p�ld�nymet�dusba. Ekkor a main met�dusban meg kell p�ld�nyos�tani
   az oszt�lyodat �s megh�vni rajta a ki�r� met�dust. */

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