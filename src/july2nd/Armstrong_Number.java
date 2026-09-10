package july2nd;

public class Armstrong_Number {

	public static void main(String[] args) {
		
		int n = 153;
		int sum=0;
		int original=n;
		
		while(n!=0) {
			
			int digit = n%10;
			sum=sum+(digit*digit*digit);
			n=n/10;
		
		}
		if(sum==original) {
			System.out.println("It is a ArmStrong Number");
		}else {
			System.out.println("It is not a ArmStrong Number");
		}

	}

}
