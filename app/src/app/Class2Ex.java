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
		System.out.println("���̸� : " + name + ", ���� :" + wheel + ", �ִ�ҷ� : " + limitSpeed + ", ����ӷ� : " + speed);
		System.out.println();
	}

	public Car(String name, float limitSpeed) {
		wheel = 4;
		speed = 0;
		this.name = name;
		this.limitSpeed = limitSpeed;
		System.out.println("���̸� : " + name + ", ���� :" + wheel + ", �ִ�ҷ� : " + limitSpeed + ", ����ӷ� : " + speed);
		System.out.println();
	}

	public void speedUp() {
		if ((speed + 10) <= limitSpeed) {
			speed += 10;
			System.out.println("�ӷ��� �ø��ϴ�. \n�ӷ�: " + speed);
			System.out.println();
		} else {
			speed = limitSpeed;
			System.out.println("�ִ� �ӷ����� �ӷ��� �ø��ϴ�.");
			System.out.println("�ִ� �ӷ� : " + speed);
			System.out.println();
		}

	}

	public void speedUp(int n) {
		if ((speed + n) <= limitSpeed) {
			speed += n;
			System.out.println("�ӷ��� �ø��ϴ�. \n�ӷ�: " + speed);
			System.out.println();
		}else {
			speed = limitSpeed;
			System.out.println("�ִ� �ӷ����� �ӷ��� �ø��ϴ�.");
			System.out.println("�ִ� �ӷ� : " + speed);
			System.out.println();
		}
	}

	public void speedDown(int n) {
		if (speed >= n)
			speed -= n;
		else
			speed = 0;
		System.out.println("�ӷ��� �����ϴ�. \n�ӷ�: " + speed);
		System.out.println();
	}

	public void speedDown() {
		if (speed >= 10)
			speed -= 10;
		else
			speed = 0;
		System.out.println("�ӷ��� �����ϴ�. \n�ӷ�: " + speed);
		System.out.println();
	}

	public void display() {
		System.out.println("���̸� : " + name + ", ����ӷ� : " + speed);
		System.out.println();
	}

	public void display(String name, int limitSpeed, int wheel) {
		System.out.println("���̸� : " + this.name + ", �ִ�ӷ� : " + this.limitSpeed + ", ������ : " + this.wheel);
	}
}
