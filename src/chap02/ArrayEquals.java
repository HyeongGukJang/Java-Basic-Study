package chap02;

import java.util.Scanner;

public class ArrayEquals {

	static boolean equals(int a[], int b[]) {
		if(a.length != b.length) {
			return false;
		}
		for(int i = 0; i<a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 배열 비교.. 배열 수는? : ");

		int num = sc.nextInt();
		int arrA[] = new int[num];
		int arrB[] = new int[num];

		for (int i = 0; i < arrA.length; i++) {
			System.out.print("A배열의 " + i + "번째 배열입력 : ");
			arrA[i] = sc.nextInt();
		}
		for (int i = 0; i < arrA.length; i++) {
			System.out.print(" " + arrA[i]);
		}
		System.out.println("\n");
		for (int i = 0; i < arrB.length; i++) {
			System.out.print("B배열의 " + i + "번째 배열입력 : ");
			arrB[i] = sc.nextInt();
		}
		for (int i = 0; i < arrB.length; i++) {
			System.out.print(" " + arrB[i]);
		}
		System.out.println("a와b는 서로 같냐 다르냐? 정답은 ??? :" + equals(arrA, arrB));
	}
}
