/**
	* @author Wallace Truesdale
	* @version 1.0
	* This program uses nested loops to make a "staircase" out of stars. It makes one
	* staircase that goes up and makes one staircase that goes down. It uses the newly
	* learned for loops to carry out its instructions and each arguement uses two 
	* variables. The staircase output is printed out by making nested loops.
*/
public class staircase
{
	public static void main(String[] args)
	{
		StaircaseDown();
		System.out.println("---------");
		StaircaseUp();
		System.out.println("-----------");
	}
	
	/**
	* This method will print out the staircase of stars in a downward fashion.
	* 
	*/ 
	
	public static void StaircaseDown()
	{
		for(int counter = 1; counter <= 4; counter++)
		{
			int star;
			for(star = counter - 1; star >= 0; star--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	*
	*
	*/
	
	public static void StaircaseUp()
	{
		for(int counter = 4; counter >= 0; counter--)
		{
			System.out.println();
			for(int star = counter; star >= 1; star--)
			{
				System.out.print("*");
			}
		}
	}



}