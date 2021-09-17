package InputOutput;

import java.io.IOException;

public class IO2EX {
	public void printBytes() {
		int b = 0, count = 0;
		try {
			b=System.in.read();
			while(b != -1) {
				count++;
				System.out.print((char)b);
				b = System.in.read();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		int b = 0, count = 0;
		try {
//			do{
				b = System.in.read();
//				System.out.println((char)b);
//				count++;
			while(b != -1) {
				System.out.print((char)b);
				count++;
				b = System.in.read();
			}//while(b!=-1);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(count);
	}
}
