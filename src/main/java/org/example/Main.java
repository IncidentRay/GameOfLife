package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int generationen;
        Spielbrett.Zelle[][] spielbrett;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Möchtest du mit dem defaultBrett arbeiten?");
        String defaultCheck = scanner.next();
            if(defaultCheck.equals("ja") || defaultCheck.equals("Ja") || defaultCheck.equals("j") ){
                spielbrett = Spielbrett.defaultSpielbrett();
            }
            else {
                spielbrett = Spielbrett.generateSpielbrett();
                Spielbrett.fillSpielbrett(spielbrett);
             }
        System.out.println("Wie viele Generationen soll es geben?");
        generationen = scanner.nextInt();
        System.out.println("Startbrett: (Generation #0)");
        Spielbrett.printSpielbrett(spielbrett);
        System.out.println("-----------------------------");
            for (int i = 1; i <= generationen; i++) {
                spielbrett = Spielregeln.spielregeln(spielbrett);
                System.out.println("Generation #" +i);
                Spielbrett.printSpielbrett(spielbrett);
                System.out.println("-----------------------------");
            }
    }
}