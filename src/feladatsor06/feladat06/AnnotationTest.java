package feladatsor06.feladat06;

import java.lang.reflect.Method;

/**
 * 6. Készíts egy annotációt, amely egy String-et képes tárolni! Helyezd el egy
 * osztály metódusain (legalább kettõn), és tegyél még mellé olyan metódusokat
 * is, amelyek nincsenek ellátva annotációval (void visszatérési érték, üres
 * törzs). Szûrd ki az osztály azon metódusait, amelyeken van annotáció, majd
 * írja ki az annotációkban tárolt értékeket!
 * 
 * Annotációk készítése: - a fájlnév megegyezik az annotáció nevével - public @interface
 * <annotáció_neve> {} - az annotációra el kell helyezni egy másik annotációt
 * :), ez azt jelöli, hogy futásidõben is szeretnénk elérni a benne tárolt
 * információt:
 * 
 * @Retention(RetentionPolicy.RUNTIME)
 */

class MilitaryController {

    private int nuclearRocketNum;

    public MilitaryController(int nuclearRocketNum) {
        this.nuclearRocketNum = nuclearRocketNum;
    }

    @AccessInfo(requiredPrivilege = Privilege.ADMIN, logInfo = "Nuclear missile launch request")
    public boolean launchRocket(String target) {
        if (nuclearRocketNum > 0) {
            nuclearRocketNum--;
            return true;
        } else {
            return false;
        }

    }

    public int getNuclearRocketNum() {
        return nuclearRocketNum;
    }

    @AccessInfo(requiredPrivilege = Privilege.ADMIN, logInfo = "Nuclear missile storage.")
    void storeNuclearRocket(int num) {
        if (num > 0) {
            nuclearRocketNum += num;
        } else {

        }
    }

}

public class AnnotationTest {

    public static void main(String[] args) {
        Class<MilitaryController> mcClass = MilitaryController.class;

        for (Method m : mcClass.getDeclaredMethods()) {
            System.out.println("Method name: " + m.getName());
            AccessInfo a = m.getAnnotation(AccessInfo.class);
            if (a != null) {
                System.out.println("\tAnnotation name: " + a.annotationType().getName());
                System.out.println("\trequiredPrivilege: " + a.requiredPrivilege());
                System.out.println("\tlogInfo: " + a.logInfo());
            }
            /*
             * Annotation[] aList = m.getAnnotations(); for (Annotation a :
             * aList) { System.out.println(a.annotationType().getName()); if(a
             * instanceof ) }
             */
        }
    }
}
