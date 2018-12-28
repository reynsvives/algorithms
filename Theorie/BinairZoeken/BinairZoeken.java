
/**
 * Binair zoekalgoritme
 *
 * MyName
 * MyVersion
 */

import java.util.Scanner;
public class BinairZoeken
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int dim; //aantal elementen
        
        //Opvragen aantal elementen voor de tabel
       
        System.out.println("Geef het aantal elementen voor de tabel: ");
        dim = sc.nextInt();
       
        double[] tabel = new double[dim]; //tabel oplopend gesorteerd
        int i; //loopvariabele
        
        //Opvullen van de tabel
        
        System.out.println("Geef " + dim + " elementen op");
        for(i = 0; i < dim; i++)
        {
            tabel[i] = sc.nextDouble();
        }
        
        double x; //Zoekargument
        System.out.println("Geef het zoekargument op");
        x = sc.nextDouble();
        
        //Binair zoeken
            //Bereken het midden
            //Check of x >= tabel[miden]
                //Indien true ==>zoek in bovenste helft
                //Indien false ==>zoek in onderste helft
        
        int begin = 0; //index beginelement resterende tabel
        int einde = dim -1; //index eindelement resterende tabel
        int midden; //index midden resterende tabel
        
        //Binair zoeken implementeren
        
        while(einde>begin)
        {
            //midden berekenen
            midden = (begin + einde)/2;
             
            if(x > tabel[midden])
            {
                begin = midden + 1;
            }
            else
            {
                einde = midden;
            }

        
        }
        
        //Checken of in de laatste iteratie (= nog 1 element over) de waarde
        //gelijk is aan het zoekargument.
        
        if(tabel[begin]==x)
        {
            System.out.println("Element gevonden op plaats: " + begin );
        }
        else{
            System.out.println("Element niet gevonden !");
        }

    }
}
