
/**
 * Sequentieel zoeken d.m.v. sentinel
 *
 * MyName
 * MyVersion
 */

import java.util.Scanner;
public class SeqZoekenSentinel
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Variabelen
        int aantalElementen = 5; //aantal elementen in tabel
        double[] tabel = new double[aantalElementen + 1]; //te doorzoeken tabel
        double x; //zoekargument
        int i; //loopvariabele voor loopen over tabel
        
        //Tabel invullen
        
        System.out.println("Geef " + aantalElementen + " elementen op.");
        
        for(i=0; i<aantalElementen; i++)
        {
            tabel[i] = sc.nextDouble();
        
        }
        
        
        //Zoekargument opvragen
        
        System.out.println("Geef het zoek argument op:");
        x = sc.nextDouble();
        
        //Algoritme:
            //Aan het einde sentinel plaatsen
            //Loopen over tabel en checken of ide-elementen = zoekargument.
            //Indien index gevonden waarde < index sentinel ==>element gevonden
            //Indien index gevonden waarde == index sentinel ==>element niet gevonden
     
       //plaatsen sentinel op laatste element
       
       tabel[aantalElementen] = x; 
            
        //Doorlopen van de tabel en checken t.o.v. zoekargument
       
        i=0;
        while(tabel[i] != x)
        {
            i = i+1;
        }
 
        //Checken of x gevonden werd of niet.
        
        if(i < aantalElementen)
        {
            System.out.println("Element gevonden op index " + i);
        }
        else
        {
            System.out.println("Element niet gevonden");
        }

    }
    
}
