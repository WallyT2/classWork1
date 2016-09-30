/**


*/
public class Loops
{

	public static void whileLoop()
	{
		
		int counter = 0;
		while (counter <= 10)
		{
			System.out.println(counter);
			counter++; //counter += 1	
			
		}
		
	}
	
	public static void main(String[] args)
	{
		//call to whileLoop
		whileLoop();
		System.out.println("--------------");
		forLoop();
		System.out.println("---------------");
		NestedWhileLoop();
		System.out.println("---------------");
		NestedForLoops();
	}


	public static void forLoop()
	{
		for(int i = 1; i <= 10; i ++) //Reads i, checks it against parameter, runs the loop, then increments it 
		{
			System.out.println(i);
		}
	}
	
	public static void NestedWhileLoop()
	{
		int counter = 1;
		while (counter <= 4)
		{
			int star = 1;
			while (star <= 4)
			{
				System.out.print("*");
				star++;
			}
			System.out.println("");
			counter++;
		}
	}
	
	public static void NestedForLoops()
	{
		for(int counter = 1; counter <= 4; counter++)
		{
			for(int star = 1; star <= 4; star++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	
	
	}
		
}

