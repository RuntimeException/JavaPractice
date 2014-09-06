package feladatsor06.feladat03_to_04;

import java.util.ArrayList;

public class ReflectionInheritanceDiscovery {

    static void discover(Class<?> firstClass) {
        Class<?> superClass = firstClass;

        System.out.println(firstClass.getName());

        while ((superClass = superClass.getSuperclass()) != null) {
            System.out.println(superClass.getName());
        }
    }

    static void discoverReverse(Class<?> derivedClass) {

        if (derivedClass != null) {
            discoverReverse(derivedClass.getSuperclass());
            System.out.println(derivedClass.getName());
        }
    }

    public static void main(String[] args) {
        discover(ArrayList.class);
        discoverReverse(ArrayList.class);
    }
}
