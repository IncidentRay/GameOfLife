package org.example;

public class Spielregeln {

    public static int[][] spielregeln (int spielbrett[][]){

     for (int zeile = 0; zeile < spielbrett.length; zeile++)
    {
        for (int spalte = 0; spalte < spielbrett[zeile].length; spalte++)
        {
            if (spielbrett[zeile][spalte] == (1)){

                nachbarCheck(spielbrett[zeile][spalte]);


                }

            }
        }


    }
        return spielbrett;
    }

    public static int nachbarCheck (int spielbrett[][]){
       int counter = 0;


      return counter;
    }

}
