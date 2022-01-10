import java.util.Scanner;

public class AssignmentK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// printk(n);
		// printN(n);
		//printA(n);
		// printAgap(n);
		printBgap(n);
	}
	public static void printk(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i + j == n/2 || j==n-1)
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void printN(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i==j || j==n-1) 
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

public static void printA(int n) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (i==0 && j<=n/2 || i==n/2 && j<=n/2 || j==0 || j==n/2) 
			{
				System.out.print("*");
			} else 			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
public static void printAgap(int n) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (i==0 && j!=0 && j!=n-1 || j==0 && i!=0 || j==n-1 && i!=0 || i==n/2) 
			{
				System.out.print("*");
			} else 			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
	public static void printBgap(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==0 && j!=0 || j==0 || i==n/2 && j!=0 || i==n-1 && j!=n-1) 
				{
					System.out.print("*");
				} else 			{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}