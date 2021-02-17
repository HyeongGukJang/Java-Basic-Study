package chap03;

import java.util.Scanner;

public class BinSearch {
	// 이진검색 -> 정수형 배열에서 어떤 숫자 하나를 찾고싶다.
	// 오름차순으로 되어있을때 해당하는 숫자의 크기를 중간부터 검색을한다
	// 중간보다 크다 작다를 판단해 크면
	// 큰 부분의 중간을 또 선별해서 거기서 또 크다 작다를 판별
	// 반복하면서 원하는 숫자를 찾아내는 방법이다.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("요솟수 입력 : ");
		int num = sc.nextInt();
		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요 : ");

		System.out.println("x[0] : ");
		x[0] = sc.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.println("x[" + i + "] : ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]);
		}
		System.out.println("검색할 값 : ");
		int ky = sc.nextInt();

		int idx = binsearch(x, num, ky);

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");

	}

	private static int binsearch(int[] x, int num, int ky) {
		int pl = 0;
		int pr = num - 1;

		do {
			int pc = (pl + pr) / 2;
			if (x[pc] == ky)
				return pc;
			else if (x[pc] < ky)
				pl = pc + 1;
			else
				pr = pc - 1;
		} while (pl <= pr);
		return -1;
	}
}
