package adpack;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddServiceImpl extends UnicastRemoteObject implements AddService{
	public AddServiceImpl() throws RemoteException{
		// TODO Auto-generated constructor stub
	}
@Override
public void changeAddress(Address add) throws RemoteException {
	System.out.println(add);
	System.out.println("address changed...............................");
	
}
}
