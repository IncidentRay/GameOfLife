package org.example;

public class Main {
    public static void main(String[] args) {
        int generationen = 5;

        //int[][] spielbrett = Spielbrett.generateSpielbrett();
        //Spielbrett.fillSpielbrett(spielbrett);
        int[][] spielbrett = Spielbrett.defaulfSpielbrett();
        System.out.println("Startbrett:");
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