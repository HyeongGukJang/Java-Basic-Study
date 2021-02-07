package chap02;

import java.util.Scanner;

public class MaxOfArray3 {

	static int FindMax(int[] a) {
		int max = a[0];
		
		for(int i = 0; i<a.length; i++) {
			if(max < a[i]) max = a[i];
		}
		return max; 
	} 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 수 일벽 : ");
		int num = sc.nextInt();
		 
		int[] arr = new int[num];
		for(int i = 1; i<arr.length; i++) {
			System.out.print("height[" + i + "] :");
			int gap = sc.nextInt();
			arr[i] = gap; 
		}
		System.out.println("최댓값은"+FindMax(arr)+"입니다.");
	}
	
}
