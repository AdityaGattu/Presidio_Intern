package numberport;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ZapNumberPort extends UnicastRemoteObject implements NumberPortability{
	public ZapNumberPort()throws RemoteException {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void portNumber(int number, String telecom) throws RemoteException{
		System.out.println(number+" :Number portability logic written..."+telecom);
	}
}