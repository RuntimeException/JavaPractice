package feladatsor01.feladat07;

import java.math.BigDecimal;

/**
 * 7. 1.0 float értékből 0.1-es lépésekkel menjünk 0.0-ig, minden iterációban kiírva az eredményt. Az eredmények
 * nem pontosan azok, amiket vártunk. Keress megoldást a problémára (google: java exact arithmetics)! A megoldásként
 * előálló osztály javadoc dokumentációját felkeresve, az ott leírtak szerint elvégezve a kezdeti értékből a
 * kivonásokat ismételjük meg a fenti kísérletet!
 */

public class Arithmetics {

    public static void main(String[] args) {
        badArithmetics();
        goodArithmetics();
    }

    public static void badArithmetics() {
        float x = 1.0f;

        System.out.println("badArithmetics:");
        for (int i = 0; i < 20; i++) {
            x -= 0.1;
            System.out.println("\t" + String.format("%2d", i) + ". "
                    + String.format("%2.20f", x));
        }
    }

    public static void goodArithmetics() {
        BigDecimal x = new BigDecimal(1);

        System.out.println("goodArithmetics:");
        for (int i = 0; i < 20; i++) {
            x = x.subtract(new BigDecimal("0.1"));
            System.out.println("\t" + String.format("%2d", i) + ". "
                    + x.toString());
        }
    }
}