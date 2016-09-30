/**
*@ author Wallace Truesdale
*@ version 1.0
* Monty Hall Simulator 
* This simulation will show the percent of winning when staying versus the perent of
* winning when switching doors for the Monty Hall game. It uses a random module to
* simulate the player choices as well as which door contains the door. It uses a 
* combination of int and double primitive types to truncate the final percent number.
*/

public class MontyHallSimulator
{

	public static void main(String[] args) //formal parameter
	{
		String input = args[0];
		int numSim = Integer.parseInt(args[0]);
		System.out.println(numSim);
		
		int switchWin = 0;
		
		for(int i = 0; i < numSim; i++)
			switchWin += game();
		
		double percentswitch = format ((double) switchWin/numSim * 100);
		double percentstay = format (100 - percentswitch);
		
		System.out.println("% switch win: " + percentswitch);
		System.out.println("% stay win: " + percentstay);
	
	}
	
	/**
	*This method takes in a double and truncates it 2 decimal places
	*@param d the double input to be truncated
	*@return double formatted to 2 decimal places
	*	
	*/
	
	public static double format(double d)
	{
		int a;
		a = (int) (d * 100);
		return a/100.0; 
	}
	
	/**
	*
	* @return int return 1 if switch win, otherwise 0
	*/
	
	public static int game()
	{
		int car = (int)(Math.random() * 3 + 1);
		int choice = (int)(Math.random() * 3 + 1);
		
		 
		if (choice == car)
			return 0;
		else
			return 1;
	}


}