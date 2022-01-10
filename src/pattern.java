import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Help");
		int n = s.nextInt();
		System.out.println("value "+n);
		
		String a = s.nextLine();
		System.out.println("value "+a);
//		int b= s.nextInt();
//		System.out.println("value "+b);
//		int c = s.nextInt();
//		System.out.println("value "+c);
		
		for (int i = 1; i<n; i++) {

			System.out.print("*");
		}
		s.close();
	}
}

// programs using USER INPUT "import java.util.Scanner";
// to take the input from the keyboard we have to use Scanner class which belongs to "util package".
// to take integer value as in input "nextInt()" method should be used.
// to take float value as in input "nextFloat()" method should be used.
// to take double value as in input "nextDouble()" method should be used.
// to take String value as in input "next()" method to read single line of statement
// "nextLine()" method to multiple line of statements.