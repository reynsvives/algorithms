/*REEKS 4*/

//Oefening 2

//declareren variabelen

int x; //in te brengen geheel getal
int i; //loopvariabele voor testen van delers

//Initialiseren
x = 1;
i = 2;

//Opvragen van een getal x > 1 (inputcontrole)

while(x <= 1){
	System.out.println("Geef een getal strikt groter dan 1: ");
	x = receive();
}

//Opzoeken van kleinste positieve deler zoeken

while( x % i != 0){
	i += 1 ;
}

//Printen van het resultaat

System.out.println("Kleinste positieve gehele deler voor " + x + "is :" + i);

//Oefening 8: checken of een getal een fibonacci getal is

{
//Module Fibonnacci
	//Auteur: MyName
	//Date: MyDate
	//Version: MyVersion

//variabelen declareren

	int x; // te controleren getal
	int fibon; //laatst berekende fibonacci getal
	int fibon1; //voorlaatst berekende fibonacci getal
	int fibon2; //2de laatst berekende finbonacci getal 

//initialiseren

	fibon1 = 1;
	fibon2 = 1;
	fibon = 1;

//Opvragen getal

	System.out.println("Geef een strikt positief geheel getal: ");
	x = receive():

//Checken van randgeval dat x = 1
	if(x == 1){
		System.out.println(x + "is een fibonaccigetal")
	}
	else {

		//Doorlopen Fibonacci getallen zolang dat x > huidig fibonnaci getal. 
	while(x > fibon){

		fibon = fibon1 + fibon2;
		fibon2 = fibon1;
		fibon1 = fibon;

		}

	//Checken of x een fibonaccigetal is
		if(x == fibon){
			System.out.println(x + "is een fibonaccigetal");
		}
		else {
			System.out.println(x + "is geen fibonaccigetal");
		}
	}
}

//Oefening 9 (lokale maxima)

{//Start module

	int getal1, getal2, getal3;
	int aantalMax;

	//Vraag eerste twee getallen op

	getal1 = receive(); 
	getal2 = receive();
	getal3 = 0;
	aantalMax = 0;

	while(getal3 != -1)
	{
		getal3 = receive();

		If(getal2 > getal1 && getal2 > getal3)
		{
			System.out.println(getal1 + ", "+ getal2 + ", " + getal3);
			aantalMax += 1;
		}

		getal1 = getal2;
		getal2 = getal3;
	}

	//Print lokale maxima

	System.out.println("Aantal lokale maxima: " + aantalMax);


}//einde module


//Oefening 10 (langste reeksen...)

{//start module

	//variabelen
	double somTotaal; //totale som van de reeks getallen
	double somLRSG; //som van de langste reeks stijgende getallen
	double somLRDG; //som van de langste reeks dalende getallen
	double getal1; //vorige ingevoerd getal
	double getal2; //meest recent ingevoerd getal
	int lengteLRSG; //lengte van de langste reeks stijgende getallen
	int lengteLRDG; //lengte van de langste reeks dalende getallen
	int tempLengteLRSG; //tijdelijke variabele voor opslag langste reeks stijgende getallen;
	int tempLengteLRDG; //tijdelijke variabele voor opslag langste reeks dalende getallen;
	double tempSomLRSG; //tijdelijke variabele voor opslag som langste reeks stijgende getallen;
	double tempSomLRDG; //tijdelijke variabele voor opslag langste reeks dalende getallen;

	//Initialiseren

	somTotaal = 0;
	somLRSG = 0;
	somLRDG = 0;
	lengteLRSG = 1;
	lengteLRDG = 1;
	getal2 = -1; //instellen op willekeurige waarde verschillende van 0
	tempSomLRDG = 0;
	tempSomLRSG = 0;
	tempLengteLRSG = 1;
	tempLengteLRDG = 1;

	//Invoeren eerste getal

	System.out.println("Geef een eerste getal op: ");
	getal1 = sc.nextDouble();

	//Vervolg programma voor invoeren andere getallen en bepalen langste reeksen

	while(getal2 != 0) //getallen inlezen zolang we geen 0 tegenkomen
	{
		//Volgend getal opvragen

		System.out.println("Geef een volgend getal verschillend van 0 in: ");
		getal2 = sc.nextDouble();

		if(getal1 == getal2) //checken op input
			System.out.println("Getal mag niet gelijk zijn aan het vorig ingevoerde getal: ");
		else
		{
			if(getal2 > getal1)
			{
				tempLengteLRSG += 1; //verhogen van de lengte van de reeks met stijgende getallen met 1
				tempSomLRSG += getal2; //som updaten voor reeks met stijgende getallen
				somTotaal += getal2; //globale som updaten
				
				//Gezien getal2 > getal 1 zitten we in een stijgende reeks en kunnen we de dalende reeks afsluiten en de lengte van de laatste dalende reeks eventueel toekennen
				if(tempLengteLRDG > lengteLRDG) 
				{
					lengteLRDG = tempLengteLRDG;
					somLRDG = tempSomLRDG;
					tempLengteLRDG = 1;
					tempSomLRDG =0;
				}
				else
				{
					if(tempLengteLRDG == lengteLRDG)
					{
						if(tempSomLRDG > somLRDG)
						{
							somLRDG = tempSomLRDG;
						}
					}
				}

			}
			else
			{
				tempLengteLRDG += 1; //verhogen lengte van de reeks met dalende getallen
				tempSomLRDG += getal2; //verhogen som van de reeks met dalende getallen
				somTotaal += getal2; //globale som updaten

				if(tempLengteLRSG > lengteLRSG)
				{
					lengteLRSG = tempLengteLRSG;
					somLRSG = tempSomLRSG;
					tempLengteLRSG = 1;
					tempSomLRSG = 0;
				}
				else
				{
					if(tempLengteLRDG == lengteLRDG)
					{
						if(tempSomLRSG > somLRSG)
						{
							somLRSG = tempSomLRSG;
						}
					}
				}

			}

		}//einde else

		getal1 = getal2; //toekennen nieuwe waarde getal 1

	}//einde while loop

	System.out.println("lengte LRDG: " + lengteLRDG);
	System.out.println("lengte LRSG: " + lengteLRSG);
	System.out.println("Som LRDG: " + somLRDG);
	System.out.println("Som LRSG: " + somLRSG);
	System.out.println("Som TOTAAL: " + somTotaal);


}//einde module


