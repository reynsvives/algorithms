//Oefening over tabellen uit in te dienen opdracht 2.

//Eerste module

{//Module 1

	//Declaratie van variabelen

	dim = 10;
	int[][] getallen = new int[dim][dim];
	int i; //loopvariabele voor rijen
	int j; //loopvariabele vor kolommen

	//Opvullen van de tabel

	for(i=0; i < dim; i++) //lopen over de rijen
	{
		for(j=0; j<dim; j++)
		{
			getallen[i][j] = 10 + r.nextInt(11); //random getallen tussen 10 en 20 (inbegrepen) kiezen
		}
	}
	
}

//Tweede Module

{//Module 2

	int dim = 10;
	int[] atlSommeren = new int[dim];
	int[] totaal = new int[dim]:
	int i; //loopvariabele voor rijen
	int j; //loopvariabele voor kolommen
	int rijSom;

	//Opvullen tabel atlSommeren

	for(i=0; i<dim; i++)
	{
		atlSommeren[i] = r.nextInt(11);
	}

	//Opvullen van tabel totaal

	for(i=0; i<dim; i++)
	{
		rijsom = 0;

		for(j=0; j<= atlSommeren[i] - 1; j++)
		{
			rijSom = rijSom + getallen[i][j];

		}
		totaal[i] = rijSom;
	}

}

//Derde module

{//Module 3

	int getal; //op te vragen getal bij gebruiker
	int rijNum; //rijnummer voor nieuw getal
	int kolNum; //kolomnummer voor nieuw getal
	int oudGetal; //opslaan oud getal uit getallen om te kunnen vergelijken met nieuw getal

	//Opvragen input

	System.out.println("Geef een rijnummer van 0 t.e.m 9: ");
	rijNum = sc.nextInt();

	System.out.println("Geef een kolomnummer van 0 t.e.m 9: ");
	kolNum = sc.nextInt();

	getal = sc.nextInt();

	//oud getal opslaan

	 oudGetal = getallen[rijNum][kolNum];	

	 //Vervangen van het getal in tabel getallen

	getallen[rijNum][kolNum] = getal;

	//Als kolNum <= atlSommerenrijNum] - 1 dan moeten we we mogelijks aanpassen
	//We doen - 1 omdat atlSommeren[rijNum] de rijnummers waarbij geteld wordt vanaf 1 en niet vanaf 0 !

	if(kolNum <= atlSommeren[rijNum]-1 && oudGetal != getal)
	{
		totaal[rijNum] = totaal[rijNum] + (getal - oudGetal);
	}



}

