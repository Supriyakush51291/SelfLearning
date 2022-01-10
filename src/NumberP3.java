
public class NumberP3 {

	public static void main(String[] args) {
		float sub1=76;
		float sub2=96;
		float sub3=56;
		float sub4=96;
		float sub5=86;
		float per= calculatePercentage(sub1,sub5,sub2,sub3,sub4);
		System.out.println("per = "+per);
		String str = passfail(per);
		System.out.println("your str = "+str);
		System.out.println("your result = "+passfail(per));

	}
    public static float calculatePercentage(float sub1,float sub5,float sub2,float sub3,float sub4) {
    	float sum= sub1+sub2+sub3+sub4+sub5;
    	System.out.println("sum = "+sum);
    	float percentage = (sum/500)*100;
    	return percentage;
    }
	public static String passfail(float per) {
		String result = "";
		if (per <= 33) {
			System.out.println("Fail");
			result = "Fail";
		} else if (per >= 80) {
			System.out.println("Excellent");
			result ="Excellent";
			
		} else if (per >= 75 ) {
			System.out.println("Extinction");
			result ="Extinction";
		}
		else if (per >= 60) {
			System.out.println("First Divison");
			result ="First Divison";
			
		}else {
			System.out.println("Pass");
			result ="Pass";
		}
		return result;
	}
}
