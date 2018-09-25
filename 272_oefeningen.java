/**
2. Schrijf een module die het aantal uren, overuren en uurloon opvraagt en het brutoloon op scherm plaatst.
De overuren worden 50 % meer betaald dan de gewone uren.
*/

import java.util.Scanner;

{

	//Declaratie variabelen

	double uren, overuren, uurloon, brutoloon;

	//Invoeren data

	System.out.printIn("Aantal gewerkte uren: ");
	uren = sc.nextDouble();
	System.out.printIn("Aantal gewerkte overuren: ");
	overuren = sc.nextDouble();
	System.out.printIn("Uurloon: ");
	uurloon = sc.nextDouble();

	//berekening loon

	brutoloon = (uren + 1.5 * overuren) * uurloon;

	//Print resultaat

	System.out.printIn("Het loon is: " + brutoloon);

}
