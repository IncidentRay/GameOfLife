package org.example;
import java.util.Scanner;

public class Spielbrett {

    static int größe;

    public static int[][] generateSpielbrett() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie groß soll das Spielbrett sein?");
        größe = scanner.nextInt();
        int[][] brett = new int[größe][größe];
        return brett;
    }

    public static int[][] generateDuplicateBrett(int [][] spielbrett) {
        int[][] brett = new int[getGröße(spielbrett)][getGröße(spielbrett)];
        return brett;
    }

    public static int[][] defaultSpielbrett(){
        int [][] defaultBrett = new int[10][10];
        defaultBrett[2][3] = 1;
        defaultBrett[2][4] = 1;
        defaultBrett[2][5] = 1;
        defaultBrett[3][4] = 1;
        defaultBrett[3][5] = 1;
        defaultBrett[4][5] = 1;
        return defaultBrett;
    }

    public static void printSpielbrett(int[][] spielbrett) {
        for (int zeile = 0; zeile < spielbrett.length; zeile++) {
            for (int spalte = 0; spalte < spielbrett.length; spalte++) {

                if (spielbrett[zeile][spalte] == 1) {
                    System.out.print("\uD83D\uDC7D" + "\t");
                } else {
                    System.out.print("☠\uFE0F" + "\t");
                }
            }
            System.out.println();
        }}

    public static void fillSpielbrett(int[][] spielbrett){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele lebende Zelle wollen sie einrtagen?");
        int numZellen = scanner.nextInt();

        if (numZellen <= größe * größe && numZellen >= 0) {
            for (int i = 1; i < numZellen+1; i++) {
                System.out.println("(Lebende Zelle #" + i + ") In welcher Zeile möchten sie die 1 setzten?");
                int zeile = scanner.nextInt();
                System.out.println("(Lebende Zelle #" + i + ") In welcher Spalte möchten sie die 1 setzten?");
                int spalte = scanner.nextInt();
                spielbrett[zeile - 1][spalte - 1] = 1;
            }
        }
        else {
            System.out.println("Ungültige Eingabe! Try Again!");
            fillSpielbrett(spielbrett);
        }
    }

    public static int getGröße (int[][] spielbrett){
        int größe;
        größe = spielbrett.length;
        return größe;
    }
}




