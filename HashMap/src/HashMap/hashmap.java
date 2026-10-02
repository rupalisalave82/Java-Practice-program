package HashMap;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args)
	{
	HashMap<Integer,String> students = new HashMap<>();
	
	students.put(1, "Rupali");
	students.put(2,"Pranali");
	students.put(3, "Neha");
	
	System.out.println(students.get(1));
	System.out.println(students);

	}

}
