package chap02;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorStudy {
	public static void main(String[] args) {
		var a = new ArrayList<Integer>();
		a.add(5);
		a.add(4);
		a.add(-1);
		a.add(2, 100);

		Iterator<Integer> it = a.iterator();
		while (it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}

		int sum = 0;
		it = a.iterator();
		while (it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("백터에 있는 정수 합 :" + sum);
	}
}
