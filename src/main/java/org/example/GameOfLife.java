package org.example;
import java.util.Scanner;

public class GameOfLife {

    public void run() {

        int generationen;
        Scanner scanner = new Scanner(System.in);
        Spielbrett golBrett = new Spielbrett(10);
        System.out.println("Möchtest du mit dem defaultBrett arbeiten?");
        String defaultCheck = scanner.next();

        if(defaultCheck.equals("ja") || defaultCheck.equals("Ja") || defaultCheck.equals("j") || defaultCheck.equals("y") || defaultCheck.equals("yes"))
        {golBrett.defaultBrett(golBrett);}

        else {
            System.out.println("Wie groß soll das Spielbrett sein?");
            Spielbrett.größe = scanner.nextInt();
            golBrett = new Spielbrett(Spielbrett.größe);
            golBrett.fillSpielbrett(golBrett);
        }

        System.out.println("Wie viele Generationen soll es geben?");
        generationen = scanner.nextInt();
        System.out.println("Startbrett: (Generation #0)");
        golBrett.printSpielbrett(golBrett);

        try {Thread.sleep(500);} catch (InterruptedException e) {Thread.currentThread().interrupt();}

        System.out.println("-----------------------------");
        Spielregeln regeln = new Spielregeln();

        for (int i = 1; i <= generationen; i++) {
            regeln.golSpielregeln(golBrett.zellen);
            golBrett.zellen = regeln.golSpielregeln(golBrett.zellen);
            System.out.println("Generation #" +i);
            golBrett.printSpielbrett(golBrett);

            try {Thread.sleep(500);} catch (InterruptedException e) {Thread.currentThread().interrupt();}

            System.out.println("-----------------------------");
        }
    }
}
