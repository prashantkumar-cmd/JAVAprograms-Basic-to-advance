package oops;
interface polygon{
	int x=0;//final,static,public
	
	 void getarea(int l, int b); //abstract , public
	
}
class Rect implements polygon{
	
	
	public void getarea(int l,int b) {
		
		System.out.println("the area of rectangle is"+l*b);
	}
}
class square implements polygon{
	public void getarea(int l,int b) {
		System.out.println("the area of square is"+l*l);
		
	}
}

public class Inf {

	public static void main(String[] args) {
	  square obj1=new square();
	  obj1.getarea(2, 0);
	  Rect obj2=new Rect();
	  obj2.getarea(12, 2);
	}

}
