package chap01;

import java.util.Scanner;

public class q9 {
	static Scanner sc = new Scanner(System.in);
	
	static int sumof(int a, int b) {
		int min,max;
		if(b > a) {
			max = b;
			min = a;
		}else{
			max = a;
			min = b;
		}
		int ans = 0;
		for(int i = min; i <= max; i++)
			ans += i;
		return (ans);
	}
	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(sumof(a,b));
	}
}