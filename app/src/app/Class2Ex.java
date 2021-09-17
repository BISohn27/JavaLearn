package app;

public class Class2Ex {

	public static void main(String[] args) {
		Car c = new Car();
		c.speedUp(50);
		c.display();
		c.speedDown(50);
		c.display();

		Car c2 = new Car("BMW i8", 280);
	}

}

class Car {
	String name;
	int wheel;
	float speed;
	float limitSpeed;

	public Car() {
		wheel = 4;
		speed = 0;
		name = "Porche 911 Turbo";
		limitSpeed = 300;
		System.out.println("차이름 : " + name + ", 바퀴 :" + wheel + ", 최대소력 : " + limitSpeed + ", 현재속력 : " + speed);
		System.out.println();
	}

	public Car(String name, float limitSpeed) {
		wheel = 4;
		speed = 0;
		this.name = name;
		this.limitSpeed = limitSpeed;
		System.out.println("차이름 : " + name + ", 바퀴 :" + wheel + ", 최대소력 : " + limitSpeed + ", 현재속력 : " + speed);
		System.out.println();
	}

	public void speedUp() {
		if ((speed + 10) <= limitSpeed) {
			speed += 10;
			System.out.println("속력을 올립니다. \n속력: " + speed);
			System.out.println();
		} else {
			speed = limitSpeed;
			System.out.println("최대 속력으로 속력을 올립니다.");
			System.out.println("최대 속력 : " + speed);
			System.out.println();
		}

	}

	public void speedUp(int n) {
		if ((speed + n) <= limitSpeed) {
			speed += n;
			System.out.println("속력을 올립니다. \n속력: " + speed);
			System.out.println();
		}else {
			speed = limitSpeed;
			System.out.println("최대 속력으로 속력을 올립니다.");
			System.out.println("최대 속력 : " + speed);
			System.out.println();
		}
	}

	public void speedDown(int n) {
		if (speed >= n)
			speed -= n;
		else
			speed = 0;
		System.out.println("속력을 내립니다. \n속력: " + speed);
		System.out.println();
	}

	public void speedDown() {
		if (speed >= 10)
			speed -= 10;
		else
			speed = 0;
		System.out.println("속력을 내립니다. \n속력: " + speed);
		System.out.println();
	}

	public void display() {
		System.out.println("차이름 : " + name + ", 현재속력 : " + speed);
		System.out.println();
	}

	public void display(String name, int limitSpeed, int wheel) {
		System.out.println("차이름 : " + this.name + ", 최대속력 : " + this.limitSpeed + ", 바퀴수 : " + this.wheel);
	}
}
