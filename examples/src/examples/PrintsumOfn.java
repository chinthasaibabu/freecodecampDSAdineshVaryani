package examples;

public class PrintsumOfn {

	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		
		PrintsumOfn sum = new PrintsumOfn();
		
		System.out.println(sum.findSumOne(9999));
		
		//Time Complexity
		System.out.println("Time Taken - "+(System.currentTimeMillis() - now)+" millisecs");
		
		System.out.println(sum.findSumTwo(9999));
		
		//TIme Complexity
		System.out.println("Time Taken - "+(System.currentTimeMillis() - now)+" millisecs");
	}

	public int findSumOne(int n) {
		return n * (n + 1) / 2;
	}

	public int findSumTwo(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
