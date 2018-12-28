
//Declareren 2-dimensionale array


int dimWerkDagen = 5; //Al aangemaakt volgens de opgave maar hier voor de volledigheid toch vermeld. 
int[] werkdagen = new int[5]; //Al aangemaakt volgens de opgave maar hier voor de volledigheid toch vermeld. 
int dimUren = 8;
String[][] lesrooster = new String[dimWerkDagen][dimUren];
int i; //loopvariabele voor de dagen
int j; //loopvariabele voor de uren


//Populeren van de tabel

for(i=0; i < dimWerkDagen; i++) //loopen over de werkdagen
{

	//Stop in onze 2 dimensionale array ook de namen van de dagen uit array werkdagen

	lesrooster[i] = werkdagen[i];

	for(j=0; j< dimUren; j++)
	{
		//Invoerboodschap voor dag i+1 om uur j+1

		int dag = i + 1
		int uur = j + 1;
		String inputCorrect = false;
		char inputValue;

		while(inputCorrect = false)
		{

			System.out.println("Dag " + dag + ", uur " + uur + ": ");
			inputValue = receive();

			if(inputValue.equals("L") || inputValue.equals("V")) //Check of inputwaarde L of V is.
			{
				lesrooster[i][j] = inputValue; //opslaan geldige inputwaarde L of V 				
				inputCorrect = true; //aanpassen inputCorrect waarde zodat while loop stopt voor iteratie i, j.
			} 
		}//end while loop
	}//end loop j
}//end loop i

//Printen van namen van dagen waarop je vrij bent op 4de lesuur

for(i = 0; i<dimWerkDagen; i++){

	char lesrooster_i_4 = lesrooster[i][4];

	if(lesrooster_i_4.equals("V")){
		System.out.println("Op " + lesrooster[i] + " is er tijd voor een middaglunch");
	}
}
