package chap02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScroeEx {
	public static void main(String[] args) {
		var scoreMap = new HashMap<String, Integer>();

		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재문", 70);
		scoreMap.put("한원선", 99);

		System.out.println("HashMap의 요소 개수 : " + scoreMap.size());

		// 모든 사람들의 첨수 출력. scoreMap 안에 들어있는 모든 (key, value)쌍 출력
		Set<String> keys = scoreMap.keySet();
		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String name = (String) it.next();
			int score = scoreMap.get(name);
			System.out.println(name + " : " + score);
		}
	}
}
