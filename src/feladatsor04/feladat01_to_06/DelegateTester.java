package feladatsor04.feladat01_to_06;

/**
 * 1. Készítsen egy osztályt, amelyet fa struktúrába lehet rendezni
 * (konstruktorban az õsét meg lehet adni)! Az osztály definiáljon egy metódust
 * (doDelegate()), amely kiír valamit a konzolra!
 * 
 * 2. Példányosítson néhányat az osztályból úgy, hogy az objektumok fa
 * struktúrába rendezõdjenek! A gyökér õse a struktúrában a null referencia.
 * 
 * 3. A doDelegate metódus valósítsa meg az osztálybetöltéskor ismertetett
 * delegáció elvet, azaz mielõtt a "feldolgozást" (jelen esetben konzolra írás)
 * elvégezné, hívja meg az õsének doDelegate metódusát!
 * 
 * 4. Készítsen interfészt, amely tartalmazza a doDelegate metódus
 * deklarációját! Az osztály valósítsa meg ezt az intefészt!
 * 
 * 5. Hozzon létre további legalább két osztályt, amelyek ugyanúgy megvalósítják
 * az interfészt és a metódus hívásakor a delegációt, de mást írnak ki a
 * konzolra!
 * 
 * 6. A már létezõ fa struktúrát egészítse ki az újonnan létrehozott osztályok
 * példányaival és indítson doDelegate hívásokat a struktúra különbözõ
 * pontjaiból!
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
