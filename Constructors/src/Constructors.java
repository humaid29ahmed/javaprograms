class Machine{
	private String Name;
	private int Age;
	
	public Machine()
	{
		this("Nabeela Fathima H", 24);// this method should be called first before printing statement .
		System.out.print("Introducing");
		
	}
	
	public Machine(String Name, int Age)
	{
		this.Name=Name;
		this.Age=Age;
		
		System.out.println("Hi, I am "+Name+" and I am "+Age+" years old.");
	}
}
public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine machine = new Machine("Humaid Ahmed H",22);
		Machine machine1 = new Machine();
		
		

	}

}
