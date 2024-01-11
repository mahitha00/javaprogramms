package array;

public class Missing {

	public static void main(String[] args) {
		// public class GCDExample {
	    // Function to find GCD using the Euclidean algorithm
	    static int findGCD(int a, int b) {
	        // Base case: If b is 0, GCD is a
	        if (b == 0) {
	            return a;
	        } else {
	            // Recursively call the function with b and remainder of a divided by b
	            return findGCD(b, a % b);
	        }
	    }

	   
	        int num1 = 48;
	        int num2 = 18;

	        // Calculate GCD of num1 and num2
	        int gcd = findGCD(num1, num2);
	        
	        // Display the GCD
	        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
	    }
	}
}


	}

}
