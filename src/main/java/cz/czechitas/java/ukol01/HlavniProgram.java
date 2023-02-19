package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

import static java.awt.Color.*;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        zofka.setLocation(600, 500);
        zofka.setPenColor((pink));
        this.NakresliPrasatko(zofka);

        /*
        zofka.setLocation(300, 105);
        zofka.setPenColor(red);
        this.Stopka(zofka);


        zofka.setPenColor(blue);
        zofka.setLocation(600,100);
        this.Kruh(zofka);
        */

        zofka.setPenColor(orange);
        zofka.setLocation(100, 75);
        this.Slunce(zofka);


        zofka.setPenColor(black);
        zofka.setLocation(100,450);
        this.Barak(zofka);

        zofka.setLocation(1215,450);
        this.Barak(zofka);

        zofka.setLocation(100,200);
        for (int i = 0; i < 5; i++) {
            this.Barak(zofka);
            zofka.penUp();
            zofka.turnRight(90);
            zofka.move(185);
            zofka.turnLeft(90);
            zofka.penDown();
        }

        zofka.setPenColor(darkGray);
        zofka.setLocation(100, 850);
        this.PismenoE(zofka);


        zofka.setLocation(250, 850);
        this.PismenoL(zofka);

        zofka.setLocation(400, 850);
        this.PismenoI(zofka);

        zofka.setLocation(550, 760);
        this.PismenoS(zofka);

        zofka.setLocation(700, 850);
        this.PismenoK(zofka);

        zofka.setLocation(850, 850);
        this.PismenoA(zofka);

    }


    private static void Barak(Turtle zofka) {

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
        zofka.turnLeft(135);


    }
    private static void NakresliPrasatko (Turtle zofka) {

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
            zofka.turnRight(90);
        }



    private static void Stopka (Turtle zofka) {

        for (int i = 0; i < 8; i++) {
            zofka.turnRight(45);
            zofka.move(45);
        }
    }

    private static void Kruh (Turtle zofka) {

        for (int i = 0; i < 72; i++) {
            zofka.move(3);
            zofka.turnRight(5);
        }
    }

    private static void Slunce(Turtle zofka) {

        for (int i = 0; i < 12; i++) {

            for (int y = 0; y < 3; y++) {
                zofka.move(5);
                zofka.turnRight(10);
            }
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.turnLeft(180);
            zofka.move(30);
            zofka.turnLeft(90);
        }

    }

    private static void PismenoE(Turtle zofka) {

        zofka.turnRight(90);
        zofka.move(90);
        zofka.turnLeft(180);
        zofka.move(90);
        zofka.turnRight(90);
        zofka.move(90);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnLeft(180);
        zofka.move(60);
        zofka.turnRight(90);
        zofka.move(90);
        zofka.turnRight(90);
        zofka.move(90);
        zofka.turnLeft(90);

    }

    private static void PismenoL(Turtle zofka) {
        zofka.move(180);
        zofka.turnRight(180);
        zofka.move(180);
        zofka.turnLeft(90);
        zofka.move(90);
        zofka.turnLeft(90);
    }

    private static void PismenoI(Turtle zofka) {
        zofka.move(180);
        zofka.turnRight(180);
        zofka.move(180);
        zofka.turnRight(180);
    }


    private static void PismenoS(Turtle zofka) {

        zofka.turnRight(90);
        zofka.penUp();
        for (int j = 0; j < 9; j++) {
            zofka.move(8);zofka.turnLeft(10);
        }
        zofka.penDown();
            for (int s = 0; s < 27; s++) {
                zofka.move(8);zofka.turnLeft(10);
            }
            for (int v = 0; v < 27; v++) {
                zofka.move(8);zofka.turnRight(10);
            }
            zofka.penUp();
                for (int i = 0; i < 9; i++)
                {zofka.move(8);zofka.turnRight(10);
                }
                zofka.turnLeft(90);
                zofka.penDown();
                zofka.setLocation(550,650);
                zofka.turnRight(45);
                zofka.move(50);
                zofka.turnLeft(180);
                zofka.move(50);
                zofka.turnRight(90);
                zofka.move(50);
                zofka.turnRight(180);
                zofka.move(50);
                zofka.turnLeft(135);

    }

    private static void PismenoK(Turtle zofka) {
        zofka.move(180);
        zofka.turnRight(180);
        zofka.move(90);
        zofka.turnLeft(135);
        zofka.move(125);
        zofka.turnLeft(180);
        zofka.move(125);
        zofka.turnLeft(35);
        zofka.move(125);
    }

    private static void PismenoA (Turtle zofka) {
        zofka.turnRight(45);
        zofka.move(180);
        zofka.turnRight(45);
        zofka.move(180);
    }
    public static void main(String[] args) {
        new HlavniProgram().start();
    }
}

