
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
       
       	//variabelen declareren

	int dim; //dimensie van de vierkante matrix 
	int i; //loopvariabele voor de rijen
	int j; //loopvariabele voor de kolommen
	String printMat = ""; //Variabele om matrix te kunnen printen

	//Input vragen voor de dimensie

	System.out.println("Geef de dimsnie op van de aan te maken matrix: ");
	dim = sc.nextInt();
    
    //Toekennen dimensie aan de matrix
    
    int[][] mat = new int[dim][dim];

	//Opvullen van matrix mat

	for(i = 0; i < dim; i++)
	{
		for(j = 0; j < dim; j++)
		{
			System.out.println("Geef een geheel getal in voor de positie (" + i + ", " + j + ")");
			mat[i][j] = sc.nextInt();
		}
	}

	//Print de matrix

	for(i = 0; i < dim; i++)
	{
		for(j = 0; j < dim; j++)
		{
			printMat += mat[i][j] + " ";
		}
		
		printMat += "\n";
	}

	//Print "printmat"

	System.out.println("De matrix is: ");
	System.out.println(printMat);
       
       
       
    }
}
