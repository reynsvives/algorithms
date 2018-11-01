
/**
 * Write a description of class SequentieelZoeken here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class SequentieelZoeken
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Algoritme sequentieel zoeken
            //Gegeven een array met waarden
            //Ga door met vergelijken van de elementen in een array
            //zolang het ide-element != zoekargument én het element niet 
                //het laatste element is
            
        double zoekArgument;
        int aantalElementen = 5;
        double[] tabel = new double[aantalElementen];
        int i = 0; //loopvariabele
        int j = 0;
    
        //Invoeren reeks
        
        System.out.println("Geef 5 getallen in: ");
        
        for(j=0; j<aantalElementen; j++)
        {
            tabel[j]=sc.nextDouble();
        }
        
        System.out.println("Geef het zoekargument op: ");
        zoekArgument = sc.nextDouble();
        
        while(tabel[i] != zoekArgument && i != aantalElementen - 1)
        {
            i = i +1;
        }
        
        if(tabel[i] == zoekArgument)
        {
            System.out.println("Gevonden op index: " + i);
        }
        else{System.out.println("Niet gevonden");}
        
       
        
               
        
       
    
    
    }
}
