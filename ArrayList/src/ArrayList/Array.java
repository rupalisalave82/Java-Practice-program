package ArrayList;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Rupali");
		names.add("Pranali");
		names.add("Omkar");
		
		for(String name : names)
		{
			System.out.println(name);
		}

	}

}
