package chap03;

import java.util.Scanner;

public class LinearSerch01 {

	static Scanner sc = new Scanner(System.in);

	static int seqSearch(int[] a, int n, int key) {
		// 요솟수가 n인 배열에서 key와 같은 요소를 선형 검색합니다.
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num]; // 요솟수가 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] :");
			x[i] = sc.nextInt();
		}
		System.out.println("검색할 값 : "); // 키 값을 입력
		int ky = sc.nextInt();
		int idx = seqSearch(x, num, ky); // 배열 x에서 키 값이 ky인 요소를 검색

		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky + "는 x[" + idx + "]에 있습니다.");
		}
	}
}
