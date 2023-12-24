class Frog{
	private String Name;
	private int Age;
	
	public String getName()
	{
		return Name;
	}
	
	public int getAge() 
	{
		return Age;
	}
	
	public void setName(String Name)
	{
		this.Name=Name;
	}
	
	public void setAge(int Age)
	{
		this.Age = Age ;
	}
	
	public void setInfo(String Name, int Age)
	{
		setName(Name);
		setAge(Age);
	}
}
public class SettersandThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frog frog = new Frog();
		
		frog.setInfo("Humaid Ahmed H",22);
		
		System.out.println(frog.getName()+" is "+frog.getAge()+ " years old .");
		
		
		

	}

}
