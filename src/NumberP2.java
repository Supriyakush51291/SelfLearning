import java.util.Scanner;

public class NumberP2 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
			
                   if (i+j>=n-1)
				{
					System.out.print(i); 
				}
				else 
				{
					System.out.print(" ");
				}
			    }
			        System.out.println();
		}		
	}
}
