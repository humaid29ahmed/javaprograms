
public class Wloop {
	public static void main(String[] args)
	{
		int value=5;
		while(value>=1)
		{
			int number=1;
			while(number<=value)
			{
				System.out.print("$ ");
				
				number++;
			}
			
			System.out.println();
			value--;
			
		}
		
	}

}
