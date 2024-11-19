package org.example;

public class LebendeZelle implements Spielbrett.Zelle {

public static LebendeZelle generateLebendeZelle() {

    LebendeZelle lebendeZelle = new LebendeZelle();
    return lebendeZelle;
}

    @Override
    public boolean heartbeat() {
        return true;
    }
}
