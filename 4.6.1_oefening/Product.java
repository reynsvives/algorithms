/**
 * Vermenigvuldigen van 2 getallen
 * MyName
 * MyVersion
 */
import java.util.Scanner;

public class Product
{
    public static void main(String args[])
    {
    
        Scanner sc = new Scanner(System.in);
    
        //variabelen
        
        int getal;
        int resultaat;
        int multiplicator;
        int teller;
        
        //Invoeren van een waarde door de gebruiker
        
        System.out.println("Geef het getal op dat moet vermenigvuldigd worden:");
        getal = sc.nextInt();
        System.out.println("Geef de multiplicator op:");
        multiplicator = sc.nextInt();
        
        //Initialiseer de teller op 1
        //Initialiseer resultaat op getal
        
        teller = 1;
        resultaat = getal;
        
        //Vermenigvuldigen d.m.v. een optelling
        
        while(teller < multiplicator)
        {
            resultaat = resultaat + getal;
            
            teller = teller + 1;
        
        }
        
        System.out.println(getal + " x " + multiplicator + " = " + resultaat);
    }
}
