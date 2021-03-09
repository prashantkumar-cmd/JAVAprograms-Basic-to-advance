package threading;
//threading using Runnable interface
//here it is parallel threading
class A implements Runnable{
	public void run() {
		int i;
		for(i=0;i<5;i++)
			System.out.println("class A"+i);
	}
}class B implements Runnable{
	public void run() {
		int i;
		for(i=0;i<5;i++)
			System.out.println("class B"+i);
	}
}

public class Example1 { 
	public static void main(String[] args) {
		Thread t1=new Thread(new A());
		Thread t2=new Thread(new B());
		t1.start();
		t2.start();
	}

}
