package chap02;

import java.util.Scanner;

public class q4 {

	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++) {
			a[i] = b[i];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int leng = sc.nextInt();
		System.out.println("배열길이 : " + leng);
		int arr[] = new int[leng];

		for (int i = 0; i < leng; i++) {
			System.out.print("배열 요소 입력 : ");
			arr[i] = sc.nextInt();
			System.out.println(arr[i]);
		}
		int leng2 = sc.nextInt();
		System.out.println("배열길이 : " + leng2);
		int arr2[] = new int[leng2];
		for (int i = 0; i < leng2; i++) {
			System.out.print("배열 요소 입력 : ");
			arr2[i] = sc.nextInt();
			System.out.println(arr[i]);
		}
		copy(arr, arr2);
		System.out.println("배열b의 모든 요소를 배열 a에 복사했습니다.");
		for (int i = 0; i < leng; i++) {
			System.out.println(arr[i]);
		}
	}
}
