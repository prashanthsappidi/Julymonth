package july1st;

public class Merge_Arrays {

	public static void main(String[] args) {
		int[] arr1 = {1,2,5,3};
		int[] arr2 = {8,4,5,3};
		int[] merged_array = new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			merged_array[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			merged_array[arr1.length+i] = arr2[i];
		}
		
		for(int n:merged_array) {
			System.out.print(n+" ");
		}

	}

}
