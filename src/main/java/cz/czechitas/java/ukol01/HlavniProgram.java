package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

import static java.awt.Color.*;

public class HlavniProgram {

    public void start() {
    }

        private static void NakresliPrasatko (Turtle zofka) {
            zofka.setPenColor(pink);
            zofka.penUp();
            zofka.turnLeft(90);
            zofka.move(75);
            zofka.turnRight(90);
            zofka.penDown();
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
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(400);
        zofka.penDown();
        zofka.setPenColor(red);

        for (int i = 0; i < 8; i++) {
            zofka.turnRight(45);
            zofka.move(45);
        }
    }

    private static void Kruh() {
        Turtle zofka = new Turtle();
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.penDown();

        for (int i = 0; i < 72; i++) {
            zofka.move(3);
            zofka.turnRight(5);
        }
    }

    private static void Slunce() {
        Turtle zofka = new Turtle();

        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.penDown();
        zofka.setPenColor(orange);


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

    private static void Barak() {
        Turtle zofka = new Turtle();
        zofka.setPenColor(black);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(250);
        zofka.turnRight(90);
        zofka.move(90);
        zofka.penDown();
        zofka.turnRight(180);


        //barak

        for (int i = 0; i < 5; i++) {
            zofka.move(130);
            zofka.turnRight(90);
            zofka.move(90);
            zofka.turnRight(90);
            zofka.move(130);
            zofka.turnRight(90);
            zofka.move(90);
            zofka.turnLeft(135);
            zofka.move(65);
            zofka.turnLeft(90);
            zofka.move(65);
            zofka.turnRight(225);
            zofka.penUp();
            zofka.move(340);
            zofka.turnRight(90);
            zofka.penDown();

        }

    }

    public static void main(String[] args) {
        new HlavniProgram().Slunce();
    }
}

