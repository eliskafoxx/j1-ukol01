package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

import static java.awt.Color.*;

public class HlavniProgram {

    public void start() {
    }


    private static void Barak() {
        Turtle zofka = new Turtle();
        zofka.setPenColor(black);
        zofka.setLocation(100,450);

        zofka.turnRight(180);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(90);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(90);
        zofka.turnRight(135);
        zofka.move(65);
        zofka.turnRight(90);
        zofka.move(65);


        //for (int i = 0; i < 5; i++) {}

    }
    private static void NakresliPrasatko () {
            Turtle zofka = new Turtle();
            zofka.setPenColor(pink);
            zofka.setLocation(600, 500);

            //nozka
            zofka.turnRight(210);
            zofka.move(30);
            zofka.turnRight(180);
            zofka.move(30);
            zofka.turnRight(120);
            zofka.move(30);
            zofka.turnRight(180);
            zofka.move(30);

            //hlava
            zofka.turnRight(30);
            zofka.move(90);
            zofka.turnLeft(135);
            zofka.move(65);
            zofka.turnLeft(90);
            zofka.move(65);

            //druha nozka
            zofka.turnLeft(45);
            zofka.move(150);
            zofka.turnRight(120);
            zofka.move(30);
            zofka.turnRight(180);
            zofka.move(30);
            zofka.turnRight(120);
            zofka.move(30);
            zofka.turnRight(180);
            zofka.move(30);

            zofka.turnRight(30);
            zofka.move(90);
            zofka.turnLeft(90);
            zofka.move(150);
        }



    private static void Stopka() {
        Turtle zofka = new Turtle();
        zofka.setLocation(250, 250);
        zofka.setPenColor(red);

        for (int i = 0; i < 8; i++) {
            zofka.turnRight(45);
            zofka.move(45);
        }
    }

    private static void Kruh() {
        Turtle zofka = new Turtle();
       zofka.setLocation(700,350);

        for (int i = 0; i < 72; i++) {
            zofka.move(3);
            zofka.turnRight(5);
        }
    }

    private static void Slunce() {
        Turtle zofka = new Turtle();
        zofka.setPenColor(orange);
        zofka.setLocation(100, 150);


        for (int i = 0; i < 12; i++) {

            for (int y = 0; y < 3; y++) {
                zofka.move(15);
                zofka.turnRight(10);
            }
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.turnLeft(180);
            zofka.move(30);
            zofka.turnLeft(90);
        }

    }


    public static void main(String[] args) {
        new HlavniProgram().NakresliPrasatko();
    }
}

