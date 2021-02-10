package chap02;

public class PrimeNumber1 {
	public static void main(String[] args) {
		int counter = 0;
		
		for(int i = 2; i <= 1000; i++) {
			int n;
			for(n = 2; n < i; n++) {
				counter++;
				if(i%n == 0)
					break;
			}
			if(n == i)
				System.out.println(i);
		}
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}
}
