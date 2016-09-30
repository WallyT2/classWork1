import java.util.Scanner;
/**
	* @author wWallace
	* @version 1.0
	* This program is a chatbot that will keep responding to the person running the program
	* with the same question until the user says bye or Bye. It requires the import of
	* the java function Scanner, which prompts for a user response. 
*/

public class ChatbotWallace2
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Hi! What's your name? ");
		String name = kb.nextLine(); //This is what prompts the user response.
		System.out.println(name + "? That's a nice name!");
		System.out.print("What do you want to talk about? ");
		String response = kb.nextLine();
		
		/**
			* This program uses a while loop to keep repeating the same question until
			* the user says bye or Bye. It uses a boolean response of true to keep 
			* repeating itself until one of the arguments become false. There are also
			* if statements for certain responses should the users say them.
		*/
		
		while (!response.equals("bye") && !response.equals("Bye"))
		{
				System.out.print("What else is on your mind? ");
				response = kb.nextLine();
				if (response.equals("School"))
				{
					System.out.println("That sounds rough. Try to not fail!");
				}
				if (response.equals("Friends")
				{
					System.out.print("Friends are great! Make sure you make good ones.");
				}
		}
		System.out.println("Well, it was nice talking to you. Until next time!");	
	}
	
}