package InputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IO4Ex {

	public void bufferedPrint() {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String data = "";
		System.out.print("���ڿ� �Է�: ");
		try {
			data += br.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(data);
	}

	public static void main(String[] args) {
		IO4Ex ex = new IO4Ex();
		ex.bufferedPrint();
	}
}

//	InputStream is = System.in;
//	InputStreamReader isr = new InputStreamReader(is);
//	BufferedReader br = new BufferedReader(isr);
//	String data = "";
//	while(true) {
//		System.out.print("���ڿ� �Է�: ");
//		try {
//			data = br.readLine();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		if(data.equals("end")) {
//			System.out.println("���α׷� ����");
//			break;
//		}
//		System.out.println("�Է��� �����ʹ� : " + data);
//	}
//
