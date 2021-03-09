package queue;
class Queuedemo{
	int myQueue[]=new int[5];
	
	int top=0,bottom=0;
	void push(int n) {
		myQueue[top]=n;
		top++;
	}
	int pop() {
		int item=myQueue[bottom];
		myQueue[bottom]=0;
		bottom++;
		return item;
		
	}
	void show() {
		for(int i=0;i<5;i++) {
			System.out.print(" "+myQueue[i]);
		}
	}
}

public class QueueEx {
	
	public static void main(String args[]) {
		Queuedemo q=new Queuedemo();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.show();
		System.out.println();
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		q.show();

		
		
	}

}
