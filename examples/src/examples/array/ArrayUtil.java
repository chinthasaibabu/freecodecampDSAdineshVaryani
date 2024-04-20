package examples.array;

public class ArrayUtil {

	public void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.err.println();
	}

	public void arrayDemo() {
		int[] myArray = new int[5];// default values based on datatype
//		printArray(myArray);
		myArray[0] = 1;
		myArray[1] = 2;
		myArray[2] = 3;
		myArray[3] = 4;
		myArray[4] = 5;
		myArray[2]=6;
//		myArray[5]=7;
		printArray(myArray);
		System.out.println(myArray.length);
		
//		System.out.println(myArray[myArray.length-1]);
		
		int[] arr = {5,1,8,10};
		printArray(arr);
	}

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();
		arrayUtil.arrayDemo();
	}
}
