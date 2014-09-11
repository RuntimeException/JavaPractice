package feladatsor07.feladat01_to_03;

/**
 * 1. Hozz létre egy int tömböt először inicializáló listával pl. "{1,2,3}"!
 * 
 * 2. Hozz létre egy 10 elemű tömböt és töltsd fel az első 10 Fibonacci számmal!
 * Az első két szám 1, 1. A következő Fibonacci szám mindig az előző kettőnek az
 * összege.
 * 
 * 3. Iterálj végig a feltöltött tömbön a két tanult módon és írd ki a tömb
 * elemeinek értékét!
 */

public class ArrayTest {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };
        int[] fiboArray = new int[10];

        fiboArray[0] = 0;
        fiboArray[1] = 1;

        for (int i = 2; i < fiboArray.length; i++) {
            fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2];
        }

        System.out.println("Lame array:");
        for (int element : array) {
            System.out.println(element);
        }

        System.out.println("Fibonacci:");
        for (int i = 0; i < fiboArray.length; i++) {
            System.out.println(fiboArray[i]);
        }
    }
}
