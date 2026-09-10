package july4th;

public class Swap_Two_Strings_Without_Third_Variable {

	public static void main(String[] args) {
		
		String a = "Prashanth";
		String b = "keerthi";
		
		System.out.println("Before Swapping");
		System.out.println("a = Prashanth");
		System.out.println("b = keerthi");
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("After Swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}

}
