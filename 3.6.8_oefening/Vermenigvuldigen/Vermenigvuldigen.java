
/**
 * Printen van de tafels van vermenigvuldiging voor een gegeven input getal
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Vermenigvuldigen
{
    public static void main(String args[])
    {
        //Scanner object
        Scanner sc = new Scanner(System.in);
    
        //Variabelen declareren
        int getal;
        int[] multiplicatoren = new int[]{1,2, 3, 4, 5, 6, 7, 8, 9, 10}; //Reeks multiplicatoren van 1 t.e.m. 10
        int i; //loopvariabele

        //Getal vragen aan een gebruiker
        
        System.out.println("Geef een getal: ");
        getal = sc.nextInt();
        
        //Tafels van vermenigvuldiging berekenen
        
        for(i=0; i<10; i++)
        {
            System.out.println(multiplicatoren[i] + " x " + getal + " = " + multiplicatoren[i] * getal);
       
        }

    }
}
