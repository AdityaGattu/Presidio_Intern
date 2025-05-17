package day16;

import io.github.pixee.security.BoundedLineReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class Client {
	Socket s;BufferedReader br,in;PrintWriter out;
	public Client() throws Exception{
		while(true) {
		s=new Socket("localhost",2000);
		br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String msg=BoundedLineReader.readLine(br, 5_000_000);
		System.out.println("Message from server...:"+msg);
		
		out=new PrintWriter(s.getOutputStream(),true);
		in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type a message to server..:");
		String msgToServer=BoundedLineReader.readLine(in, 5_000_000);
		out.println(msgToServer);
		}
	}
	
	public static void main(String[] args)throws Exception {
		new Client();
	}	
}
