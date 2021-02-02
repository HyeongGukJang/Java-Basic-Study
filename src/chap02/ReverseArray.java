package chap02;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요솟수 : ");
		int num = sc.nextInt();
		int x[] = new int[num];
		
		for(int i = 0; i<x.length; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		reverse(x);
		System.out.println("요소를 역순으로 정렬했어요");
		for(int i = 0; i<num; i++) {
			System.out.println("x["+i+"] = "+x[i]);
		}
	}

	private static void reverse(int[] x) {
		for(int i = 0; i<x.length / 2; i++) {
			swqp(x, i, x.length - i -1);
		}
	}

	private static void swqp(int[] x, int i, int j) {
		int t = x[i];
		x[i] = x[j];
		x[j] = t;
	}
}
