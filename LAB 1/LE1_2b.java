/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args)
	{ int rows=4;
	    for (int i= 0; i<= rows-1 ; i++)
        {
        for (int j=0; j<=i; j++)
        {
            System.out.print(" ");
        }
        for (int k=0; k<=rows-1-i; k++)
        {
            System.out.print("*" + " ");
        }
        System.out.println();
        }
    }
}
