/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args)
	{ int rows=4;
	    for (int i=0; i<rows; i++) //outer loop for number of rows(n)
        { 
        for (int j=rows-i; j>1; j--) //inner loop for spaces
        { 
            System.out.print(" "); //print space
        }  
        for (int j=0; j<=i; j++ ) //inner loop for number of columns
        { 
            System.out.print("* "); //print star
        } 
            System.out.println();
        }
    }
}
