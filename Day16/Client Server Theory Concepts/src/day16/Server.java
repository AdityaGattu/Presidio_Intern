package day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
	ServerSocket ss;BufferedReader br,in;PrintWriter out;
	Socket s;
	public Server() throws Exception{
		
		ss=new ServerSocket(2000);
		System.out.println("Server ready.....");
		while(true) {
			s=ss.accept();
			
			out=new PrintWriter(s.getOutputStream(),true);
			in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Message For Client..:");
			String msgToClient=in.readLine();
			out.println(msgToClient);
			
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			String msg=br.readLine();
			System.out.println("Message From Client..:"+msg);
		}
	}
	public static void main(String[] args) throws Exception{
		new Server();
	}
}