
public class pattern3 {
	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) // i=0 <11
		{
			for (int j = 0; j < 11; j++) {
				if (i == 0 || j == 0 || i == 10 || j == 10) {
					System.out.print("*");
				}

				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
