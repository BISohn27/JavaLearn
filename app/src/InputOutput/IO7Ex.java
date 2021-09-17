package InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO7Ex {
	public static void main(String[] args) throws IOException {
		File file = new File("C:/workspace/test.txt");
		FileOutputStream fos = new FileOutputStream(file);
		String str = "ABC";
		byte[] data = str.getBytes();
		for (int i = 0; i< data.length; i++)
			fos.write(data[i]);
		fos.write(data);
		
		fos.flush();
		fos.close();
		
		file = new File("C:/workspace/test.txt");
		FileInputStream fis = new FileInputStream(file);
		int readByteNo;
		str = "";
		while(true) {
			readByteNo=fis.read(data);
			if(readByteNo == -1)
				break;
			str += new String(data,0,readByteNo);
		}
		
		System.out.println("입력 완료");
		System.out.println(str);
	}
}

//File file = new File("C:/workspace/IOtest.txt");
//FileOutputStream fos = new FileOutputStream(file);
//String str = "ABC";
//byte[] data = str.getBytes();
//for (int i = 0; i < data.length; i++) {
//	fos.write(data[i]);
//}
//fos.flush();
//fos.close();
//
//file = new File("C:/workspace/IOtest.txt");
//FileInputStream fis = new FileInputStream(file);
//str ="";
//int readNo;
//while(true) {
//	readNo = fis.read(data);
//	if(readNo ==-1)
//		break;
//	str += new String(data,0,readNo);
//}
//