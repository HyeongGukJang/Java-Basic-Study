package Using_Collectionclass;

class TStack<T> { // 제내릭 스택 선언함 제네릭 타입은 T이다.
	int tos;
	Object[] stck;

	public TStack() {
		tos = 0;
		stck = new Object[10]; // 스택에 요소를 저장할 공간을 배열로 선언해줌
	}

	public void push(T item) {
		if (tos == 10) { // 만약 스택이 꽉 차서 요소를 더 삽입할수 없으면?
			return; // 리턴해라
		}
		stck[tos] = item;
		tos++;
	}

	public T pop() {
		if (tos == 0) { // 만약 스택이 비어있어 꺼낼게 없으면?
			return null; // 널을 리턴해줘라
		}
		tos--;
		return (T) stck[tos]; // 타입 매개변수 타입으로 캐스팅한다.
	}
}

public class GenericObject {
	public static void main(String[] args) {
		var stringStack = new TStack<String>();

		stringStack.push("SEOUL");
		stringStack.push("busan");
		stringStack.push("incheon");

		for (int n = 0; n < 3; n++) {
			System.out.println(stringStack.pop());
		}

		var intStack = new TStack<Integer>();

		intStack.push(1);
		intStack.push(2);
		intStack.push(3);

		for (int n = 0; n < 3; n++) {
			System.out.println(intStack.pop());
		}
	}
}
