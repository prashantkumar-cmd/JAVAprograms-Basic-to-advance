package oops;

class Superclass
{
	void display() {
		System.out.println("i am super");
	}
}
class Baseclass extends Superclass{
	
	void display() {
		super.display();
		System.out.println("i am base");
	}
	
}

public class Overriding {
	//method overriding
	public static void main(String[] args) {
		Baseclass obj=new Baseclass();
		obj.display();
	}

}
