import java.util.Scanner;

/**
* @ author Wallace Truesdale
* @version 1.0
* 
*
*/

public class MontyHall
{
	//void is a procedure
	public static void main(String[] args)
	{
		//welcome
		welcome();
		game();
	
	}
	
	public static void welcome()
	{
		System.out.println("Monty Hall Game");
		System.out.print("Pick a door number first. ");
		System.out.print("You will have a chance to switch ");
		System.out.println("after a door has been revealed.");
		//print out 3 doors
	
	}

	public static void game()
	{
		Scanner kb = new Scanner(System.in);
		int car = (int) (Math.random() * 3 + 1);
		 
		
		//testing
		System.out.println("car = " + car);
		
		System.out.print("Please choose a door (1, 2, 3): ");
		int user_choice = kb.nextInt();
		
		//get rid of the newline from the buffer
		kb.nextLine();
		
		System.out.println("You chose a door #: " + user_choice);
	
		int reveal = doorToReveal1(car, user_choice);
		
		//testing
		System.out.println("Open door is " + reveal);
		
		//ask the user if they want to switch
		System.out.print("Do you want to switch? ");
		String answer = kb.nextLine();
		
		//testing
		System.out.println("You have said " + answer);
		
		if(answer.equals("yes"))
		{
			user_pick = doorToReveal1(user_pick, reveal);
		}		
		
		if (car == user_pick)
			System.put.println("You win!!");
		else
			System.out.println("Sorry! You lose!!!");
		
	}
	
	//int returns an int value
	public static int doorToReveal(int c, int u)
	{

		for(int i = 1; i < 4; i++)
		{
			if (i != c && i != u)
			{
				return i;
			}		
		}
		return -1;
	}
	
	public static int doorToReveal1(int c, int u)
	{
		int r = (int)(Math.random() * 3 + 1);
		while( r == c || r == u )
		{
			r = (int)(Math.random() * 3 + 1);
		}
		return r;
	
	
	}











}