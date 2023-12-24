import java.util.Scanner;

public class Sstatement {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter a Text :");
		String text = ob.nextLine();
		switch(text)
		{
		case "start":
			System.out.println("Machine Started !!!!");
			break;
		case "stop":
			System.out.println("Machine Stopped !!!!");
			break;
		default:
			System.out.println("Text not recognized.");
		}

	}

}
