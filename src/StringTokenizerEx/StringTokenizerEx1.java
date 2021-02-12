package StringTokenizerEx;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args) {
		String quert = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer (quert, "&"); // 구분문자 &
		System.out.println(st);
		
		int count = st.countTokens();
		System.out.println("토큰개수 : "+count);
		
		for(int i = 0; i<count; i++) {
		String token = st.nextToken();
		System.out.println(token);
		}
	}
}
