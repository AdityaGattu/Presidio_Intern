package billpay;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BillPayment extends Remote{
	
	public void payBill(int amt)throws RemoteException;
}