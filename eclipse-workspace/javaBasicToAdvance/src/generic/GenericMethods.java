package generic;
class Gen{
	
	public <E> void PrintArray(E s[]) {
		 
		 for(E g:s)
		System.out.println(g);
	
		 
	}
}

public class GenericMethods {
	

	public static void main(String[] args) {
		Gen a=new Gen();
		
		String country[]=  {"india","srilanka"};
		Integer n[]= {6,7,8,5};
		
		a.PrintArray(country);
		a.PrintArray(n);
		
		
	}

}
