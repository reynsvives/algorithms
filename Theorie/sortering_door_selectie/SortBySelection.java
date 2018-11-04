
/**
 * Sorteren door selectie 
 *
 * myName
 * myVersion
 */

import java.util.Scanner;
import java.util.Arrays;
 
public class SortBySelection
{
   public static void main(String args[])
     {
         
       Scanner sc = new Scanner(System.in);
       //Algoritme:
        //Bereken minimum van ongesorteerd deel van de tabel
        //Omwisselen van het minimum met het eerste element
        
    
       //declaratie
       int dim = 10; //aantal elementen in de tabel
       double[] tabel = new double[dim]; //tabel met te sorteren waarden
       double temp; //hulpvariabele voor het tijdelijke stockeren van een variabele
       int i; //loopvariabele voor itereren over elementen ongesorteerd deel
       int j; //index start ongesorteerd deel
       int l; //index minimum waarde ongesorteerd deel
       int k; //index voor input waarden
       
       //initialiseren
       //tabel = receive();
     
       System.out.println("Geef 10 getallen in");
       
       for(k=0; k<dim; k++)
       {
           tabel[k] = sc.nextDouble();
       }
       
     
       for(j = 0; j < dim -1; j = j + 1)
       {
           //initialiseren minimum op eerste positie ongesorteerd deel 
           l = j;
           
           //Berekenen minimum ongesorteerd deel
           for(i = j; i < dim; i = i + 1)
           {
               if(tabel[i] < tabel[l])
                   l = i;
           }
           
           //Verwisselen van de eerste waarde met het minimum en het element 
           //waar het minimum voorkwam met het eerste element.
           
           temp = tabel[j];
           tabel[j] = tabel[l];
           tabel[l] = temp;
       }
       
                 
       System.out.println(Arrays.toString(tabel));
    
    }
}
