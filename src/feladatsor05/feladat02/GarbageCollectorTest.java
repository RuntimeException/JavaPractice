package feladatsor05.feladat02;

/**
 * 2. Módosítsuk a fenti programot úgy, hogy nem tartunk referenciát a lefoglalt
 * objektumokra! Mit tapasztalunk?
 */

public class GarbageCollectorTest {
    static byte[] array;
    final static int ALLOCATION_UNIT = 256;

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            System.out.println(i + ". Trying to allocate " + ALLOCATION_UNIT + " byte...");
            array = new byte[ALLOCATION_UNIT];
        }

    }

}
