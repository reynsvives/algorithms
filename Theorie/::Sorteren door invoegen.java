//Sorteren door invoegen

{//start module
	int dim; //max aantal op te slagen getallen
	int getal; //in te voegen getal
	int[] tab = new int[dim]; //tabel met getallen
	int i; //loopvariabele
	int aantalGetallen = 0; //Aantal reeds opgeslagen getallen in tab[]
	char nog = 'j'; //variabele om aan te geven dat we verder gaan

	while(aantalGetallen < dim && nog == 'j') //check of de tabel nog niet vol zit
	{
		System.out.println("Geef een volgend getal in: ");
		getal = receive();

		i = aantalGetallen - 1;

		//Checken waar het nieuwe getal kan ingeput worden

		while(i>=0 && getal < tab[i])
		{
			tab[i+1] = tab[i];
			i = i-1;
		}

		
		//Nu zijn alle getallen op geschoven en kunnen we getal invoegen op plaats i

		tab[i+1] =  getal;

		//ophogen van het aantal getallen

		aantalGetallen += 1;

		//Vragen om user input om door te gaan

		nog = receive();

	}


}