package feladatsor03.feladat01;

/**
 * 1. Val�s�tsd meg a toString() met�dust egy saj�t oszt�lyon �s "add �ssze"
 * (pl.: o=new Sajat(); String r=o+"abcd";) egy String-el! �rd ki az eredm�nyt a
 * konzolra, pl.: System.out.println(r);
 */

public class Ork {

    String name;
    int health;
    int armor;
    int mana;
    String damage;

    @Override
    public String toString() {
        String orkStr = "Name: " + name + "\n";
        orkStr += "Health: " + health + "\n";
        orkStr += "Armor: " + armor + "\n";
        orkStr += "Mana: " + mana + "\n";
        orkStr += "Damage: " + damage + "\n";
        return orkStr;
    }

    public Ork(String name, int health, int armor, int mana, String damage) {
        super();
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.mana = mana;
        this.damage = damage;
    }

    public static void main(String[] args) {
        Ork guldan = new Ork("Guldan", 2000, 10, 1000, "4d10 + 6");
        System.out.println(guldan.toString());
    }
}
