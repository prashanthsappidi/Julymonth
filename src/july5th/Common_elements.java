package july5th;

public class Common_elements {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3,4,5,6,9,7,8,17};
		for(int a:arr1) {
			for(int b:arr2) {
				if(a==b) {
					System.out.println(a);
				}
			}
		}

	}

}
