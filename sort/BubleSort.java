package sort;

public class BubleSort {

	public static void main(String[] args) {
		int[] arr = {5,1,3,6,2};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}

	}

}
