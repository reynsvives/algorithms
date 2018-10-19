
/**
 * Zie oefening oefening 7 van programmalogica 3.6 
 *
 * @author (your name)
 * @version (19/10/2018)
 */

import java.util.Scanner; 

public class jaarpremie
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //velden
        
        int ancienniteit;
        double loon;
        double premie;
        
        //Input ancienniteit
        
        System.out.println("Geef uw anciënniteit op:");
        ancienniteit = sc.nextInt();
        
        //Input loon
        
        System.out.println("Geef uw loon op:");
        loon = sc.nextDouble();
        
        //Bereken premie
        
        if(ancienniteit > 20){
            
           premie = loon * 0.05;
           System.out.println("Uw premie is 5%:" + premie);       
        
        }
        else{
            premie = loon * 0.03;
            System.out.println("Uw premie is 3%:" + premie);
        }
    }
}
