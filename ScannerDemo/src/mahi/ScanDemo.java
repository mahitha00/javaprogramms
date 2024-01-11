package mahi;
import java.util.Scanner;

public class ScanDemo {

	    public static void main(String[] args) {
	        extracted();
	        
	    }

		private static void extracted() {
			Scanner SC=new Scanner(System.in);
			
	        
	        System.out.println("welcome to mit solutions");
	        System.out.println("please enter a value");
	        int a = SC.nextInt();
	        System.out.println("please enter b value");
	        int b = SC.nextInt();
	        int result  = a+b;
	        System.out.println(" the result is:" + result);
	       
	        System.out.println("please enter short value");
	        short m = SC.nextShort();
	        System.out.println("please enter float value");
	        float z =SC.nextFloat();
	        System.out.println("please enter double value");
	        double n =SC.nextDouble();
	        System.out.println("please enter boolean value");
	        boolean w =SC.nextBoolean();
	        System.out.println("please enter string value");
	        String str=SC.nextLine();
	        System.out.println("please enter char value");
	        char c=SC.nextLine().charAt(0);
		}
	}

