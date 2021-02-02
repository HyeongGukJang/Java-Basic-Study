package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	
	static int MaxOf(int a[]) {
		int max = a[0];
		for(int i = 0; i<a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다");
		System.out.println("사람수");
		int num = sc.nextInt();
		
		int key[] = new int[num];
		System.out.println("키값은 아래와 같다.");
		for(int i = 0; i < num; i++) {
			key[i] = 100 + rand.nextInt(180);
			System.out.println("key ["+"] : "+key[i]);
		}
		System.out.println("최댓값은 : "+ MaxOf(key)+"입니다.");
	}
}
