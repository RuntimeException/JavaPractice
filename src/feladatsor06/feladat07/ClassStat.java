package feladatsor06.feladat07;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 7. Egy beépített osztályról készíts statisztikát! - Sorold fel az osztályon
 * elérhetõ public, protected és private láthatóságú metódusokat! - Számold
 * össze az osztályban deklarált statikus és példánymetódusokat!
 */

public class ClassStat {

    public static void main(String[] args) {
        ArrayList<Method> methodList = new ArrayList<Method>(10);
        Map<String, Set<Method>> categorizedMethods;

        discover(ArrayList.class, methodList);

        categorizedMethods = processMethods(methodList);

        printCategorizedMethods(categorizedMethods);
    }

    public static void printCategorizedMethods(Map<String, Set<Method>> categorizedMethods) {
        for (Map.Entry<String, Set<Method>> entry : categorizedMethods.entrySet()) {
            System.out.println(entry.getKey() + " methods");
            for (Method method : entry.getValue()) {
                System.out.println("\t" + method.getName());
            }
        }
    }

    static void discover(Class<?> firstClass, List<Method> methodList) {
        Class<?> superClass = firstClass;

        methodList.addAll(Arrays.asList(firstClass.getDeclaredMethods()));

        while ((superClass = superClass.getSuperclass()) != null) {
            methodList.addAll(Arrays.asList(firstClass.getDeclaredMethods()));
        }
    }

    public static Map<String, Set<Method>> processMethods(List<Method> methodList) {
        HashSet<Method> staticMethodSet = new HashSet<Method>();
        HashSet<Method> instanceMethodSet = new HashSet<Method>();
        HashSet<Method> publicMethodSet = new HashSet<Method>();
        HashSet<Method> protectedMethodSet = new HashSet<Method>();
        HashSet<Method> privateMethodSet = new HashSet<Method>();

        HashMap<String, Set<Method>> categorizedMethods = new HashMap<String, Set<Method>>();
        categorizedMethods.put("static", staticMethodSet);
        categorizedMethods.put("instance", instanceMethodSet);
        categorizedMethods.put("public", publicMethodSet);
        categorizedMethods.put("protected", protectedMethodSet);
        categorizedMethods.put("private", privateMethodSet);

        for (Iterator<Method> iterator = methodList.iterator(); iterator.hasNext();) {
            Method method = (Method) iterator.next();
            int modifiers = method.getModifiers();

            if (Modifier.isStatic(modifiers)) {
                staticMethodSet.add(method);
            } else {
                instanceMethodSet.add(method);
            }

            switch (modifiers) {
            case Modifier.PRIVATE:
                privateMethodSet.add(method);
                break;
            case Modifier.PUBLIC:
                publicMethodSet.add(method);
                break;
            case Modifier.PROTECTED:
                protectedMethodSet.add(method);
                break;
            }
        }

        return categorizedMethods;
    }
}
