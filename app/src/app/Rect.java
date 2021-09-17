package app;

public class Rect extends Shape{
	protected int width;
	protected int height;
	
	public Rect() {
		this(0,0);
	}
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
		x = getWidth();
		y = getHeight();
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setSize(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	public int getSize() {
		return x*y;
	}
	
	public double area() {
		return width*height;
	}
	
	public double circumference() {
		return 2*(width+height);
	}
	
	public static void main(String[] args) {
		
	}

}
