package app;

public class InstanceofEx {

	public static void main(String[] args) {
		Child child = new Child();
		if(child instanceof Interfaceof) {
			System.out.println("child is an instance of Interfaceof.");
		}
		if(child instanceof Parent) {
			System.out.println("child is an instance of Parent.");
		}
		if(child instanceof Object) {
			System.out.println("child is an instance of Object.");
		}
		if(child instanceof Child) {
			System.out.println("child is an instance of Child.");
		}
	}
}

interface Interfaceof{
}

class Parent  implements Interfaceof{
}

class Child extends Parent{
}