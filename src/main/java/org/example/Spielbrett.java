package org.example;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Spielbrett {

    static int größe = 10;
    Zelle[][] zellen = new Zelle[größe][größe];

    public Spielbrett(int größe) {
        Spielbrett.größe = größe;

        for (int zeile = 0; zeile < zellen.length; zeile++) {
            for (int spalte = 0; spalte < zellen.length; spalte++) {
                zellen[zeile][spalte] = new ToteZelle();}}
    }

    public void printSpielbrett(Spielbrett golBrett) {
        for (int zeile = 0; zeile < golBrett.zellen.length; zeile++) {
            for (int spalte = 0; spalte < golBrett.zellen.length; spalte++) {

                if (golBrett.zellen[zeile][spalte].hasHeartbeat()) {
                    System.out.print("\uD83D\uDC7D" + "\t");
                } else {
                    System.out.print("☠️" + "\t");
                }}
            System.out.println();}
    }

    public void fillSpielbrett(Spielbrett golBrett) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Möchten sie mit zufälligen Werten arbeiten?");
        String randomCheck = scanner.next();
        if(randomCheck.equals("ja") || randomCheck.equals("Ja") || randomCheck.equals("j") || randomCheck.equals("y") || randomCheck.equals("yes")){

            System.out.println("Wie viele lebende Zelle wollen sie einrtagen?");
            int numZellen = scanner.nextInt();
            try{

                for (int i = 0; i < numZellen; i++) {
                    int randomZeile = ThreadLocalRandom.current().nextInt(0, größe);
                    int randomSpalte = ThreadLocalRandom.current().nextInt(0, größe);
                    golBrett.zellen[randomZeile][randomSpalte] = new LebendeZelle();}

            } catch (IllegalArgumentException e)
            {System.out.println("Spielfeld zu klein! Try Again!"); fillSpielbrett(golBrett);}
        }
        else{
            System.out.println("Wie viele lebende Zelle wollen sie einrtagen?");
            int numZellen = scanner.nextInt();
            try {
                if (numZellen <= größe * größe && numZellen >= 0) {
                    for (int i = 1; i < numZellen + 1; i++) {
                        System.out.println("(Lebende Zelle #" + i + ") In welcher Zeile möchten sie die 1 setzten?");
                        int zeile = scanner.nextInt();
                        System.out.println("(Lebende Zelle #" + i + ") In welcher Spalte möchten sie die 1 setzten?");
                        int spalte = scanner.nextInt();
                        golBrett.zellen[zeile - 1][spalte - 1] = new LebendeZelle();
                    }
                } else {
                    System.out.println("Zu viele gewünschte Zellen! Try Again with less!");
                    System.out.println("--------------");
                    fillSpielbrett(golBrett);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Koordinate außerhalb des Spielfelds! Try Again!");
                System.out.println("--------------");
                fillSpielbrett(golBrett);}
        }}

    public void defaultBrett(Spielbrett defaultBrett){  //Takes 80 Generations to stabilize

        defaultBrett.zellen[2][3] = new LebendeZelle();
        defaultBrett.zellen[2][4] = new LebendeZelle();
        defaultBrett.zellen[2][5] = new LebendeZelle();
        defaultBrett.zellen[3][4] = new LebendeZelle();
        defaultBrett.zellen[4][4] = new LebendeZelle();
        defaultBrett.zellen[4][5] = new LebendeZelle();
        defaultBrett.zellen[5][5] = new LebendeZelle();
        defaultBrett.zellen[6][1] = new LebendeZelle();
        defaultBrett.zellen[7][1] = new LebendeZelle();
        defaultBrett.zellen[8][1] = new LebendeZelle();
    }
}
