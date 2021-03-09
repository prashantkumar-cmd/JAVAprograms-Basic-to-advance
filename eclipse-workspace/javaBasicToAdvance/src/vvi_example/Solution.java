package vvi_example;

import java.util.*;


public class Solution {
	static  Scanner sc = new Scanner(System.in);
  static int B=sc.nextInt();
  static int H=sc.nextInt();
  static boolean flag=true;
static {
	if(B<=0||H<=0)
		flag=false;
 try{
       if(B<=0||H<=0)
       
       throw  new Exception ( "height and breadth must be Positive");
       
 }
 catch(Exception e){
     System.out.println(e);
 }
 
}

public static void main(String[] args){
	
	
	if(flag){
		int area=B*H;
		System.out.print(area);
	}
		
	}//end of main

}//end of class
