package chap02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		var a = new ArrayList<String>();
		
		for(int i = 0; i<5; i++) {
			System.out.println("이름을 입력하세요 : ");
			String s = sc.next();
			a.add(s); // ArrayList에 삽입
		}
		
		// ArrayList에 들어 있는 모든 이름 출력
		for(int i = 0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.println(name + " ");
		}
		
		// 가장 긴 이름 출력
		int longestIndex = 0; // 현재 가장 긴 이름이 있는 ArrayList 내의 인덱스
		for(int i = 0; i<a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length()) { // 이름 길이 비교
				longestIndex = i;
			}
		}
		System.out.println("\n 가장 긴 이름은 : " + a.get(longestIndex));
		sc.close();
	}
}
