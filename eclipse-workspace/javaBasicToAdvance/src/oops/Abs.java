package oops;
abstract class motor{
	abstract void gear();
	 public void wheels() {
		System.out.println("there are 2 wheels");
	}
}
class scooty extends motor{
	void gear() {
		System.out.println("scooty has no any gear");
	}
}
class bike extends motor{
	void gear() {
		System.out.println("bikes are having 4 gear system");
	}
}

public class Abs {
	public static void main(String[] args) {
		scooty s1=new scooty();
		s1.gear();
		s1.wheels();
		bike b1=new bike();
		b1.gear();
		b1.wheels();
		
	}

}

