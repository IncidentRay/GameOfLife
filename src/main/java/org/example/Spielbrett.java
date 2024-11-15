package org.example;
import java.util.Scanner;

public class Spielbrett {

    public static int[][] generateSpielbrett() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie groß soll das Spielbrett sein?");
        int größe = scanner.nextInt();
        final int[][] brett = new int[größe][größe];
        return brett;
    }

    public static int[][] generateDuplicateBrett(int [][] spielbrett) {
        final int[][] brett = new int[getGröße(spielbrett)][getGröße(spielbrett)];
        return brett;
    }

    public static int[][] defaulfSpielbrett(){
        int [][] defaultBrett = generateSpielbrett();
        defaultBrett[2][3] = 1;
        defaultBrett[2][4] = 1;
        defaultBrett[2][5] = 1;
        defaultBrett[3][4] = 1;
        defaultBrett[3][5] = 1;
        defaultBrett[4][5] = 1;
        return defaultBrett;
    }

    public static void printSpielbrett(int spielbrett[][])
    {
        for (int zeile = 0; zeile < spielbrett.length; zeile++)
        {
            for (int spalte = 0; spalte < spielbrett.length; spalte++)
            {
                System.out.print( spielbrett[zeile][spalte]  + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] fillSpielbrett(int spielbrett[][]){
        int l =1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele lebende Zelle wollen sie einrtagen?");
        int numZellen = scanner.nextInt();
            for (int i = 0; i < numZellen; i++) {
                System.out.println("(Lebende Zelle #"+ i+1 +") In welcher Zeile möchten sie die 1 setzten?");
                int zeile = scanner.nextInt();
                System.out.println("(Lebende Zelle #"+ i+1 +") In welcher Spalte möchten sie die 1 setzten?");
                int spalte = scanner.nextInt();
                spielbrett[spalte - 1][zeile - 1] = 1;
            }
        return spielbrett;
    }

    public static int getGröße (int[][] spielbrett){
        int größe;
        größe = spielbrett.length;

        return größe;
    }
}




