package stack;

 public class Stack {
	
	 int stack[]=new int[5];

	 int top=0;
	 
	public void push(int n) {
		stack[top]=n;
		top++;
	}
	 
	public void show() {
		 for(int datas : stack)
		 System.out.print(datas+" ");
	  System.out.println("");
	 }
	 
	public int pop() {
		 top--;
		 int data=stack[top];
		 stack[top]=0;
		return data;
	 }
	public void peak() {
		 System.out.println(stack[top-1]);
	 }
	 
	 

}
  
