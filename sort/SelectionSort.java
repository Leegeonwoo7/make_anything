package sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {5,1,3,6,2};
		
		for(int i=0; i<arr.length-1; i++) {
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int tmp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = tmp;
		}
		
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}

	}

}
