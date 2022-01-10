
public class NumberP5 {
	public static void main(String[] args) {

//		Pattern();
//		Pattern1 ();
//		Pattern2 ();
//		Pattern3 ();
//		Pattern4();
//		Pattern5();
//		Pattern6();
//		Pattern7();
		Pattern8();

	}

	public static void Pattern() {

		int n = 5, k = 1;
		for (int i = 0; i < n; i++) {
			k = i + 1;
			for (int j = 0; j < n; j++) {
				System.out.print(k + " ");
				k = k + n;
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void Pattern1() {
		int n = 4;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++)
				if (i + j == n - 1) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}

			System.out.println();
		}
		System.out.println();
	}

	public static void Pattern2() {
		int n = 4;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++)
				if ((i + j) % 2 == 0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}

			System.out.println();
		}
		System.out.println();
	}

	public static void Pattern3() {
		int n = 5, k = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++)
				if (i + j <= n - 1) {
					System.out.print(k++ + " ");
				} else {
					System.out.print(" ");
				}

			System.out.println();
		}
		System.out.println();
	}

	public static void Pattern4() {
		int n =3;
			if ((n%3 == 0) && (n%5==0))
			{
				System.out.print("Chicken Dinner");
				}
				 if (n%3 == 0)
				{ 
					System.out.print("Three");
				}
				if (n%5 == 0)
				{System.out.print("five");
				}
			System.out.println();
		}
	public static void Pattern5() {
		int n=5,k=1;
				if ( n%2==1 )
			{
				System.out.print(k+2);
				}
//				 if (n%3 == 0)
//				{ 
//					System.out.print("Three");
//				}
//				if (n%5 == 0)
//				{System.out.print("five");
//				}
			System.out.println();
		}
	public static void Pattern6() {
		int n=5;
			for (int i=1; i<=n; i++)
			{
				if (i%2==0)
				{
					System.out.print(i+1);
				}
				for (int j=1;j<n; j++)
				
				{ 
					System.out.print(i);
				}
				if (i%2!= 0)
				{System.out.print(i+1);
				}				
			System.out.println();
		}
	}

//11112
//32222
//33334
//54444
//55556
	
// 5 4 3 2 1
// 10 9 8 7 6
// 15 14 13 12 11
// 20 19 18 17 16
// 25 24 23 22 21
	public static void Pattern7() {
		int n=5;
		int k=n;
			for (int i=1; i<=n; i++)
			{
				k=n*i;
				for (int j=1;j<=n; j++)
				
				{ 
					System.out.print(k-- + " ");
				}
								
			System.out.println( );
		}
	}
//	1     Traingular equation ((i*i+1)/2)
//	3 2
//	6 5 4
//	10 9 8 7
//	15 14 13 12 11
	public static void Pattern8() {
		int n=5;
		int k=1;
			for (int i=1; i<=n; i++)
			{
			 k=((i*i+1)/2);	
				for (int j=1;j<=n; j++) 
				{					
					if (i>=j)
				{ 
					System.out.print(k-- + " ");
				}
				}								
			System.out.println( );
		}
	}
}


