package oops;
//data hiding
class Abc{
	private int age;
  public void setage(int n) {
	  age=n;
  }
 
	
  public int getage(){
	  return age;
		}
	
	
}
public class Main extends Abc {
	public static void main(String []args) {
	Main obj=new Main();
	obj.setage(19);
	System.out.println(obj.getage());
	}
	}
	
		
	
	


