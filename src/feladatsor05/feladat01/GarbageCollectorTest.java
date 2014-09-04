package feladatsor05.feladat01;

/**
 * 1. Készíts programot, amivel szemléltetni lehet a garbage collector
 * mûködését! A program foglaljon le nagyobb méretû objektumokból sokat és
 * mindegyikre tartson fent erõs referenciát! Mit tapasztalunk?
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
