
/**
 * Inverteren van een reeks getallen
 *
 * MyName
 * MyVersion
 */

import java.util.Scanner;
import java.util.Arrays;

public class Inverteren
{
    public static void main(String args[])
    {
        //Scanner object
        
        Scanner sc = new Scanner(System.in);
        
        //Grootte array opvragen
        int dim; //dimensie van de reeksGetallen
        
        System.out.println("Geef het aantal getallen in de reeks van getallen:");
        dim = sc.nextInt();
        
        int[] reeksGetallen = new int[dim];
        int i; //loopvariabele
        
        //Variabele die de omgekeerde reeks getallen bevat.
        int[] reeksGetallenOmgekeerd = new int[dim];

        //getallen opvragen
        
        System.out.println("Geef " + dim + " getallen op:");
        
        for(i = 0; i<dim; i++)
        {

            reeksGetallen[i] = sc.nextInt();
        }
        
        //Getallen omgekeerd afbeelden
        
        for(i=0; i<dim; i++)
        {
           reeksGetallenOmgekeerd[dim - 1 - i] =  reeksGetallen[i];
        }
        
        //Printen van de array door gebruik te maken van Arrays library !
        System.out.println(Arrays.toString(reeksGetallenOmgekeerd));
        
        
    
    }
   
}
