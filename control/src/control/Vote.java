package control;
import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
     Scanner vot=new Scanner(System.in);
     System.out.println("number of marks");
     int marks = vot.nextInt();
     if(marks>91 && marks<100) {
    	 System.out.println("your grade is a");
     }else if(marks>=80) {
    	 System.out.println("your grade is b");
     }else if(marks>=70) {
    	 System.out.println("your grade is c");
     }else if(marks>=60) {
    	 System.out.println("pooyi maali rasko edxam");
     }
	}

}
