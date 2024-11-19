package org.example;

public class Spielregeln implements Spielbrett.Zelle {

    public static Spielbrett.Zelle[][] spielregeln (Spielbrett.Zelle[][] spielbrett){

        int anzahlNachbarn;
        Spielbrett.Zelle[][] duplicateBrett = Spielbrett.generateDuplicateBrett(spielbrett);

     for (int zeile = 0; zeile < spielbrett.length; zeile++) {
        for (int spalte = 0; spalte < spielbrett.length; spalte++) {

            anzahlNachbarn = nachbarCheck(zeile, spalte, spielbrett);
            if (spielbrett[zeile][spalte] == (1)){
               if (anzahlNachbarn < 2){duplicateBrett[zeile][spalte] = 0;}
               if (anzahlNachbarn > 3){duplicateBrett[zeile][spalte] = 0;}
               if (anzahlNachbarn >= 2 && anzahlNachbarn <= 3){duplicateBrett[zeile][spalte] = 1;}
            }
            if (spielbrett[zeile][spalte] == (0)){
                if (anzahlNachbarn == 3){duplicateBrett[zeile][spalte] = 1;}
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
                        if (spielbrett[nachbarZeile][nachbarSpalte] == 1) {counter++;}
                }
        }   }
      return counter;
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
