package codaws;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
public class HelloClient {
	public static void main(String[] args)throws Exception {
		
		URL url=new URL("http://localhost:2080/ws/helloService?wsdl");
		
		QName qName=new QName("http://codaws/","HelloServiceImplService");
		
		Service service=Service.create(url,qName);
		
		HelloService hello=service.getPort(HelloService.class);
		
		String result=hello.sayHello("coda");
		
		System.out.println("Result...:"+result);
	}
}