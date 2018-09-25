/**
3. Schrijf een module die de prijs van de goederen, het BTW-tarief en het
procent handelskorting inleest en het te betalen bedrag op scherm brengt.
Voor de berekening moet eerst de han- delskorting worden afgetrokken en dan
de BTW worden berekend.
*/

import java.util.Scanner;

{
  //Declaratie

  double prijs; //Prijs van de goederen
  double btw; //Btw-percentage
  double percentKorting; //Percentage van de korting
  double teBetalen;

  //Invoeren van gegevens door de gebruiker

  System.out.printIn("Geef de prijs in:");
  prijs = sc.nextDouble();
  System.out.printIn("Geef het btw-tarief in:");
  btw = sc.nextDouble();
  System.out.printIn("Geef het kortingspercentage op:");
  percentKorting = nextDouble();

  //Berekenen van te betalen bedrag

  teBetalen = (prijs * (1 - percentKorting)) * (1 + btw);

  System.out.printIn("Te betalen:" + teBetalen)
}
