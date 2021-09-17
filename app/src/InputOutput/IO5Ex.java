package InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IO5Ex {

	public static void main(String[] args) {
		File file = new File("C:/workspace/IOtest.txt");
		FileInputStream fis;
		File file2 = new File("C:/workspace/IOtest.txt");
		FileOutputStream fos;
		int readByte;
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			while((readByte = (int)fis.read())!=-1) {
				fos.write(readByte);
			}
			fis.close();
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.print("복사가 완료되었습니다.");
	}

}

//File file = new File("C:/workspace/IOtest.txt");
//FileInputStream fis;
//int readByte;
//try {
//	fis = new FileInputStream(file);
//	while(true) {
//		readByte = fis.read();
//		if(readByte == -1)
//			break;
//		System.out.print((char)readByte);
//	}
//	fis.close();
//}catch(Exception e) {
//	e.printStackTrace();
//}