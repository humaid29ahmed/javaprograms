
class Person
{
	String Name;
	int Age;
	
	void speak() {
		System.out.println("Hello, I am "+Name+" and I am "+Age+" years old.");
	}
	
	String getName() { //It is a get method where we can access a data which are restricted.
		return Name;
	}
	int getAge() {    //It is a get method where we can access a data which are restricted.
		return Age;  
	}
	
	
}
public class People { //Class Name should always start with Capital letter.

	public static void main(String[] args) {
		Person person1 = new Person (); //Creation of an Object of a Class
		person1.Name="Humaid Ahmed H";
		person1.Age=22;
		//person1.speak();
		
		Person person2 = new Person ();
		person2.Name = "Masood Ahmed H";
		person2.Age = 64;
		//person2.speak();
		
		String name=person1.getName();
		int age = person1.getAge();
		System.out.println(name+" is "+age+" years old.");
		
		
		/*System.out.println(person1.Name +" "+ person1.Age);
		System.out.println(person2.Name +" "+ person2.Age);*/

	}

}
