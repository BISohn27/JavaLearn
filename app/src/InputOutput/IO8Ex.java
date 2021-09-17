package InputOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO8Ex {

	public static void main(String[] args) throws IOException{
		File file = new File("C:/workspace/test.txt");
		FileOutputStream fos = new FileOutputStream(file);
		int read = 0;
		while(read != -1 && read != '\n'){
			read = System.in.read();
			fos.write(read);
		}
		fos.flush();
		fos.close();
	}

}
//File file = new File("C:/workspace/IOtest.txt");
//FileOutputStream fos = new FileOutputStream(file);
//System.out.print("ют╥б : ");
//int output = 0;
//while(output != -1) {
//	output = System.in.read();
//	fos.write(output);
//}
//fos.close();