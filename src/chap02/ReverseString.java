package chap02;

import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseString {
	public static void main(String[] args) {
		String a = "이것은 뒤집을 문자열";
		Stack<String> str = new Stack<>();
		
		StringTokenizer st = new StringTokenizer(a);
		while(st.hasMoreTokens())
			str.push((String) st.nextElement());
		while(!str.empty())
			System.out.println(str.pop()+" ");
	}
}
