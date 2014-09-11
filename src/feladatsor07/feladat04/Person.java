package feladatsor07.feladat04;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 4. Készíts saját osztályt, amely rendelkezik valamilyen belső állapottal.
 * Hozz létre tömböt, amely ezen osztály példányaiból tartalmaz néhányat. Az
 * Arrays.sort segítségével rendezd meg a tömböt, majd írd ki az eredményt a
 * konzolra (toString felüldefiniálás)! Az osztályon ne felejtsd el
 * megvalósítani a Comparable<Osztálynév> interfészt! A Comparable
 * megvalósításakor vedd figyelembe a belső állapotot, az befolyásolja a
 * sorrendet!
 */

public class Person implements Comparable<Person> {

    public Person(String name, Calendar birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    String name;
    Calendar birthDate;

    @Override
    public String toString() {
        return "[" + name + " " + String.format("%1$tY. %1$tm. %1$td.", birthDate) + "]";
    }

    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }

    public static void main(String[] args) {
        Person[] personList = new Person[5];
        personList[0] = new Person("Tony Stark", new GregorianCalendar(1984, 3, 2));
        personList[1] = new Person("Hulk", new GregorianCalendar(1977, 9, 11));
        personList[2] = new Person("Black Widow", new GregorianCalendar(1991, 1, 30));
        personList[3] = new Person("Hawk Eye", new GregorianCalendar(1983, 12, 13));
        personList[4] = new Person("Captain America", new GregorianCalendar(1925, 7, 6));

        System.out.println("Before:");
        for (int i = 0; i < personList.length; i++) {
            System.out.println(personList[i].toString());
        }
        Arrays.sort(personList);
        System.out.println("After:");
        for (int i = 0; i < personList.length; i++) {
            System.out.println(personList[i].toString());
        }
    }

}
