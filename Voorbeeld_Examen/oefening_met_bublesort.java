//Oefening voorbeeldexamen nr 2: bublesort

{//begin module
	//Variabelen dim
	int dim = 41; 

	//Opvragen dimensie met inputcontrole
	
	while(dim>40 || dim<0)
	{
		System.out.println("Geef het aantal in te voeren scores: ");
		dim = receive();
	}

	//declareren overige variabelen

	double[] scores = new double[dim];
	int i; //loopvariabele om scores te doorlopen
	double tempScore; //Variabele om tijdelijke de ingevoerde score in op te slaan
	int k; //index rechterelement laatst verwisseld paar.
	double mediaan;
	int midden; //Dimensie gedeeld door 2

	//initialiseren
	i = 0;
	tempScore = -1; //instellen op ongeldige waarde zodat er in de while loop gegaan wordt

	//Opvragen van de scores met inputcontrole

	while(i < dim)
	{
		//inputcontrole op de ingevoerde punten
		while(tempScore < 0 || tempScore > 20)
		{
			System.out.println("Geef score in tussen 0 en 20 (score met nummer: " + i + ")");	
			tempScore = sc.nextDouble();
		}
	
		scores[i] = tempScore
		tempScore = -1 //terug instellen op ongeldige waarde zodat in de while loop gegaan wordt
		i = i + 1; //i wordt pas verhoogd na invoeren geldige score
	}

	//Toepassen bubblesort op de scores

	i = 0; //i terugzetten naar 0 !


	while(i < dim)
	{
		for(j = dim -1; j > i ; j = j-1)
		{
			if(scores[j] < scores[j-1])
			{
				//Verwisselen van het de elementen van plaats
				tempScore = scores[j-1];
				scores[j-1] = scores[j];
				scores[j] = tempScore;
				k = j;
			}
		}
		//Laatste verwisseling was bij k. Dus we mogen i = k;
		i = k;
	}

	//Mediaan berekenen

	midden = dim /2;

	if(dim % 2 == 0) //check of rest na gehele deling 0 is om te checken of dim even is
	{

		//Indien dim even is mediaan = gemiddelde van 2 middelste elementen

		mediaan = ((scores[midden] + scores[midden -1 ])/ 2) + (dim % 2);
	}
	else
	{	
		//Indien dim oneven is, is de mediaan = middelste element (gehele deling) + 1

		mediaan = scores[midden]; //Gehele deling indien aantal elementen in Scores oneven is
	}
	
	//Output van de mediaan

	System.out.println("De mediaan is: " + mediaan);
}

