import java.util.Scanner;
public class DWLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value = 0;
		do
		{
			System.out.print("Enter a Number :");
			value=scanner.nextInt();
			System.out.println();
		}while(value != 5);
		
		System.out.println("Got 5!!!!!");
		
	}

}
