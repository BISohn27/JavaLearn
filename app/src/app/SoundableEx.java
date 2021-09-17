package app;

public class SoundableEx {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
		
		Cat obj = (Cat)soundable;
		obj.method();
	}
	public static void main(String[] args) {
		printSound(new Cat());
	}

}
