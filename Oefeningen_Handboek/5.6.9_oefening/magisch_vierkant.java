
{//start module

	//variabelen
	int dim; //dimensie van de vierkante matrix
	int[][] matrix = new int[dim][dim];
	int[] rijSommen = new int[dim]; //tabel met rijsommen
	int[] kolSommen = new int[dim]; //tabel met kolomsommen
	int rijSom; //Variabele voor opslag wanneer de rijsom wordt berekend in de loop
	int kolSom; //variabele voor opslag wanneer de kolomsom wordt berekend in de loop
	int somHD; //som hoofddiagonaal
	int somND; //som nevendiagonaal
	int i; //loopvariabele om over de rijen te lopen
	int j; //loopvariabele om over de kolommen te lopen
	int somControle; //eerste element van rijSommen. Dit wordt gebruikt om alle andere sommen af te checken en te checken of het een magisch vierkant is
	boolean magisch = true; //boolean om te bij te houden tijdens de controle van magisch vierkant of dit een magisch vierkant is

	//Opvragen input

	System.out.println("Geef de dimensie van de vierkante matrix op: ");
	dim = receive();
	System.out.println("Geef matrix zelf in: ");
	matrix = receive()

	//Berekenen van de rijsommen

	for(i=0; i<dim; i++){ //loop over rijen
		for(j=0; j<dim; j++) //loop over kolommen
		{
			rijSom += matrix[i][j];
		}
		rijSommen[i] = rijSom;
	}

	//Berekenen van de kolomsommen

	for(j=0; j<dim; j++){ //loop over kolommen
		for(i=0; i<dim; i++) //loop over rijen
		{
			 kolSom += matrix[i][j];
		}
		kolSommen[j] = kolSom;
	}

	//Berekenen van de sommen van hoofd- en nevendiagonaal

	//Hoofdiagonaal
	for(i=0; i<dim; i++)
	{
		somHD = somHD + matrix[i][i];
	}

	//Nevendiagonaal
	for(i=dim-1; i>=0; i--)
	{
		for(j=0; j<dim; j++)
		{
			somND = somND + matrix[i][j];	
		}
		
	}

	//Checken of het een magisch vierkant betreft

		//Neem eerste element van rijSommen en vergelijk dit met alle andere berekende totalen.

	somControle = rijSommen[0];

	i = 1;
	while((i < dim) && (rijSommen[i] == somControle))
	{
		i = i +1;
	}

	if(i != dim - 1)
	{
		System.out.println("De ingevoerde matrix is geen magisch vierkant")
	}
	else //ga verder met controle kolomsom
	{
		i = 0;
		while((i<dim) && (kolSommen[i] == somControle))
		{
			i = i+1;
		}

		if(i != dim - 1)
		{
			System.out.println("De ingevoerde matrix is geen magisch vierkant")
		}

		else
		{
			if(somHD == somND == somControle)
			{
				System.out.println("De ingevoerde matrix is een magisch vierkant");
			}
			else
			{
				System.out.println("De ingevoerde matrix is geen magisch vierkant");
			}

		}


	}

}