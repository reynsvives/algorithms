//Oefeningen reeks 3

//Oefening 13: aantal keren getal tellen
//Lees een rij gehele getallen in afgesloten door een nul. De getallen kunnen positief en negatief zijn. 
//Geef aan hoeveel keer het kleinste getal in de ingelezen rij voorkomt.


{//start module

	//variabelen

	int getal; //in te lezen getal
	int min; //kleinste getal
	int atlMin; //Aantal keer dat kleinste getal (min) voorkomt

	//initialiseren

	//Eerste getal
	System.out.println("Geef een nieuw getal in: ");
	getal = receive();

	min = getal;
	atlMin = 0;

	//Inlezen getallen

	while(getal != 0)
	{
		//Min aanpassen

		if(getal < min)
		{
			min = getal;
			atlMin = 1; //als het minimum wordt aangepast, moeten we ook de teller voor atlMin terug op 1 zetten
		}

		//Als huidig minimum terug wordt ingelezen, moeten we atlMin ophogen met 1

		if(getal == min)
		{
			atlMin += 1; //ophogen aantal min
		}

		//nieuw getal
		System.out.println("Geef een nieuw getal in: ");
		getal = receive();
	}

	if(atlMin != )
		System.out.println("Het kleinste getal is " + min + " en dit komt " + atlMin + " keer voor: ");
	else 
		System.out.println("Geen getallen ingevoerd !");
}//einde module




//Oefening 14: plaats grootste getal;

{//start module

	//variabelen
	int getal; //in te lezen getal
	int plaatsGG; //plaats grootste getal
	int grootsteGetal; //Opslaan grootste getal
	int teller; //teller om positie van getal bij te houden

	//initialiseren

	plaatsGG = 0; //we tellen de positie zoals in arrays vanaf 0
	grootsteGetal = 0;
	teller = 0;

	//Opvragen van getallen zolang er geen 0 ingegegeven wordt

	while(getal != 0)
	{
		System.out.println("Geef een volgend getal in (0 om af te sluiten): ");
		getal = receive();

		if(getal > grootsteGetal)
		{
			grootsteGetal = getal;
			plaatsGG = teller;
		}

		teller += 1; //Ophogen van de teller

	}

	//Printen van de positie van het grootste getal

	System.out.println("Het grootste getal is gevonden op positie: " + plaatsGG);

}

//Opgave 15: gemiddelde berekenen

{//start module

	//Lees een rij gehele getallen in. Bereken het gemiddelde van alle ingegeven getallen als je weet dat de rij 
	//afgesloten wordt door twee opeenvolgende nullen, die niet meetellen voor de berekening van het 
	//gemiddelde (er kunnen dus “eenzame” nullen voorkomen ergens midden in de rij).

	int nieuwGetal; //nieuw in te voeren getal
	int vorigGetal; //vorig ingevoerd gedtal
	int som; //som van getallen in de rij
	int atlGetallen; //aantal ingevoerde getallen - 2 (= laatste twee nullen niet meetellen)
	double gemiddelde;

	//Initialiseren

	System.out.println("Geef een nieuw getal in (twee op eenvolgende nullen om af te sluiten");
	vorigGetal = receive();

	System.out.println("Geef een nieuw getal in (twee op eenvolgende nullen om af te sluiten");
	nieuwGetal = receive();

	som = vorigGetal;
	atlGetallen = 1;

	//Getallen 

	while(vorigGetal != 0 || nieuwGetal != 0) //Wet van De Morgen (not(A==0 and B==0) = not(A==0) or not(B==0))
	{
		som = som + nieuwGetal;
		atlGetallen = atlGetallen + 1;

		//VorigGetal updaten naar laatst ingevoerde getal
		vorigGetal = nieuwGetal;

		//nieuw getal vragen 
		System.out.println("Geef een nieuw getal in (twee op eenvolgende nullen om af te sluiten");
		nieuwGetal = receive();

	}

	//Op moment dat while loop afbreekt (= 2 opeenvolgende null ingevoerd) hebben we 1 getal te veel geteld bij atlGetallen.
	//Dit moeten we terug aftrekken want de 0 was geen intermediaire 0

	atlGetallen = atlGetallen - 1;

	//Bereken gemiddelde

	if(atlGetallen == 0)
	{
		System.out.println("Er zijn geen getallen ingevoerd !")
	}
	else{
		
		gemiddelde = som / atlGetallen;
		
		//Print gemiddelde
		System.out.println("Gemiddelde: " + gemiddelde);
	}

	

	


}



