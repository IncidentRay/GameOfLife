package org.example;
import java.util.Scanner;

public class Spielbrett {

    public static int[][] generateSpielbrett() {
        final int[][] brett = new int[10][10];
        return brett;
    }

    public static void printSpielbrett(int spielbrett[][])
    {
        for (int zeile = 0; zeile < spielbrett.length; zeile++)
        {
            for (int spalte = 0; spalte < spielbrett[zeile].length; spalte++)
            {
                System.out.print( spielbrett[zeile][spalte]  + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] fillSpielbrett(int spielbrett[][]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("In welcher Zeile möchten sie die 1 setzten?");
        int spalte = scanner.nextInt();
        System.out.println("In welcher Spalte möchten sie die 1 setzten?");
        int zeile = scanner.nextInt();
        spielbrett[spalte - 1][zeile - 1] = 1;
        System.out.println("Möchten sie weitere Zellen setzten?");

        if (scanner.nextLine().contains("yes"))
        {
            fillSpielbrett(spielbrett);
        }
        return spielbrett;
    }
}




