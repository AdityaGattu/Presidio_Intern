package adpack;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class PublicAddService {
	public static void main(String[] args)throws Exception {
		AddServiceImpl addservice=new AddServiceImpl();
		
		LocateRegistry.createRegistry(5000);
		
		System.out.println("add change service deployed....");
		Naming.bind("rmi://localhost:5000/add/addservice", addservice);
				
	}
}
