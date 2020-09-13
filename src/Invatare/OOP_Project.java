package Invatare;

import java.util.Scanner;

public class OOP_Project {
    public String name_monster;//Sa avem cat mai putine campuri publice posibile!!
    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int positionI = 0;
    private int positionJ = 1;
    private boolean alive = true;


    public static void main(String[] args) {
        OOP_Project Monster = new OOP_Project();
    }

    public OOP_Project() {
    }

    public OOP_Project(int health) { //asta
        this.health = health;//sintaxa asta
    }

    public OOP_Project(int health, int attack) {
        this(health);
        this.attack = attack;
    }

    public OOP_Project(int health, int attack, int movement) {
        this(health, attack);
        this.movement = movement;
    }

    public void atribuire_atribute(int health, int attack, int movement) {
        this.health = health;
        this.attack = attack;
        this.movement = movement;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getMovement() {
        return movement;
    }

    public void decreasePosI(int x) {
        positionI = positionI - x;
    }

    public void decreasePosJ(int x) {
        positionJ = positionJ - x;
    }

    public void increasePosI(int x) {
        positionI = positionI + x;
    }

    public void increasePosj(int x) {
        positionJ = positionJ + x;
    }

    public int getPositionI() {
        return positionI;
    }

    public int getPositionJ() {
        return positionJ;
    }

    public void ChangePositionI(int positionI) {
        this.positionI = positionI;
    }

    public void ChangePositionJ(int positionJ) {
        this.positionJ = positionJ;
    }

}


