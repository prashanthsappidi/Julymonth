package july2nd;
public class Sorting_an_Array____________________________________________ {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,9,7,8,10,15,11,12,13,14};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int n : arr) {
			System.out.print(n+" ");
		}

	}

}
