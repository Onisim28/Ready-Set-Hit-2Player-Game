package Invatare;

import java.util.Scanner;

public class Map {
    static private final char vertical_line = '|', asterix = '*';
    static private char[][] MAPGAME = {{vertical_line, asterix, vertical_line, vertical_line, asterix, vertical_line, vertical_line,
            asterix, vertical_line},
            {vertical_line, asterix, vertical_line, vertical_line, asterix, vertical_line, vertical_line,
                    asterix, vertical_line},
            {vertical_line, asterix, vertical_line, vertical_line, asterix, vertical_line, vertical_line,
                    asterix, vertical_line}};

    //  private final int i=MAPGAME.length;
    //  private final int j=MAPGAME[0].length;
    private int copiere_Poz_M1_I;
    private int copiere_Poz_M1_J;
    private int copiere_Poz_M2_I;
    private int copiere_Poz_M2_J;
    public boolean touch_Monster1;

    Scanner citire = new Scanner(System.in);


    public static void main(String[] args) {
        Map obj = new Map();
        OOP_Project Monster1 = new OOP_Project();
        OOP_Project Monster2 = new OOP_Project();
        Monster1.name_monster = "NANA";
        Monster2.name_monster = "BANA";

        Monster1.ChangePositionI(1);
        Monster1.ChangePositionJ(1);
        Monster2.ChangePositionI(1);
        Monster2.ChangePositionJ(7);

        obj.copiere_Poz_M1_I = Monster1.getPositionI();
        obj.copiere_Poz_M1_J = Monster1.getPositionJ();
        obj.copiere_Poz_M2_I = Monster2.getPositionI();
        obj.copiere_Poz_M2_J = Monster2.getPositionJ();

        while (true) {

            obj.draw_map(Monster1, Monster2);
            obj.get_two_monsters_objects(Monster1, Monster2);

        }
    }

    public void draw_map(OOP_Project Monster1, OOP_Project Monster2) {

        for (int i = 0; i < MAPGAME.length; i++) {
            System.out.println();
            for (int j = 0; j < MAPGAME[i].length; j++) {
                if ((Monster1.getPositionI() == Monster2.getPositionI()) &&
                        (Monster1.getPositionJ() == Monster2.getPositionJ()) && (touch_Monster1)) {
                    Monster2.ChangePositionI(copiere_Poz_M2_I);
                    Monster2.ChangePositionJ(copiere_Poz_M2_J);
                    MAPGAME[copiere_Poz_M2_I][copiere_Poz_M2_J] = Monster2.name_monster.charAt(0);

                } else if ((Monster2.getPositionI() == Monster1.getPositionI()) &&
                        (Monster2.getPositionJ() == Monster1.getPositionJ()) && (!touch_Monster1)) {

                    Monster1.ChangePositionI(copiere_Poz_M1_I);
                    Monster1.ChangePositionJ(copiere_Poz_M1_J);
                    MAPGAME[copiere_Poz_M1_I][copiere_Poz_M1_J] = Monster1.name_monster.charAt(0);

                }

                if ((i == Monster1.getPositionI()) && (j == Monster1.getPositionJ()))
                    MAPGAME[i][j] = Monster1.name_monster.charAt(0);

                if ((i == Monster2.getPositionI()) && (j == Monster2.getPositionJ()))
                    MAPGAME[i][j] = Monster2.name_monster.charAt(0);
                System.out.print(MAPGAME[i][j]);
            }
        }
    }

    public void get_two_monsters_objects(OOP_Project Monster1, OOP_Project Monster2) {
        String ce_directie1;
        System.out.println("\nDirectia in care mergeti:");
        ce_directie1 = citire.nextLine();

        switch (ce_directie1) {
            case "w":
                MAPGAME[Monster1.getPositionI()][Monster1.getPositionJ()] = asterix;
                if (Monster1.getPositionI() >= 1)
                    Monster1.decreasePosI(1);
                break;

            case "a":
                MAPGAME[Monster1.getPositionI()][Monster1.getPositionJ()] = asterix;
                if (Monster1.getPositionJ() >= 4)
                    Monster1.decreasePosJ(3);
                break;

            case "d":
                MAPGAME[Monster1.getPositionI()][Monster1.getPositionJ()] = asterix;
                if (Monster1.getPositionJ() <= 4)
                    Monster1.increasePosj(3);
                break;

            case "s":
                MAPGAME[Monster1.getPositionI()][Monster1.getPositionJ()] = asterix;
                if (Monster1.getPositionI() <= 1)
                    Monster1.increasePosI(1);
                break;
        }
        touch_Monster1 = true;

        draw_map(Monster1, Monster2);


        String ce_directie2;
        System.out.println("\nDirectia in care mergeti:");
        ce_directie2 = citire.nextLine();

        switch (ce_directie2) {
            case "w":
                MAPGAME[Monster2.getPositionI()][Monster2.getPositionJ()] = asterix;
                if (Monster2.getPositionI() >= 1)
                    Monster2.decreasePosI(1);
                break;

            case "a":
                MAPGAME[Monster2.getPositionI()][Monster2.getPositionJ()] = asterix;
                if (Monster2.getPositionJ() >= 4)
                    Monster2.decreasePosJ(3);
                break;

            case "d":
                MAPGAME[Monster2.getPositionI()][Monster2.getPositionJ()] = asterix;
                if (Monster2.getPositionJ() <= 4)
                    Monster2.increasePosj(3);
                break;

            case "s":
                MAPGAME[Monster2.getPositionI()][Monster2.getPositionJ()] = asterix;
                if (Monster2.getPositionI() <= 1)
                    Monster2.increasePosI(1);
                break;
        }

        touch_Monster1 = false;

    }

}




