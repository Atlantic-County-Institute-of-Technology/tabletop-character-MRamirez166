/*
Martin Ramirez
March 27 2025
*/
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");
    }
    //super class character containing attributes for level and name.
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
        protected ArrayList<String> labels = new ArrayList<String>();
        labels.add(0, "label 1");
        labels.add(1, "label 2");

        public Character(int level, String name, int hit_points, int str, int dex, int con, int intelligence, int wis, int rizz, int armor){
            this.level = level;
            this.name = name;
            this.hit_points = hit_points;
            this.str = str;
            this.dex = dex;
            this.con = con;
            this.intelligence = intelligence;
            this.wis = wis;
            this.rizz = rizz;
            this.armor = armor;

        }
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
        }
        //
        public void roll(){
            Random rand = new Random();
        }
    }
    class Barbarian extends Character{
        private int rage;

        public Barbarian(){
            super(level, name, hit_points, str, dex, con, intelligence, wis, rizz, armor);
            this.rage = rage;
        }

    }

}