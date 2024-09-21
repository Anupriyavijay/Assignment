package Assignment;

public class Isprime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = 49; // You can change this number to check others

	        // Check if the number is smaller than or equal to 1
	        if (number <= 1) {
	            System.out.println(number + " is not a prime number."); //  it's not prime
	        } else {
	            // Assume the number is prime
	            boolean isPrime = true;

	            // Look at each number from 2 to just before the number we picked
	            for (int i = 2; i < number; i++) {
	                // If we find a number that divides evenly into our number
	                if (number % i == 0) {
	                    isPrime = false; // Say it's not prime
	                    break; // Stop looking
	                }
	            }

	            
	            // Tell if the number is prime or not
	            if (isPrime) {
	                System.out.println(number + " is a prime number."); // It's prime
	            } else {
	                System.out.println(number + " is not a prime number."); // It's not prime
	            }
}
	}
}
