
{//start module

	//bv. sqrt(10)
	//1 2 3 4 5 6 7 8 9 10
	//We kunnen hier de oneven getallen 1, 3, 5 aftrekken.
	//We kunnen dus 3 oneven getallen aftrekken.
	//Wortel 10 = 3

	//Variabelen declareren

	int atlOneven; //aantal oneven getallen die afgetrokken kunnen worden
	int getal; //het getal waarvan de wortel moet berekend worden
	int volgendOneven; //het eerst volgende oneven getal
	int rest; //de rest die overblijft na aftrekken van een zeker aantal oneven getallen

	//Input opvragen

	System.out.println("Geef een getal op waarvoor de wortel moet berekend worden: ");
	getal = receive();

	//initialiseren

	rest = getal;
	atlOneven = 0;
	volgendOneven = 1;

	//Bepalen hoeveel oneven getallen er afgetrokken kunnen worden

	while(rest >= volgendOneven)
	{
		rest = rest - volgendOneven; //rest verminderen met volgend oneven getal
		volgendOneven = volgendOneven + 2; //volgend oneven getal bepalen
		atlOneven = atlOneven + 1; //aantal oneven getallen die zijn afgetrokken ophogen
	}

	//Wortel berekenen

	System.out.println("De wortel van " + getal + "is :" + atlOneven);

}