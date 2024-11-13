package org.example;

public class Main {
    public static void main(String[] args) {

        final int[][] spielbrett = Spielbrett.generateSpielbrett();
        Spielbrett.fillSpielbrett(spielbrett);
        Spielbrett.printSpielbrett(spielbrett);
    }
}