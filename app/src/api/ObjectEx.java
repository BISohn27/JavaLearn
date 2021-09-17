package api;

public class ObjectEx {

	public static void main(String[] args) {
		Point obj = new Point();
		System.out.println("클래스 이름: " +obj.getClass());
		System.out.println("인스턴스 일련번호: " +obj.hashCode());
		new Point().finalize();
		Point obj2 = new Point();
		System.out.println(obj.equals(obj2));
		System.out.println(obj2.hashCode());
		
		String str1 = "ABC";
		System.out.println(str1);
		str1 = "CBC";
		System.out.println(str1);
	}

}

class Point {
	protected void finalize() {
		System.out.println("소멸");
	}
}