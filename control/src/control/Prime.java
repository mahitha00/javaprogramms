package control;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	System.out.println("enter the number");
	int p =x.nextInt();
	 
	int w=0;
	for(int i =1;i<=p;i++) {
		if(p%2==0) {
			w++;
		}
	}
	if(w==2) {
		System.out.println("prime number");
	}else {
		System.out.println("not prime number");
	}

	}

}
