class Robot
{
	String Name;
	int Age;
	String getName() {
		return Name;
	}
	
	int getAge() {
		return Age;
	}
	
	void speak(String txt)   // Passing parameters to the method.
	{
		System.out.println(txt);
	}
	
	void jump(int jump)
	{
		System.out.println("jumping :"+jump);
	}
	
	void moving(String directions, int distance)
	{
		System.out.println("I have travelled "+distance+ " meters towards "+directions+" .");
	}
	
}
public class Instructions {
	public static void main(String[] args) {
		
		Robot robot = new Robot();
	    robot.Name="Humaid Ahmed";
	    robot.Age=22;
		int jump=7;
		int distance= 28;
		String directions= "South";
		String txt = "Hello, I am "+robot.Name+" and my age is "+robot.Age+" years old .";
		robot.speak(txt);
		robot.jump(jump);
		robot. moving(directions,distance);
		
		
		
	}

}
