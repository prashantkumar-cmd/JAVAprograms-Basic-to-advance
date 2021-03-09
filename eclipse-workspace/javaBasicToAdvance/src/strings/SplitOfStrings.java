package strings;

public class SplitOfStrings {

	public static void main(String[] args) {
		String s4="we are computer science engineers !";
		
		String s5[]=s4.split(" ");
//		for(String s: s5) {
//			System.out.println(s);
//		}
		for(int i=0;i<s5.length;i++) {
			System.out.println(s5[i]);
		}
		
	}

}
