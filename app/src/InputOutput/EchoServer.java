package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private ServerSocket server;

	public EchoServer(int port) throws IOException {
		server = new ServerSocket(port);
		
	}
	public void service() throws IOException{
		System.out.println("EchoServer is ready");
		
		Socket socket = server.accept();
		
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintWriter out = new PrintWriter(os,true);
		
		while(true) {
			String msg = br.readLine();
			System.out.println(msg);
			if(msg.equals("bye"))
				break;
			out.println("-->" + msg);
		}	
	}
	public void close() throws IOException{
		server.close();
	}
	public static void main(String[] args) {
		try {
			EchoServer es = new EchoServer(10000);
			es.service();
			es.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
