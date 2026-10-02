package Lambda;


interface Greeting
{
	void sayHello();
	
}
public class lambda {

	public static void main(String[] args) {
		Greeting g = () -> System.out.println("Hello Java");
		
		g.sayHello();

	}

}
