package codaws;

import javax.xml.ws.Endpoint;

public class PublishService {
	public static void main(String[] args) {
		HelloService myservice=new HelloServiceImpl();
		
		Endpoint.publish("http://localhost:2080/ws/helloService", myservice);
		System.out.println("Service Published........");
	}
}
