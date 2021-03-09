package generic;
class Demo <T>{
	T i;
	public void add(T i1) {
		i=i1;
	}
	public T get() {
		return i;
	}
}

public class GenClass {

	public static void main(String[] args) {
		Demo<Integer> d=new Demo<>();
		Demo<String> d1=new Demo<>();
		//Integer k=8;
		//d.add(k);
		d.add(5);
		d1.add("pk");
		 
		
        System.out.println(d.get()+" "+d1.get());
	}

}
