package InputOutput;

import java.io.IOException;

public class IO3Ex {
	public void printByteArray() {
		byte[] data = new byte[5];
		System.out.print("ют╥б: ");
		char c = ' ';
		try {
			System.in.read(data,0,5);
			c = (char)System.in.read();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.write(data,0,5);
		System.out.println();
		System.out.println(c);
	}
	
	public void inputEx() {
		byte[] data = new byte[5];
		int number = 0;
		try {
			while((number = System.in.read(data)) != -1) {
				for(int i=0; i< number; i++) {
					System.out.print((char)data[i]);
				}
				System.out.println();
			}
			System.out.println();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		IO3Ex ex = new IO3Ex();
		ex.inputEx();
	}
}
