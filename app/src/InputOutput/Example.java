package InputOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example {

	public static void main(String[] args) throws IOException{
		File file = new File("C:/workspace/test.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while(br.ready()) {
			str = br.readLine();
			System.out.println(str);
		}
		fr.close();
		br.close();
	}
}








//
//File file = new File("C:/workspace/IOtest.txt");
//FileReader freader = new FileReader(file);
//BufferedReader br = new BufferedReader(freader);
//String str = "";
////while(br.ready()){
////	str = br.readLine();
//while((str =br.readLine()) != null) {
//	System.out.println(str);
//}
//freader.close();
//br.close();