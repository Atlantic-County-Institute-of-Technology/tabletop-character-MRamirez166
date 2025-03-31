/*
Martin Ramirez.
March 27, 2025.
Finished: March 31, 2025.
Purpose:Create a program like D&D using super class.
*/
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Character c1 = new Character();
        Barbarian b1 = new Barbarian(1, "Jordan");

        //System.out.print(c1);
        System.out.print(b1);
    }

//Super class character containing attributes for character.
}
class Character{
    protected int level;
    protected String name;
    protected int hit_points;
    protected int str;
    protected int dex;
    protected int con;
    protected int intelligence;
    protected int wis;
    protected int rizz;
    protected int armor;
    protected ArrayList<String> labels;

/*
-Resolves naming conflicts (this.).
-Other attributes equal to roll() meaning a random number between 1-13 will be displayed.
 */
    public Character(int level, String name){
        this.level = level;
        this.name = name;
        this.hit_points = roll();
        this.str = roll();
        this.dex = roll();
        this.con = roll();
        this.intelligence = roll();
        this.wis = roll();
        this.rizz = roll();
        this.armor = roll();
        this.labels = new ArrayList<String>();
    }

//Default values for character Human.
    public Character(){
        this.level = 1;
        this.name = "Human";
        this.hit_points = 3;
        this.str = 2;
        this.dex = 1;
        this.con = 5;
        this.intelligence = 6;
        this.wis = 7;
        this.rizz = 8;
        this.armor = 9;
        this.labels = new ArrayList<String>();
    }

    //Rolls a random number 1-13.
    public int roll(){
        int randomNumber = (int)(Math.random()* 14) + 3;
        return randomNumber;
    }

    //Adds labels to characters.
    public void features(String feat){
        labels.add(feat);
    }

//Used to display the attributes of characters and their values.
    public String toString() {
        return "Character:{" +
                "level:" + level +
                ", | name:'" + name + '\'' +
                ", HP:" + hit_points +
                ", AC:" + armor +
                ", | \nSTR:" + str +
                ", | DEX:" + dex +
                ", | CON:" + con +
                ", |\n INT: " + intelligence +
                ", | WIS: " + wis +
                ", | CHA:" + rizz +
                ", |\n FEATS:" + labels +
                '}';
    }
}

/*
-Another character, Barbarian with additional feats (Rage & Unarmored Defense).
-Barbarians also have increased strength & constitution compared to Human.
 */
class Barbarian extends Character{

    public Barbarian(int level, String name){
        super(level, name);
        str += 2;
        con += 1;
        features("Rage");
        features("Unarmored Defense");
    }
}