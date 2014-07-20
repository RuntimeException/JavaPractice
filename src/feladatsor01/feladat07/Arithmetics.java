package feladatsor01.feladat07;

import java.math.BigDecimal;

/**
 * 7. 1.0 float �rt�kb�l 0.1-es l�p�sekkel menj�nk 0.0-ig, minden iter�ci�ban
 * ki�rva az eredm�nyt. Az eredm�nyek nem pontosan azok, amiket v�rtunk. Keress
 * megold�st a probl�m�ra (google: java exact arithmetics)! A megold�sk�nt
 * el��ll� oszt�ly javadoc dokument�ci�j�t felkeresve, az ott le�rtak szerint
 * elv�gezve a kezdeti �rt�kb�l a kivon�sokat ism�telj�k meg a fenti k�s�rletet!
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