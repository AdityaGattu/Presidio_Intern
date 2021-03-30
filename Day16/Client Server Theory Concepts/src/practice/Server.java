package practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	Socket s;
	PrintWriter p;
	Server() throws Exception{
		ServerSocket ss=new ServerSocket(2000);
		System.out.println("Server started....");
		s=ss.accept();
		
		PrintWriter out =new PrintWriter(s.getOutputStream(),true);
		String msg="connected to server....welcome client.....";
		out.print(msg);
		
		System.out.println("Connection establised....");
		
	}
	public static void main(String[] args) throws Exception {
		new Server();
	}
}
