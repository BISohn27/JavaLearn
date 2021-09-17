package api;

public class StringEx {

	public static void main(String[] args) {
		String a = "a";
		String b = "a";
		String c = new String("a");
		Object o = "abc";
		String s = "abc";
		String s2 = "abc";
		String s3 = null;
		if(o instanceof String) {
			System.out.println("String instance \n");
		}
		
		System.out.println((a == b) + " " + (b == c) + " " + b.equals(c));
		System.out.println(o.toString());
		System.out.println(o.equals(s));
		System.out.println(o==s);
		System.out.println(o==s2);
		String s4 = new String("abc");
		System.out.println(o.equals(s4));
		System.out.println(o ==s4);
		System.out.println(s ==s4);
		System.out.println(s.equals(s4));
		System.out.println(s3 == s4);
		
	}
}
