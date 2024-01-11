package control;
import java.util.Scanner;
public class For {

	public static void main(String[] args) {
		Scanner pm=new Scanner(System.in);
		System.out.println("enter the number");
		int x=pm.nextInt();
		 int factCount=0;
		 for(int i=1;i<=x;i++) {
			 if(x%2==0) {
				 factCount++;
				 
			 }
				 
		 }
		 if(factCount==0)
			 System.out.println("the number is prime");
	else {
		System.out.println("the number is not prime");
	}
}
}