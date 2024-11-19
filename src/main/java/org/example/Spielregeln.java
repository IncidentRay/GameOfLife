package org.example;

public class Spielregeln {

    public static Spielbrett.Zelle[][] spielregeln (Spielbrett.Zelle[][] spielbrett){

        int anzahlNachbarn;
        Spielbrett.Zelle[][] duplicateBrett = Spielbrett.generateDuplicateBrett(spielbrett);

     for (int zeile = 0; zeile < spielbrett.length; zeile++) {
        for (int spalte = 0; spalte < spielbrett.length; spalte++) {

            anzahlNachbarn = nachbarCheck(zeile, spalte, spielbrett);
            if (spielbrett[zeile][spalte].heartbeat()){
               if (anzahlNachbarn < 2){duplicateBrett[zeile][spalte] = ToteZelle.generateToteZelle();}
               if (anzahlNachbarn > 3){duplicateBrett[zeile][spalte] = ToteZelle.generateToteZelle();}
               if (anzahlNachbarn >= 2 && anzahlNachbarn <= 3){duplicateBrett[zeile][spalte] = LebendeZelle.generateLebendeZelle();}
            }
            if (!spielbrett[zeile][spalte].heartbeat()){
                if (anzahlNachbarn == 3){duplicateBrett[zeile][spalte] = LebendeZelle.generateLebendeZelle();}
            }
        }}
        return duplicateBrett;
    }

    public static int nachbarCheck (int zeile, int spalte, Spielbrett.Zelle[][] spielbrett) {
        int counter = 0;

        for (int z = -1; z <=1; z++){
            for (int s = -1; s <=1; s++){

                int nachbarZeile = zeile + z;
                int nachbarSpalte = spalte + s;
                boolean valid = true;

                if (z == 0 && s == 0 || nachbarZeile == -1 || nachbarSpalte == -1 || nachbarZeile == spielbrett.length || nachbarSpalte == spielbrett.length){
                    valid = false;}

                if (valid == true){
                        if (spielbrett[nachbarZeile][nachbarSpalte].heartbeat()) {counter++;}
                }
        }   }
      return counter;
}
}
