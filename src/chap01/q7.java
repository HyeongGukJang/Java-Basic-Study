package chap01;

public class q7 {
	public static void main(String[] args) {
		int n = 7;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			System.out.print(i);
			if (i == 7) {
				System.out.print("=");
			} else {
				System.out.print("+");
			}
		}
		System.out.print(sum);
	}
}
