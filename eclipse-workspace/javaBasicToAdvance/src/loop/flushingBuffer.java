package loop;
import java.util.Scanner;

public class flushingBuffer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        scan.nextLine(); //flushing buffer 
        String s = scan.nextLine();
         

        System.out.println("string "+s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}