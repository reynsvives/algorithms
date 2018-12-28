
/**
 * Write a description of class reeksGetallen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class reeksGetallen
{
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        
        //Declareren array getallen met 20 posities
        
        int[] getallen = new int[20];
        
        //Declareren veld minimum
        
        int min;
        
        //Loop variabele
        
        int i;        
        //temp_min variabele
        
        int temp_min;

        //Input van 20 getallen
        
        System.out.println("Geef opeenvolgend 20 getallen in: ");
        
        for(i=0; i<20; i++)
        {
            getallen[i] = sc.nextInt();
        
        }
        
        //Initialiseren temp_min
        
        temp_min = getallen[0];

        //Berekenen van het minimum
        
        for(i=0; i<20; i++)
        {
            System.out.println("i = " + i);
            //temp_min
            
            //Voor elk element check of element_i < temp_min.
                //Als dit kleiner is, sla op in temp_min
                //Als dit groter is, ga verder met vergelijken tot eind.
                //2, 1, 3, 0, 9
            
            if(getallen[i] < temp_min)
            {
                temp_min = getallen[i];

            }
        }
    
        //Printen van het minimum
        
        System.out.println("Het minimum is: " + temp_min);
    }
}
