package feladatsor06.feladat06;

import java.lang.reflect.Method;

/**
 * 6. K�sz�ts egy annot�ci�t, amely egy String-et k�pes t�rolni! Helyezd el egy
 * oszt�ly met�dusain (legal�bb kett�n), �s tegy�l m�g mell� olyan met�dusokat
 * is, amelyek nincsenek ell�tva annot�ci�val (void visszat�r�si �rt�k, �res
 * t�rzs). Sz�rd ki az oszt�ly azon met�dusait, amelyeken van annot�ci�, majd
 * �rja ki az annot�ci�kban t�rolt �rt�keket!
 * 
 * Annot�ci�k k�sz�t�se: - a f�jln�v megegyezik az annot�ci� nev�vel - public @interface
 * <annot�ci�_neve> {} - az annot�ci�ra el kell helyezni egy m�sik annot�ci�t
 * :), ez azt jel�li, hogy fut�sid�ben is szeretn�nk el�rni a benne t�rolt
 * inform�ci�t:
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
