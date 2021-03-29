package day16;

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
		String msg=br.readLine();
		System.out.println("Message from server...:"+msg);
		
		out=new PrintWriter(s.getOutputStream(),true);
		in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type a message to server..:");
		String msgToServer=in.readLine();
		out.println(msgToServer);
		}
	}
	
	public static void main(String[] args)throws Exception {
		new Client();
	}	
}