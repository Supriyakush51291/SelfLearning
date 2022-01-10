import java.util.Scanner;

public class Merging {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			{
				for (int j = 0; j < n; j++) 
				{
					//J
					if (i == 0 || j==n/2 || i==n-1 && j<=n/2 || i>=n/2 && j==0 ) 
					{
						System.out.print("*");
					} else 
					{
						System.out.print(" ");
					}
				}
				{
					System.out.print(" ");
				}
				{
					//I
					for (int j = 0; j < n; j++) {
						if (i == 0 || j == n /2 || i== n - 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					{
						System.out.print(" ");
					}
					{for (int j = 0; j < n; j++) 
					{
						//T
						if (i == 0 || j==n/2 ) 
						{
							System.out.print("*");
						} else 
						{
							System.out.print(" ");
						}}
					{System.out.print(" ");}
					{for (int j = 0; j < n; j++) 
					{
						//E
						if (i == 0 || i==n/2 || i==n-1 || j==0) 
						{
							System.out.print("*");
						} else 
						{
							System.out.print(" ");
						}}
					{System.out.print(" ");} 
					{for (int j = 0; j < n; j++) 
					{
						//N
						if (j == 0 || i==j || j==n-1) 
						{
							System.out.print("*");
						} else 
						{
							System.out.print(" ");
						}}
					{System.out.print(" ");}
					{for (int j = 0; j < n; j++) 
					{
						//D
						if (j == 0 || i==0 || j==n-1 ||i==n-1) 
						{
							System.out.print("*");
						} else 
						{
							System.out.print(" ");
						}}
					{
							System.out.print(" ");
						} {for (int j = 0; j < n; j++) 
						{
							//R
							if (j == 0 || i==0 || j==n-1 && i<=n/2 || i==n/2 || i-j==n/2) 
							{
								System.out.print("*");
							} else 
							{
								System.out.print(" ");
							}}{
								System.out.print(" ");
							} {for (int j = 0; j < n; j++) 
							{
								//A
								if (i == 0 || j==0 || j==n-1 ||  i==n/2) 
								{
									System.out.print("*");
								} else 
								{
									System.out.print(" ");
								}}
			
					System.out.println();
				}}}
			}
		}
	}
}}}}}
	
		