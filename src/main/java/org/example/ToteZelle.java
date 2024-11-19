package org.example;

public class ToteZelle implements Spielbrett.Zelle {


    public LebendeZelle generiereLebendeZelle (int[][] spielbrett, int zeile, int spalte){
        LebendeZelle lebendeZelle = new LebendeZelle();
        spielbrett [zeile][spalte] = getHeartbeat();
        return lebendeZelle;
    }

    @Override
    public int getHeartbeat() {
        int heartbeat =0;
        return heartbeat;
    }

    @Override
    public void transform() {

    }




}
