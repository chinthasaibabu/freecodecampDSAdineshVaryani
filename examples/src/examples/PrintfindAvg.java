package examples;

public class PrintfindAvg {
	public static void main(String[] args) {
		PrintfindAvg pf = new PrintfindAvg();
		pf.findAvg(10, 20, 30);
	}

	public void findAvg(int a, int b, int c) {
		int sum = a + b + c;
		int avg = sum / 3;
		System.out.println(avg);
	}
}
