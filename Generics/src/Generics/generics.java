package Generics;

class Box<T>
{
	T value;
	
	//Constructor
	Box(T value )
	{
		this.value=value;
	}
	//Display value
	void display()
	{
		System.out.println("Value:" +  value);
	}
}




public class generics {

	public static void main(String[] args) {
		 
		//Integer Box
		Box<Integer> number = new Box<>(100);
		
		
		
		//String Box
		Box<String> text = new Box<>("Hello");
		
		//Display values
		number.display();
		text.display();

	}

}
