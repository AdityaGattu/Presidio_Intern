package practice;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	
	BufferedReader br;
	public Client() throws Exception{	
		Socket s=new Socket("localhost",2000);
		

		br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String msg=br.readLine();
		System.out.println("Message From Client..:"+msg);
	}
	public static void main(String[] args) throws Exception {
		new Client();
	}
}
