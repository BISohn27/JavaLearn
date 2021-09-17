package app;

public class ShapeUser {

	public static void main(String[] args) {
		Shape[] shape = new Shape[3];
		shape[0] = new Rect(1,3);
		shape[1] = new Circle(4);
		shape[2] = new Circle(5);
		
		for(int i = 0; i< shape.length; i++)
			System.out.println(shape[i].area());
		
		System.out.println();
		
		for(int i=0; i<shape.length; i++)
			System.out.println(shape[i].circumference());
		
		Circle cir = (Circle)shape[1];
		cir.setRadius(3);
		((Circle)shape[1]).setRadius(3);
		
		System.out.println();
		System.out.println(cir.getRadius());
		System.out.println(shape[1].area());
	}
}
