import java.util.*;

public class switchcases {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

//		Switch1();
//		Switch2();
//		Switch3();
//		Switch4();
//		Switch5();
//		Switch6();
		Switch7();
	}

	public static void Switch1() {
		int choice = 2;
		switch (choice) {
		case 1:
			System.out.println("Hello");
			break;
		case 2:
			System.out.println("Welcome");
			break;

		default:
			System.out.println("Wrong input");
		}
	}

	public static void Switch2() {
		Scanner s = new Scanner(System.in);
		int a[] = new int[] { 10, 20, 5, 10, 3, 5, 6, 20 };
		System.out.println(" Enter the Key element is Search:");
		int key = s.nextInt();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (key == a[i]) {
				count++;
			}
		}
		System.out.println(" The Key element is present " + count + " time/s");
	}

	public static void Switch3() {
		Scanner s = new Scanner(System.in);
		int a[] = new int[] { 10, 20, 5, 10, 3, 5, 6, 20 };
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void Switch4() {
		Scanner s = new Scanner(System.in);
		int a[] = new int[] { 10, 20, 5, 10, 3, 5, 6, 20 };

		for (int i = 0; i < a.length; i++)

		{
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i] + " ");

		}
	}

	public static void Switch5() {
		Scanner s = new Scanner(System.in);
		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < a.length; i++)

		{
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i] + " ");

		}
	}

	public static void Switch6() {
		Scanner s = new Scanner(System.in);
      int a [] = new int[] {1,2,3,4,5,6,7,8,9,10};
      for (int i=0; i<a.length; i++)
      {for (int j=0; j<a.length; j++)
      {
  //  	  if (a[i]) <a[j]) 
    		  {
    	  int sup = a[i] ;
    	  
      }
    		  }
    	  }
      }
	public static void Switch7() {
		Scanner s = new Scanner(System.in);
		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n=3;
		for (int i = 0; i < a.length; i++)

		{
			for (int j = 0 ; j < a.length; j++) 
			{
				System.out.print(i);
				
				}
			System.out.println(" ");
			}
			
		}
}



