package Using_Collectionclass;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Using_Collectionclass1 {
	
	static void printList(LinkedList<String> l) { // 리스트 요소를 모두 출력하는 메소드를 정의
		Iterator<String> iterator = l.iterator(); // Iterator객체를 리턴함
		while(iterator.hasNext()) { // Iterator 객체에 요소가 있을 때까지 리턴
			String e= iterator.next(); // 다음 요소 리턴
			String prt;
			if(iterator.hasNext()) {
				prt = "->"; // 마지막 요소가 아니면 -> 출력
			}else {
				prt = "\n"; // 마지막 요소이면 출바꿈
			}
			System.out.print(e+prt);
		}
	}

	public static void main(String[] args) {
		var myList = new LinkedList<String>(); // 빈 링크드 리스트 생성
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");
		
		Collections.sort(myList); // 요소를 정렬
		printList(myList); // 정렬된 요소를 출력
		
		Collections.reverse(myList); // 요소의 순서를 반대로 구성
		printList(myList); // 요소를 출력
		
		int index = Collections.binarySearch(myList, "아바타")+1;
		System.out.println("아바타는" + index + "번째 요소입니다.");
	}
}
