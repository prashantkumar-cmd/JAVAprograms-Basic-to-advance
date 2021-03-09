package strings;

public class StringFunctions {

	public static void main(String[] args) {
		String s1="prashant kumar singh";
		String s2="prashant kumar";
		String s3="prashant kumar singh";
		
		
		System.out.println("char at 4 is "+s1.charAt(4)+" ,  length of string s1 "+s1.length());
		System.out.println("substring from 4 to 9 "+s1.substring(4,9)+", and 9 to end :"+s1.substring(9));
		System.out.println( s1.contains("kumar"));
		System.out.println(s1.equals(s3));
    	System.out.println(s2.isEmpty());
		System.out.println(s2.concat(s3));
		System.out.println(s2.replace('a', 'e'));
//    	System.out.println(s4.splits(','));
	}

}
