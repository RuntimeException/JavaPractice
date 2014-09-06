package feladatsor06.feladat01_to_02;

import java.lang.reflect.InvocationTargetException;

/**
 * 1. Hozz l�tre egy oszt�ly egy statikus met�dussal. Szerezz referenci�t a
 * Class objektumra, amely ezt az oszt�lyt reprezent�lja! Reflection
 * seg�ts�g�vel h�vd meg a statikus met�dust!
 * 
 * 2. Adj arumentumokat a met�dushoz, a t�rzs�ben �rd ki azok �rt�keit! A
 * met�dush�v�skor most adj �t az argumentumok t�pusainak megfelel� objektumokat
 * (a primit�v t�pusokat be kell csomagolni)!
 */

class EasyClass {
    public static void addPrint(int a, int b) {
        System.out.format("%d + %d = %d", a, b, a + b);
    }
}

public class ReflectionStaticMethod {

    public static void main(String[] args) {
        Class<EasyClass> myClass = EasyClass.class;

        try {
            myClass.getDeclaredMethod("addPrint", int.class, int.class).invoke(null, 10, 11);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
                | SecurityException e) {
            e.printStackTrace();
        }

    }
}
