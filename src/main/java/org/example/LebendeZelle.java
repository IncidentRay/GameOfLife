package org.example;

public class LebendeZelle implements Spielbrett.Zelle {

    final static int heartbeat =1;

    public static LebendeZelle generiereLebendeZelle (int[][] spielbrett, int zeile, int spalte){
        LebendeZelle lebendeZelle = new LebendeZelle();
        spielbrett [zeile][spalte] = getHeartbeat();
        return lebendeZelle;
    }

    @Override
    public int getHeartbeat() {
        return heartbeat;
    }

    @Override
    public void transform() {

    }
}
