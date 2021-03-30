package numberport;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NumberPortability extends Remote{
	
	public void portNumber(int number,String telecom) throws RemoteException;
}