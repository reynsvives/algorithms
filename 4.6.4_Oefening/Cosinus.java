
/**
 * Berekenen van cosinus door reeksontwikkeling
 *
 * MyName
 * MyVersion
 */

import java.util.Scanner;

public class Cosinus
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         
         //Variabelen declareren
         
         double x;
         double cosX;
         double termN;
         int teken; //plus of min teken: neemt de waarde -1 (even term) of 1 (oneven term)
         int faculteitN;
         int termNummer;
         
         //Variabelen initialiseren
         
         termN = 1; //Eerste term = 1
         teken = 1; //Teken van de eerste term = 1
         cosX = 0; 
         termNummer = 0; //Termnummer starten op 0
         faculteitN = 1; //Faculteit van N-de term initialiseren op 1
         
         //input van gebruiker voor x
         
         System.out.println("Geef een waarde voor x");
         x = sc.nextDouble();
         
         while(termN >=1E-5)
         {
          
            //Als het termnummer even is, dan is de term positief anders negatief.
             
            if(termNummer % 2 == 0)
             {
                 teken = 1;
             }
            else{teken = -1;}
            
            //Berekenen van de faculteit van de N-de term
            
            faculteitN = faculteitN + (termNummer + 1);
            
            //Berekenen van de N-de term. Als het om de 0de term gaat, dan zetten we en anders passen we
                //de vereenvoudigde formule toe om de N-de term te berekenen op basis van de voorgaande.
            
            if(termNummer == 0){
            
                termN = 1;
            }
            else{
            
                termN = termN * (x * x)/((2 * termNummer - 1) * (2 * termNummer));
            
            }
            
            //De cosinues berekenen door de laatst berekende term toe te voegen en deze te 
                //vermenigvuldigen met het teken
                
             cosX = cosX + (teken * termN); 
             
             termNummer = termNummer + 1; //term ophogen met 1
       
         }
         //Printen van het resultaat
         System.out.println("De cosinus van " + x + " is: " + cosX);
         
    }
}
