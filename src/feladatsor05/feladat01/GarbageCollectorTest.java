package feladatsor05.feladat01;

/**
 * 1. K�sz�ts programot, amivel szeml�ltetni lehet a garbage collector
 * m�k�d�s�t! A program foglaljon le nagyobb m�ret� objektumokb�l sokat �s
 * mindegyikre tartson fent er�s referenci�t! Mit tapasztalunk?
 */

public class GarbageCollectorTest {

    static byte[] array;

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Trying to allocate " + (1 << i) + " byte...");
            array = new byte[1 << i];
        }
    }
}
