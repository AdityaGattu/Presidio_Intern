package day16;


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
public class RmiService extends UnicastRemoteObject implements Stock{
	public RmiService() throws RemoteException{
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getStockPrice(String stockName) throws RemoteException {
		if(stockName.equals("coda")) {
			return 100;
		}
		else {
			return 50;
		}
	}
	
	public static void main(String[] args)throws Exception {
		RmiService rmiService=new RmiService();
		
		LocateRegistry.createRegistry(1099);
		
		System.out.println("Server Ready....");
		
		Naming.bind("rmi://localhost:1099/rmiservice/stockService", rmiService);
		
		
	}
}