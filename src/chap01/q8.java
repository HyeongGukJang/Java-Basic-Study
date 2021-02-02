package chap01;

import java.util.Scanner;

public class q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n을 입력하세요...");
		int n = sc.nextInt();
		
		int a = (1+n)*(n/2);
		System.out.println(a);
		}
	}
