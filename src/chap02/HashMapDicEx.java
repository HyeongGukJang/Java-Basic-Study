package chap02;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		var dic = new HashMap<String, String>(); // 해쉬맵 선언

		dic.put("baby", "아기"); // 요소를 집어넣는중..
		dic.put("love", "사랑");
		dic.put("apple", "사과");

		while (true) { // 무한루프
			System.out.println("찾고싶은 단어는?");
			String eng = sc.next(); // eng로 스캐너 입력받음
			if (eng.equals("exit")) { // 만약 exit가 입력되면?
				System.out.println("종료합니다."); // 종료합니다 출력하고 break;
				break;
			}
			String kor = dic.get(eng); // 해쉬맵에서 '키'eng의 '값' kor 검색, 없으면 널 리턴
			if (kor == null) // 만약 kor이 널이면 
				System.out.println(eng + "는 없는 단어 입니다.");
			else
				System.out.println(kor);
		}
		sc.close();
	}
}