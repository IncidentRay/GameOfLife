package org.example;

public class ToteZelle implements Spielbrett.Zelle {

    public static ToteZelle generateToteZelle() {
        ToteZelle toteZelle = new ToteZelle();
        return toteZelle;
    }

    @Override
    public boolean heartbeat() {
        return false;
    }





}
