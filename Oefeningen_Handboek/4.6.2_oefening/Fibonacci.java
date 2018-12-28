
/**
 * Berekenen termen rij van fibonacci   
 *
 * MyName
 * MyVersion
 */

import java.util.Scanner;
public class Fibonacci
{
    public static void main(String args[])
    {
        //Scanner object
        
        Scanner sc = new Scanner(System.in);
        
        int termVoorgaande2 = 0; //2de voorgaande term
        int termVoorgaande = 1; //voorgaande term
        int termN = 0; //de nde-term
        String printN = "0, 1"; //De string die de fibonacci rij opslaat geïnitialiseerd op de eerste twee termen
        int n;
        int i; 
        
        //User input
        
        System.out.println("Geef een strikt positief geheel getal in: ");
        n = sc.nextInt();
        
        //Fibonacci rij berekenen t.e.m. de n-de term
        
        //Voor n <= 2 (= maximum 2 termen)
        
        if(n==1)
        {
            printN = "0";
            System.out.println("De Fibonacci-rij t.e.m. de " + n + "-ste term is:");
            System.out.println(printN);
        } else
            if(n==2)
            {
                printN = "0, 1";
                System.out.println("De Fibonacci-rij t.e.m. de " + n + "-de term is:");
                System.out.println(printN);
            }
            else //Voor n>2
            {
            
                for(i=3; i<=n; i++ ) //Iteratievariabele beginnen van de 3de term
                {
                termN = termVoorgaande2 + termVoorgaande; //berekenen nde-term
                
                printN = printN + ", " + termN;
    
                termVoorgaande2 = termVoorgaande; //Voor de term (n+1) in de volgende iteratie is termVoorgaande2 = voorgaande term van de Nde term.
                termVoorgaande = termN; //Voor de term (n+1) is de voorgaande term de n-de te
                }
            
            System.out.println("De Fibonacci-rij t.e.m. de " + n + "-de term is:");
            System.out.println(printN);
           
            }
         
        

    }
}
