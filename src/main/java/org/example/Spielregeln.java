package org.example;

public class Spielregeln {

    public  Zelle[][] golSpielregeln(Zelle[][] spielbrett){

        int anzahlNachbarn;
        Spielbrett duplicateBrett = new Spielbrett(spielbrett.length);

        for (int zeile = 0; zeile < spielbrett.length; zeile++) {
            for (int spalte = 0; spalte < spielbrett.length; spalte++) {

                anzahlNachbarn = nachbarCheck(zeile, spalte, spielbrett);
                if (spielbrett[zeile][spalte].hasHeartbeat()){
                    if (anzahlNachbarn < 2){duplicateBrett.zellen[zeile][spalte] = new ToteZelle();}
                    if (anzahlNachbarn > 3){duplicateBrett.zellen[zeile][spalte] = new ToteZelle();}
                    if (anzahlNachbarn >= 2 && anzahlNachbarn <= 3){duplicateBrett.zellen[zeile][spalte] = new LebendeZelle();}
                }
                if (!spielbrett[zeile][spalte].hasHeartbeat()){
                    if (anzahlNachbarn == 3){duplicateBrett.zellen[zeile][spalte] = new LebendeZelle();}
                    else {duplicateBrett.zellen[zeile][spalte]= new ToteZelle();}
                }
            }}
        return duplicateBrett.zellen;
    }

    public int nachbarCheck (int zeile, int spalte, Zelle[][] spielbrett) {
        int nachbarn = 0;

        for (int z = -1; z <=1; z++){
            for (int s = -1; s <=1; s++){
                int nachbarZeile = zeile + z;
                int nachbarSpalte = spalte + s;
                boolean valid = true;
                if (z == 0 && s == 0 || nachbarZeile == -1 || nachbarSpalte == -1 || nachbarZeile == spielbrett.length || nachbarSpalte == spielbrett.length){valid = false;}
                if (valid && spielbrett[nachbarZeile][nachbarSpalte].hasHeartbeat()) {nachbarn++;}}
        }
        return nachbarn;
    }


}
