package Assignment;

public class FindIntersection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {3,2,11,4,6};
	       int [] b = {1,2,8,4,9,7};
	       int lengthA = a.length;
	       int lengthB = b.length;
	       
	       for (int i = 0;i < lengthA ; i++){
	       for (int j = 0;j < lengthB ; j++) {
	    	   
	    	   if(a[i] == b[j]) {
	    		   System.out.println("Matching element is :" +a[i]);
	    	   }
	       }
	       }
	}
}
