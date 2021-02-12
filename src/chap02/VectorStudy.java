package chap02;

import java.util.Vector;

class Point{
	private int x, y;

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}

public class VectorStudy {
	public static void main(String[] args) {
		Vector<Point> v = new Vector<>(); // Point 객체를 요소로 다루는 백터 생성
		// 3개의 Point 객체 삽입
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		v.remove(1); // 인덱스 1의 Point(-5,20) 삭제
		
		// 백터의 모든 Point 객체 모두 검색해서 출력
		for(int i = 0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
	}
}
