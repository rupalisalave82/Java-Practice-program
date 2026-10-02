package ClassandObject;

public class Student {
	String name ;
	int age ;
	 
	 void display()
	 {
		 System.out.println("Name : " +  name );
		 System.out.println("Age : "+ age );
	 }

	
	
	
	

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		
		s1.name= "Rupali " ;
		s1.age= 27;
		
		s1.display();

	}

}
