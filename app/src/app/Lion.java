package app;

public class Lion extends AnimalEx{
	public Lion() {
		this.age = 0;
		this.name ="����";
		this.eat_type = "����";
	}
	
	public Lion(String name) {
		this.age = 0;
		this.name = name;
		this.eat_type = "����";
	}
	
	public Lion(String name, int age) {
		this.age = age;
		this.name = name;
		this.eat_type = "����";
	}
	@Override
	public void bark() {
		System.out.println("���������~");
	}
	
	public static void main(String[] args) {
		Lion lion = new Lion("�ɹ�");
		System.out.println(lion.name);
		lion.bark();
	}

}
