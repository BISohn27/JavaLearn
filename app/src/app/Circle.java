package app;

public class Circle extends Shape {
	protected int radius;
	//static final float PI = 3.141592f;
	public Circle() {
		radius= 0;
	}
	public Circle(int r) {
		this.radius = r;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int r) {
		this.radius = r;
	}
	@Override
	public double area() {
		return radius*radius*Math.PI;
	}
	@Override
	public double circumference() {
		return 2*radius*Math.PI;
	}
}
