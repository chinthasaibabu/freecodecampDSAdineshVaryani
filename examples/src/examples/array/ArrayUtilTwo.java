package examples.array;

public class ArrayUtilTwo {
	
	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayUtilTwo arrUtil = new ArrayUtilTwo();
		arrUtil.printArray(new int[] {5,1,2,9,10});
	}
}
