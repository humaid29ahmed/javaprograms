import java.util.Scanner;

public class UserInput {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = input.nextLine();
		System.out.println("Enter your Age : ");
		byte Age= input.nextByte();
		System.out.println("Enter your Marks :");
        double Marks= input.nextDouble();
        
        System.out.println("NAME  :"+name);
        System.out.println("AGE   :"+Age);
        System.out.println("MARKS :"+Marks);
	}

}
