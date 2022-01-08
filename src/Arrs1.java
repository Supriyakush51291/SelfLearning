
public class Arrs1 {
 public static void main(String[] Args) {
	 //Pattern1();
	 //Pattern2();
	 Pattern3();
 }
 public static void Pattern1() {
	 int sum=0;
	 int a[] = new int [] {1,2,3,4,5};
	 System.out.println ("sum of array elements");
	 for (int i=0; i<a.length;i++)
	 {
		 sum+=a[i];	 
	 }
	 System.out.println("sum = "+sum);
 }
 public static void Pattern2() {
	 int oddsum=0;
	 int evensum=0;
	 int a[] = new int [] {1,2,4,5,6};
	 System.out.println ("sum of array elements");
	 for (int i=0; i<a.length;i++)
	 {
		if (i%2!=0)	
		{
			oddsum+=a[i];
		}
		if(i%2==0) {
			evensum+=a[i];
		}
	 }
	 System.out.println("sum of odd index " + oddsum);
	 System.out.println("sum of even index " + evensum);
	 
 }
 public static void Pattern3() {
	 int oddsum=0;
	 int evensum=0;
	 int a[] = new int [] {1,8,4,7,6};
	 System.out.println ("sum of array elements");
	 for (int i=0; i<a.length;i++)
	 {
		if (i%2!=0)	
		{
			oddsum+=a[i];
		}
		if(i%2==0) {
			evensum+=a[i];
		}
	 }
	 System.out.println("sum of odd index " + oddsum);
	 System.out.println("sum of even index " + evensum);
}
}
