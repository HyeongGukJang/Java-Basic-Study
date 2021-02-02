package chap02;

import java.util.Scanner;

public class MaxOfArray2 {

	static int MaxArray(int[] a) {
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("사람 수");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i = 1; i <= arr.length; i++) {
			System.out.print(i + "번째 입력 : ");
			arr[i] = sc.nextInt();
 		}
		
		System.out.println("최댓값은 " + MaxArray(arr)+"입니다.");
	}
}
