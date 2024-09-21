package Assignment;

public class FibonaaciSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int input=13;
		 int a=0;
		 int b=1;
		 
		 System.out.println("Fibonacci Series up to " + input + ":");
	        
	        
	        for (int i = 0; i <= input; i++) {
	            switch (i) {
	                case 0:
	                    System.out.println(a); 
	                    break;
	                case 1:
	                    System.out.println(b); 
	                    break;
	                default:
	                    int c = a + b; 
	                    if (c <= input) {
	                        System.out.println(c); 
	                       
	                        a = b; 
	                        b = c; 
	                    }
	                    break;
	            }
	        }
	}
}
