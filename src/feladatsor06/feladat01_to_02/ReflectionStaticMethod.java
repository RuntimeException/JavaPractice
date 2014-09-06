package feladatsor06.feladat01_to_02;

import java.lang.reflect.InvocationTargetException;

/**
 * 1. Hozz létre egy osztály egy statikus metódussal. Szerezz referenciát a
 * Class objektumra, amely ezt az osztályt reprezentálja! Reflection
 * segítségével hívd meg a statikus metódust!
 * 
 * 2. Adj arumentumokat a metódushoz, a törzsében írd ki azok értékeit! A
 * metódushíváskor most adj át az argumentumok típusainak megfelelõ objektumokat
 * (a primitív típusokat be kell csomagolni)!
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
