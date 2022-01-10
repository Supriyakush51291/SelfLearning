public class NumberP1 {
	public static void main(String[] args) {
		int n = 4, k = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				{
					if (i % 2 == 0) 
					{
						System.out.print(1);
					} 
					else 
					{
						System.out.print(0);
					}
				}
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

// 0,2,4,6,8 .....even = 1
// 1,3,5,7 ........odd = 0
// % ( modulus) ---> reminder
// 1%2=0 ---> T/F ----> F
// 0%2=0 ---> T/F ----> T