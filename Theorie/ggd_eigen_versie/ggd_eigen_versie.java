//Algoritme voor berekening van ggd(x, y): eigen versie

//Declareren variabelen
int x;
int y;
int hulpvarX;
int hulpvarY;

//Input van x en y voor berekening ggd(x, y)

System.out.println("Geef opeenvolgend x en y voor berekening ggd(): ");

x = sc.nextInt();
y = sc.nextInt();

//Toekennen hulpvariabelen

hulpvarX = x;
hulpvarY = y;

//Algoritme voor berekening ggd(x, y)

	//Checken of x == y ==> ggd(x, y) = x

if(hulpvarX == hulpvarY)
{
	System.out.println("Resultaat ggd(" + x + "," + y + "): " + x);

}
else {
	while(hulpvarX != hulpvarY)
	{
		if(hulpvarX > hulpvarY)
		{
			hulpvarX = hulpvarX - hulpvarY;
		}
		else 
		{
			hulpvarY = hulpvarY - hulpvarX;
		}
	}// end while
	//Printen resultaat als x != y

System.out.println("Resultaat ggd(" + x + "," + y + "): " + hulpvarX);
}



