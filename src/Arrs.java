
public class Arrs {
	public static void main (String args[]) {
		//pattern1();
		//pattern2();
		//pattern3();
		//pattern4();
		//pattern5();
		//pattern6();
		//pattern7();
		pattern8();
		
		
	}
  public static void pattern1() {
	  
	  {
	  System.out.print("Hello world");
	  }
  }
  public static void pattern2() {
	  int a[] =new int[5];
	  a[0]=10;
	  a[1]=60;
	  a[2]=90;
	  a[3]=77;
	  a[4]=20;
	  
	  for(int i=0; i<a.length;i++) {
		  System.out.print(a[i]);
		  {System.out.print(" ");}
	  }	  
	  
	}

	public static void pattern3() {
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 60;
		a[2] = 90;
		a[3] = 77;
		a[4] = 20;

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				System.out.print(a[i]);
				System.out.print(" ");
			}
		}
		}		

		public static void pattern4() {
			int a[] = new int[5];
			a[0] = 10;
			a[1] = 60;
			a[2] = 90;
			a[3] = 77;
			a[4] = 20;

			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 0) {
					System.out.print(a[i]);
					System.out.print(" ");
				}
			}

		}
		public static void pattern5() {
			int a[] = new int[5];
			a[0] = 10;
			a[1] = 60;
			a[2] = 90;
			a[3] = 77;
			a[4] = 20;

			for (int i = 0; i < a.length; i++) {
				if (i % 2 ==1 ) {
					System.out.print(a[i]);
					System.out.print(" ");
				}
			}

		}
		public static void pattern6() {
			int a[] = new int[5];
			a[0] = 10;
			a[1] = 60;
			a[2] = 90;
			a[3] = 77;
			a[4] = 20;

			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 ==1 ) {
					System.out.print(a[i]);
					System.out.print(" ");
				}
			}

		}
		public static void pattern7() {
			int a[] = new int[5];
			a[0] = 10;
			a[1] = 60;
			a[2] = 90;
			a[3] = 77;
			a[4] = 20;

			for (int i = 0; i < a.length; i++) {
				if (a[i] % 10 ==0 ) {
					System.out.print(a[i]);
					System.out.print(" ");
				}
			}

		}
		public static void pattern8() {
			int a[] = new int[6];
			a[0] = 10;
			a[1] = 60;
			a[2] = 94;
			a[3] = 77;
			a[4] = 20;
			a[5] = 40;
			
            int evenCount=0;
            int oddCount=0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2==0 ) {
					evenCount++;
				}else {
					oddCount++;
				}
			}
       System.out.println("count of evenCount value= " + evenCount);
       System.out.println("count of oddCount value= " + oddCount);
       
		}
	}
