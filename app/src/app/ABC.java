package app;

public class ABC {
	public String msg = "A";
	public void print() {
		BC bc = new BC();
		bc.print();
		System.out.println(msg);
	}
	public class BC{
		public String msg = "B";
		public void print() {
			C c= new C();
			c.print();
			System.out.println(msg);
		}
		public class C{
			public String msg = "C";
			public void print() {
				System.out.println(msg);
				System.out.println(this.msg);
				System.out.println(BC.this.msg);
				System.out.println(ABC.this.msg);
				System.out.println(this);
				System.out.println(BC.this);
				System.out.println(ABC.this);
			}
		}
	}
	
	public static void main(String[] args) {
		new ABC().print();
	}

}
