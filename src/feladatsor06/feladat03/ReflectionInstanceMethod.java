package feladatsor06.feladat03;

import java.lang.reflect.InvocationTargetException;

/** 3. 1. és 2. feladat példánymetódussal. */

class EasyClass {

    public int invocationNumber = 0;

    public void addPrint(int a, int b) {
        invocationNumber++;
        System.out.format("%d + %d = %d\n", a, b, a + b);
    }
}

public class ReflectionInstanceMethod {

    public static void main(String[] args) {
        EasyClass myObj1 = new EasyClass();
        EasyClass myObj2 = new EasyClass();

        Class<EasyClass> myClass = EasyClass.class;

        try {
            myClass.getDeclaredMethod("addPrint", int.class, int.class).invoke(myObj1, 10, 11);
            myClass.getDeclaredMethod("addPrint", int.class, int.class).invoke(myObj2, 7, 8);
            myClass.getDeclaredMethod("addPrint", int.class, int.class).invoke(myObj1, 3, 6);

            System.out.println("Number of method call on myObj1: " + myObj1.invocationNumber);
            System.out.println("Number of method call on myObj2: " + myObj2.invocationNumber);

        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
                | SecurityException e) {
            e.printStackTrace();
        }

    }
}