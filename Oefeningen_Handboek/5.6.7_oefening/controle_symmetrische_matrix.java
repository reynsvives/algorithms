
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
       
    //We veronderstellen dat we de matrix gewoon kunnen inlezen met een algemene receive() functie

	int dim = 5;
	int[][] mat = {{4,6,7,8,9},
{6,1,4,5,9},
{7,4,5,3,2},
{8,5,3,1,0},
{9,9,2,0,6}}; // vierkante matrix
	boolean symmetrisch = true; //boolean om symmetrie te checken
	int i = 0; //loopvariabele rijen
	int j = 0; //loopvariabelen kolommen
	
	//Checken of de matrix symmetrisch is

		for(i=0; i < dim; i++) //loopen over de rijen
		{
			for(j = 0; j < dim; j++)// lopen over de kolommen
			{
			        System.out.println("i = " + i + " " + "j = " + j);
				if(i == j)
				{
					//doe niets op de diagonaal elementen !
				}

				if(mat[i][j] != mat[j][i]) //de niet-diagonaal elementen controleren we
				{
					symmetrisch = false;
				}
			}
		}

	

	//Output geven

	if(symmetrisch == true)
	{
		System.out.println("Matrix symmetrisch");
	}
	else
	{
		System.out.println("Matrix niet symmetrisch");
	}
       
       
       
    }
}
