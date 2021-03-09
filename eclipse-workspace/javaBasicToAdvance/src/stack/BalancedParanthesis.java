package stack;
import java.util.*;
class Stack2{
	char stack[]=new char[200];
	int top=0;
	public void push(char c) {
		stack[top]=c;
		top++;
	}
	public void pop() {
		top--;
		stack[top]='\u0000';
	}
	public char Top() {
		char v=stack[top-1];
		return v;
	}
	public boolean empty() {
		if(stack[0]=='\u0000')
		
	      return true;
		else 
			return false;
		
	}
}

public class BalancedParanthesis {
	Stack2 s=new Stack2();
	
	public boolean arepair(char opening , char closing) {
	    if(opening =='('&& closing==')') 
	    	return true;
	    else if (opening=='{'&& closing=='}') 
	    	return true;
	    else if (opening=='['&& closing==']') 
	    	return true;
	    else 
	    	return false;
	}
	public boolean balancedparanthesis(String exp ) {
		/*
		 * int i=0; if(exp.charAt(i)==')'||exp.charAt(i)=='}'||exp.charAt(i)==']' )
		 * return false; else {
		 * 
		 * for(i=0;i<exp.length();i++) {
		 * if(exp.charAt(i)=='('||exp.charAt(i)=='{'||exp.charAt(i)=='[') {
		 * s.push(exp.charAt(i)); } else
		 * if(exp.charAt(i)==')'||exp.charAt(i)=='}'||exp.charAt(i)==']' &&
		 * arepair(s.Top(),exp.charAt(i))) { s.pop(); } else { return false;
		 * 
		 * } } }
		 * 
		 * if(s.empty()) return true; else return false;
		 */
		for(int i=0;i<exp.length();i++) {
			if(exp.charAt(i)=='('||exp.charAt(i)=='{'||exp.charAt(i)=='[')
				s.push(exp.charAt(i));
			else if(exp.charAt(i)==')'||exp.charAt(i)=='}'||exp.charAt(i)==']')
			{
				if(s.empty()||!arepair(s.Top(),exp.charAt(i))) {
				
					return false;}
				
				else
					s.pop();
				
			}
		}
		return s.empty()?true:false;
}
	
	public static void main(String[] args) throws NullPointerException {
		Scanner sc=new Scanner(System.in);
	   String expression=sc.next();
	BalancedParanthesis bp=new BalancedParanthesis();
	if(bp.balancedparanthesis(expression)) {
		System.out.println("balanced");
	}
	else System.out.println("not balanced"); 
		
  }

}
