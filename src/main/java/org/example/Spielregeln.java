package org.example;

public class Spielregeln {

    public static int[][] spielregeln (int spielbrett[][]){

        int anzahlNachbarn;
        int [][] duplicateBrett = Spielbrett.generateDuplicateBrett(spielbrett);

     for (int zeile = 0; zeile < spielbrett.length; zeile++)
    {
        for (int spalte = 0; spalte < spielbrett.length; spalte++)
        {
            anzahlNachbarn = nachbarCheck(zeile, spalte, spielbrett);

            if (spielbrett[zeile][spalte] == (1)){
               if (anzahlNachbarn < 2){duplicateBrett[zeile][spalte] = 0;}
               if (anzahlNachbarn > 3){duplicateBrett[zeile][spalte] = 0;}
               if (anzahlNachbarn >= 2 && anzahlNachbarn <= 3){duplicateBrett[zeile][spalte] = 1;}
            }
            if (spielbrett[zeile][spalte] == (0)){
                if (anzahlNachbarn == 3){duplicateBrett[zeile][spalte] = 1;}
            }
        }
    }
        return duplicateBrett;
    }

    public static int nachbarCheck (int zeile, int spalte, int spielbrett[][]) {
        int counter = 0;

        for (int z = -1; z <=1; z++){
            for (int s = -1; s <=1; s++){

                int nachbarZeile = zeile + z;
                int nachbarSpalte = spalte + s;
                boolean valid = true;

                if (z == 0 && s == 0){valid = false;}
                if (nachbarZeile == -1){valid = false;}
                if (nachbarSpalte == -1){valid = false;}
                if (nachbarZeile == spielbrett.length){valid = false;}
                if (nachbarSpalte == spielbrett.length) {valid = false;}

                    if (valid == true){
                        if (spielbrett[nachbarZeile][nachbarSpalte] == 1) {counter++;}
                    }
        }}
      return counter;
}
}
