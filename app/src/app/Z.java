package app;

class X{
	protected int i = 10;
	protected String msg = "I am a X.";
	public void print() {
		System.out.println(msg);
	}
	public void play() {
		System.out.println("Play.."+ msg);
	}
}

class Y extends X{
	protected int i =20;
	protected String msg = "I am an Y.";
	@Override
	public void print() {
		System.out.println(msg);
	}
	public void superPrint() {
		super.print();
	}
}

public class Z extends Y{
	protected int i = 30;
	protected String msg = "I am a Z.";
	public void print() {
		System.out.println(msg);
	}
	@Override
	public void play() {
		System.out.println("Play..." + msg);
	}
	public void doZ() {
		System.out.println("do something in Z.");
	}
	public void superPrint() {
		super.superPrint();
	}
	public void test(int i,Z temp) {
		Z z = new Z();
		Y y = z;
		X x = z;
		System.out.println((z == temp) + " " + temp +" " + z+"\n");
		//¹®Á¦
		z.print();
		y.print();
		x.print();
		super.print();
		this.play();
		super.play();
		//y.doZ();
		//super.super.print();
		System.out.println("\ni = " +i);
		System.out.println("this.i = " + this.i);
		System.out.println("this.i = " + super.i);
		System.out.println("y.i = " +y.i);
		System.out.println("x.i = " +x.i);
		System.out.println("((Y)this).i = " + ((Y)this).i);
		System.out.println("((X)this).i = " + ((X)this).i);
	}
	public static void main(String[] args) {
		Z z = new Z();
		z.test(3,z);
		z.superPrint();
	}
}
