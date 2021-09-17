package InputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IO9Ex {

	public static void main(String[] args) throws IOException{
		File file = new File("C:/workspace/test.txt");
		FileWriter fw= new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String str = "";
		while(!str.equals("end")) {
			str = br.readLine();
			pw.println(str);
		}
		fw.close();
		bw.close();
		pw.close();
		is.close();
		isr.close();
		br.close();
	}

}

//File file = new File("C:/workspace/IOtest.txt");
//FileWriter fwriter = new FileWriter(file);
//BufferedWriter bw = new BufferedWriter(fwriter);
//PrintWriter pw = new PrintWriter(bw,true);
//InputStream is = System.in;
//InputStreamReader isr = new InputStreamReader(is);
//BufferedReader br = new BufferedReader(isr);
//System.out.print("ют╥б : ");
//String str = "";
//while(!str.equals("end")) {
//	str = br.readLine();
//	pw.println(str);
//}
//br.close();
//pw.close();