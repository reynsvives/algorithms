
{//Oefening voor berekenen van (1+x)^n via reeksontwikkeling

//Er kan aangetoond worden dat vanaf de 3de term volgend patroon geldt:
	//ide term = (i-1)ste term * [(n-(i-1))x / (i-1)]
	//i start dus vanaf 3 
	//De eerste twee termen zijn 1 en n * x

//Declareren van de variabelen

int x;
int n;
int term; //de laatst berekende term
int resultaat; //variabele voor opslag van het resultaat van de reeksontwikkeling
int i;

//Opvragen van input voor x en n

System.out.println("Geef een waarde voor x: ");
x = receive();

System.out.println("Geef een waarde voor n: ");
n = receive();

//Initialiseren van de variabelen
term = n * x;
resultaat = 1 + term;
i = 3; //We starten met het verder rekenen van de termen via het recursief voorschrift vanaf de 3de term

//In totaal zijn er n + 1 termen. De eerste twee termen gaan we echter niet in de for loop opnemen omdat het vast patroon start vanaf de 3de term.
//Gezien het aantal termen gekend is, gebruiken we een for loop.

for(i = 3; i <= n ; i++){
	term = term * ((n-(i-2))*x/(i-1)); //term uitrekenen volges recursief voorschrift
	resultaat += term; //resultaat ophogen met laatst berekende term
}

//Printen van het resultaat

System.out.println("Resultaat is: " + resultaat);

} //einde module
