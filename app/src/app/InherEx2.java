package app;

public class InherEx2 {
	public static void main(String[] args) {
		A a = new A();
		B b = a;
		C c = a;
		
		A z = (A)b;
		A y = (A)c;
		B h = (B)c;
		
		Object o1 = a;
		Object o2 = b;
		Object o3 = c;
		
		Object[] obj_arr = new Object[2];
		
		obj_arr[0] = a;
		obj_arr[1] = new int[3];
		
		A k = (A)obj_arr[0];
		
		b.method();
		
		a.method();
//		a.method_a();
//		a.method_c();
	}

}

class C{
	int num =10;
	String msg = "msg....";
	
	public C() {
		System.out.println("C contructor");
	}
	
	public void method() {
		System.out.println("method " + num);
	}
	
	public void method_c() {
		System.out.println("method c " + msg);
	}
}

class B extends C{
	int num = 20;
	
	public B() {
		System.out.println("B contructor");
	}
	@Override
	public void method() {
		super.method_c();
		this.method_c();
		System.out.println("method " + super.num);
	}
	
	@Override
	public void method_c() {
		System.out.println("method b");
	}
	
	public void method_b() {
		super.method_c();
		System.out.println("method b " + msg);
	}
}

class A extends B{
	int num = 30;
	
	public A() {
		System.out.println("A contructor");
	}
	@Override
	public void method() {
		
	}
	public void method_a() {
		System.out.println("method a " + msg);
	}	
}
