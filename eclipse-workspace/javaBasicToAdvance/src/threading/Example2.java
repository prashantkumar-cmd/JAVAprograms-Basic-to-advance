package threading;
class C extends Thread{
	public void run() {
		for(int i=0;i<=4;i++)
			System.out.println("class A"+i);
	}
}class D extends Thread{
	public void run() {
		for(int i=0;i<=4;i++)
			System.out.println("class B"+i);
	}
}

public class Example2 {

	public static void main(String[] args) {
	  C o1=new C();
	  D o2=new D();
	  o1.start();
	  o2.start();
	}

}
