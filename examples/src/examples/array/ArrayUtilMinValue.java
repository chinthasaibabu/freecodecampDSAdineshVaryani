package examples.array;

public class ArrayUtilMinValue {

	public static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int minValue(int[] arr) {
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {17989511,224250,56433,5414444,554152,748586,774558,8124,9745844};
		printArray(arr);
		System.out.println(minValue(arr));
	}

}
