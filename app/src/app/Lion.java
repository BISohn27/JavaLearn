package app;

public class Lion extends AnimalEx{
	public Lion() {
		this.age = 0;
		this.name ="»çÀÚ";
		this.eat_type = "À°½Ä";
	}
	
	public Lion(String name) {
		this.age = 0;
		this.name = name;
		this.eat_type = "À°½Ä";
	}
	
	public Lion(String name, int age) {
		this.age = age;
		this.name = name;
		this.eat_type = "À°½Ä";
	}
	@Override
	public void bark() {
		System.out.println("À¸¾î¾î¾î¾îÇë~");
	}
	
	public static void main(String[] args) {
		Lion lion = new Lion("½É¹Ù");
		System.out.println(lion.name);
		lion.bark();
	}

}
