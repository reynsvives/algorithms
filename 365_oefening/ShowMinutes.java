/**
Schrijf een module die de capaciteit in MB opvraagt van een lege CR-R
(650, 700 of 800 MB) en de capaciteit in minuten afbeeldt (74, 80, 90)
*/

import java.util.Scanner;

public class ShowMinutes{

  public static void main(String[] args){

    //Nieuwe Scanner

    Scanner sc = new Scanner(System.in);

    //Declaratie velden

    int capaciteit;

    //Geef de capaciteit van de CD-R in MB

    System.out.println("Geef de capaciteit van de CD-R in MB ");

    //Invoeren capaciteit

    capaciteit = sc.nextInt();

    //Bepalen van het aantal minuten

    switch(capaciteit){

      //capaciteit = 650

      case 650: System.out.println("Het aantal minuten is 74");
      break;

      //capaciteit = 700

      case 700: System.out.println("Het aantal minuten is 80");
      break;

      //capaciteit = 800

      case 800: System.out.println("Het aantal minuten is 90");
      break;
    }

  }

}

