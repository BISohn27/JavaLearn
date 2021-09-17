package api;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("자바는/홍길동/포인터를/가지고/있다.","/");
		int count = st.countTokens();
		String str[] = new String[count];
		
		while(st.hasMoreElements()) {
			Object el = st.nextElement();
			System.out.println(el.toString());
		}
		
		for(int i = 0; i< st.countTokens();) {
			str[i] = st.nextToken();
		}
		
		for(String str1 : str)
			System.out.println(str1);
	}

}
