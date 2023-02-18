package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

import static java.awt.Color.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

    }
    public void NakresliPrasatko() {
        Turtle zofka = new Turtle();
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
    public void Stopka() {
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

        public void Kruh() {
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

    public void Slunce() {
        Turtle zofka = new Turtle();
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.penDown();
        zofka.setPenColor(yellow);

        for (int i = 0; i < 18; i++) {
            zofka.move(15);
            zofka.turnRight(20);

        }

    }

    public void Barak() {
        Turtle zofka = new Turtle();

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(125);
        zofka.penDown();
        zofka.setPenColor(black);
        zofka.penDown();

        //barak
        zofka.turnRight(180);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(90);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(90);
        zofka.turnLeft(135);
        zofka.move(65);
        zofka.turnLeft(90);
        zofka.move(65);




    }

    public static void main(String[] args) {
        new HlavniProgram().Barak();
    }




}
