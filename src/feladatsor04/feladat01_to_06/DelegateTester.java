package feladatsor04.feladat01_to_06;

/**
 * 1. K�sz�tsen egy oszt�lyt, amelyet fa strukt�r�ba lehet rendezni
 * (konstruktorban az �s�t meg lehet adni)! Az oszt�ly defini�ljon egy met�dust
 * (doDelegate()), amely ki�r valamit a konzolra!
 * 
 * 2. P�ld�nyos�tson n�h�nyat az oszt�lyb�l �gy, hogy az objektumok fa
 * strukt�r�ba rendez�djenek! A gy�k�r �se a strukt�r�ban a null referencia.
 * 
 * 3. A doDelegate met�dus val�s�tsa meg az oszt�lybet�lt�skor ismertetett
 * deleg�ci� elvet, azaz miel�tt a "feldolgoz�st" (jelen esetben konzolra �r�s)
 * elv�gezn�, h�vja meg az �s�nek doDelegate met�dus�t!
 * 
 * 4. K�sz�tsen interf�szt, amely tartalmazza a doDelegate met�dus
 * deklar�ci�j�t! Az oszt�ly val�s�tsa meg ezt az intef�szt!
 * 
 * 5. Hozzon l�tre tov�bbi legal�bb k�t oszt�lyt, amelyek ugyan�gy megval�s�tj�k
 * az interf�szt �s a met�dus h�v�sakor a deleg�ci�t, de m�st �rnak ki a
 * konzolra!
 * 
 * 6. A m�r l�tez� fa strukt�r�t eg�sz�tse ki az �jonnan l�trehozott oszt�lyok
 * p�ld�nyaival �s ind�tson doDelegate h�v�sokat a strukt�ra k�l�nb�z�
 * pontjaib�l!
 */

interface Delegatable {
    public abstract void doDelegate();

    public abstract int getLevel();
}

class CowDelegate implements Delegatable {

    public final static String name = "Cow";
    public Delegatable parent;
    public int level;

    public CowDelegate(Delegatable parent) {
        super();
        this.parent = parent;
        if (parent == null) {
            level = 0;
        } else {
            this.level = parent.getLevel() + 1;
        }
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void doDelegate() {
        if (parent != null) {
            parent.doDelegate();
        }
        System.out.println("I am a " + name + " at level " + level + ".");
    }
}

class DogDelegate implements Delegatable {

    public final static String name = "Dog";
    public Delegatable parent;
    public int level;

    public DogDelegate(Delegatable parent) {
        super();
        this.parent = parent;
        if (parent == null) {
            level = 0;
        } else {
            this.level = parent.getLevel() + 1;
        }
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void doDelegate() {
        if (parent != null) {
            parent.doDelegate();
        }
        System.out.println("I am a " + name + " at level " + level + ".");
    }
}

public class DelegateTester {
    public static void main(String[] args) {
        Delegatable[] delegTree = new Delegatable[5];
        delegTree[0] = new CowDelegate(null);
        delegTree[1] = new DogDelegate(delegTree[0]);
        delegTree[2] = new CowDelegate(delegTree[1]);
        delegTree[3] = new CowDelegate(delegTree[2]);
        delegTree[4] = new DogDelegate(delegTree[3]);

        delegTree[4].doDelegate();
    }
}
