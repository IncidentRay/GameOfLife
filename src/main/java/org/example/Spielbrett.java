package org.example;
import java.util.Scanner;

public class Spielbrett {

    static int größe;

    public static Zelle[][] generateSpielbrett() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie groß soll das Spielbrett sein?");
        größe = scanner.nextInt();
        Zelle[][] brett = new Zelle[größe][größe];
        return brett;
    }

    public static Zelle[][] generateDuplicateBrett(Zelle [][] spielbrett) {
        Zelle[][] brett = new Zelle[getGröße(spielbrett)][getGröße(spielbrett)];

        for (int zeile = 0; zeile < brett.length; zeile++) {
            for (int spalte = 0; spalte < brett.length; spalte++) {
                brett[zeile][spalte] = ToteZelle.generateToteZelle();
            }}

        return brett;}

    public static Zelle[][] defaultSpielbrett(){
        Zelle[][] defaultBrett = new Zelle[10][10];

        for (int zeile = 0; zeile < defaultBrett.length; zeile++) {
            for (int spalte = 0; spalte < defaultBrett.length; spalte++) {
              defaultBrett[zeile][spalte] = ToteZelle.generateToteZelle();
            }}

        defaultBrett[2][3] = LebendeZelle.generateLebendeZelle();
        defaultBrett[2][4] = LebendeZelle.generateLebendeZelle();
        defaultBrett[2][5] = LebendeZelle.generateLebendeZelle();
        defaultBrett[3][4] = LebendeZelle.generateLebendeZelle();
        defaultBrett[4][4] = LebendeZelle.generateLebendeZelle();
        defaultBrett[4][5] = LebendeZelle.generateLebendeZelle();
        defaultBrett[5][5] = LebendeZelle.generateLebendeZelle();
        defaultBrett[4][6] = LebendeZelle.generateLebendeZelle();
        return defaultBrett;}

    public static void printSpielbrett(Zelle[][] spielbrett) {
        for (int zeile = 0; zeile < spielbrett.length; zeile++) {
            for (int spalte = 0; spalte < spielbrett.length; spalte++) {

                if (spielbrett[zeile][spalte].heartbeat()) {
                    System.out.print("\uD83D\uDC7D" + "\t");
                } else {
                    System.out.print("☠\uFE0F" + "\t");
                }
            }
            System.out.println();}}

    public static void fillSpielbrett(Zelle[][] spielbrett){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele lebende Zelle wollen sie einrtagen?");
        int numZellen = scanner.nextInt();

        if (numZellen <= größe * größe && numZellen >= 0) {
            for (int i = 1; i < numZellen+1; i++) {
                System.out.println("(Lebende Zelle #" + i + ") In welcher Zeile möchten sie die 1 setzten?");
                int zeile = scanner.nextInt();
                System.out.println("(Lebende Zelle #" + i + ") In welcher Spalte möchten sie die 1 setzten?");
                int spalte = scanner.nextInt();
                spielbrett[zeile - 1][spalte - 1] = LebendeZelle.generateLebendeZelle();
            }
        }
        else {
            System.out.println("Ungültige Eingabe! Try Again!");
            fillSpielbrett(spielbrett);
        }}

    public static int getGröße (Zelle[][] spielbrett){
        int größe;
        größe = spielbrett.length;
        return größe;
    }

    interface Zelle {
        boolean heartbeat ();
    }
}




