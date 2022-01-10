public class NumberP {
	public static void main(String[] args) {
		int n = 5, k = 1;
		for (int i = 0; i < n; i++) 
		{
			k=i+1;
			for (int j = 0; j < n; j++)
			{
				System.out.print(k + " "); k=k+n;
			}
			System.out.println();
		}
	}

}


