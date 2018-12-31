//Oefening 1 (tabellen a, b, c)

{//Module a, b, c
	//Versie: MyVersion
	//Auteur: MyName
	//Datum: MyDate

	//Declareren variabelen

	int dim = 20;
	int[] a = new int[dim];
	int[] b = new int[dim];
	int[] c = new int[dim];
	int i; // loopvariabele

	//Opvullen van de tabellen

	for(i=0; i < dim; i++)
	{
		a[i] = 2 * i;
		b[i] = 3 * i;

	}

	//printen van de output

	//Print header van de tabel


	System.out.println("index a b c");
	System.out.println("------------");

	//Printen van de inhoud

	for(i=0; i < dim; i++)
	{
		c[i] = a[i] * b[dim - 1 - i];
		System.out.println(i + " " + a[i] + " " + b[i] + " " + c[i]);

	}
}

//Oefening 2: punten van studenten

{//Start module
	//Versie: MyVersion
	//Naam: MyName;
	//Datum: MyDate;

	//declareren variabelen

	int dimStudenten; //aantal studenten
	int dimGetallen = 11;
	int[] ptn = new int[dimStudenten]; //tabel met punten
	int i; //loopvariabelen voor iteratie over ptn
	int j; //loopvariabele om te lopen over verschillende mogelijke getallen
	int[] getallen = new getallen[dimGetallen] //mogelijke waarden van punten van 0 t.e.m. 10;
	int[] freq = new int[dimGetallen] //opslaan van frequenties voor de punten van 0 t.e.m. 190
	double gemiddelde;

	//Opvragen van het aantal studenten

	System.out.println("Geef het aantal studentne door: ");
	dimStudenten = receive();

	//Opvragen van de punten

	for(i=0; i<dimStudenten; i++)
	{
		System.out.println("Geef de punten voor student + " + i+1);
		ptn[i] = receive();
	}

	//Berekenen van de frequenties

	for(j = 0; j < dimGetallen; j++) //lopen over getallen van 0 t.e.m. 10
	{
		freq[j] = 0; //initialiseren van j-de element in tabel frequenties op 0

		for(i = 0; i<dimStudenten; i++){
			if(ptn[i] == getallen[j])
			{
				freq[j] += 1; //Ophogen van de frequenties voor een bepaald punt;
			}
		}
	}

	//Berekenen gemiddelde

	int somProduct = 0;

	for(j=0; j<dimGetallen; j++)
	{
		somProduct = somProduct + freq[j] * getallen[j]
	}

	//Gemiddelde tonen

	gemiddelde = somProduct / dimStudenten;

}//eind module


//Oefening 4: checken van loterijnummers

{//start module loterij

	//Variabelen declareren

	int dim = 101;
	int[] winnr = new int[dim];
	int lotnr; //te checken loterijnummer
	int i; //loopvariabele voor winnr

	//initialiseren
	winnr[100] = -1;
	i = 0;

	//Opvragen loterijnummer

	System.out.println("Geef een te checken nummer op: ");
	lotnr = sc.nextInt();

	//Controle van het nummer

	while(winnr[i] != -1 && winnr[i] != lotnr)
	{
		i +=1;
	}

	//Print resultaat

	if(winnr[i] != -1)
		System.out.println("Nummer gevonden !");
	else
		System.out.println("Nummer NIET gevonden...");

}


//Oefening 5: sorteren door invoegen

{//begin module

	int dim = 12; //aantal spelers
	int[dim] nummer; //rugnummers
	int[dim] sprongen; //sprongen
	int i; //loopvariabele
	double tempSprongwaarde; //tijdelijke opslag van sprongwaarde
	int tempNummer; //tijdelijke opslag van nummer

	//Invoeren van de spelers

	System.out.println("Geef het rugnummer in: ");
	nummer[0] = receive();

	System.out.println("Geef de sprongwaarde in: ");
	sprongen[0] = receive();


	for(i=1; i<dim; i++)
	{
		
		System.out.println("Geef de sprongwaarde in: ");
		tempSprongwaarde = receive();

		System.out.println("Geef het rugnummer in: ");
		tempNummer = receive();

		while(tempSprongwaarde > sprongen[i-1])
		{
			sprongen[i] = sprongen[i-1]; //naar achter schuiven van de vorige waarde
			sprongen[i-1] = tempSprongwaarde; //invoeren van de nieuwe grotere waarde op plaats i-1
			nummer[i] = nummer[i-1]; //rugnummer ook opschuiven
			nummer[i-1] = tempNummer;//invoeren rugnummer van grotere sprongwaarde
		}
		else
		{
			sprongen[i] = tempSprongwaarde;
			nummer[i] = tempNummer;
		}
	}

}

//Oefening 6: Scheiden van positieve en negatieve getallen

{//start module

	//variabelen
	int dim = 30; 
	int[] tab = new int[dim];
	int[] pos = new int[dim]; //positieve getallen
	int[] neg = new int[dim]; //negatieve getallen
	int i; //loopvariabele

	//Aantal getallen is gekend, dus for loop gebruiken

	for(i = 0; i < dim; i++)
	{
		if(tab[i]>=0)
			pos[i] = tab[i];
		else neg[i] = tab[i];
	}

}



