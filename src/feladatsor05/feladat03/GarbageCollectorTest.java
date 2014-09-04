package feladatsor05.feladat03;

import java.util.WeakHashMap;

/**
 * 3. Készítsünk WeakHashMap-et, amely <SajatObjektum, Integer> formában minden
 * nagyméretû SajatObjektum példányhoz eltárol egy egész számot! Írjuk ki minden
 * új objektum foglalásakor a WeakHashMap aktuális méretét!
 */

class BigData {

    public BigData(int length) {
        this.array = new byte[length];
    }

    byte[] array;
}

public class GarbageCollectorTest {

    public static void main(String[] args) {
        WeakHashMap<BigData, Integer> cache = new WeakHashMap<BigData, Integer>();
        for (int i = 0; i < 1000; i++) {
            cache.put(new BigData(1024 * 256), i);
            System.out.println(i + ". Added a new element to the WeakHashMap. There are " + cache.size()
                    + " element in it.");
        }

    }
}
