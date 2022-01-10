
public class Evenodd {

	public static void main(String[] args) {

		// test();
		// testIfcon();
		// test1();
		test2();

	}

	public static void testIfcon() {
		int n = 7;

		if (n % 5 >= 2) {
			System.out.println("Even 2");
		} else if (n % 5 > 1) {
			System.out.println("Even 1");
		} else if (n % 5 > 3) {
			System.out.println("Even 3");
		} else {
			System.out.println("Odd");
		}
	}

	public static void test() {
		int n = 7;

		if (n % 5 >= 2) {
			System.out.println("Even 2");
		} else if (n % 5 > 1) {
			System.out.println("Even 1");
		} else if (n % 5 > 3) {
			System.out.println("Even 3");
		} else {
			System.out.println("Odd");
		}
 }
      public static void test1() { 
    	  int n= 7;
    	  
    	  if(n%2==0)
    		  System.out.println("Even");
    		  
    	  else
        	   System.out.println("odd");
               	  
      }
  public static void test2() {
	    int n=4 ;
	    		
	    if (n==0)
	    	System.out.println("nothing");
	    else if (n%2==0)
	    		System.out.println("even");
	    	else 
	    		System.out.println("Odd");
  }
	  
  }
