package InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class IO6Ex {
	public static void main(String[] args) throws IOException {
		File file1 = new File("C:/workspace/IOtest.txt");
		FileInputStream fis = new FileInputStream(file1);
		File file2 = new File("C:/workspace/test.txt");
		FileOutputStream fos = new FileOutputStream(file2);
		byte readBytes[] = new byte[3];
		int readByteNo;
		while((readByteNo = fis.read(readBytes)) != -1) {
			for(int i =0; i< readByteNo; i++)
				fos.write(readBytes[i]);
		}
		fos.flush();
		fos.close();
		fis.close();
	}
}

	
//	File file = new File("C:/workspace/IOtest.txt");
//	InputStream is = new FileInputStream(file);
//	int readByteNo;
//	byte[] readByte = new byte[3];
//	String data = "";
//	while (true) {
//		readByteNo = is.read(readByte);
//		if (readByteNo == -1)
//			break;
//		data += new String(readByte, 0, readByteNo);
//	}
//	System.out.println(data);
//	is.close();
//