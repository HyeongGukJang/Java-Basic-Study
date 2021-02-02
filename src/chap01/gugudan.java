package chap01;

public class gugudan {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		for (int i = 1; i < 10; i++) {
			int c = a * i;
			System.out.println(a + "X" + i + "=" + c);
		}
		for(int i = 9; i > 0; i--) {
			int d = b * i;
			System.out.println(b + "X" + i + "=" + d);
		}
	}
}
