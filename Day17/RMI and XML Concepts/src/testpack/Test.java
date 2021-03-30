package testpack;

import adpack.AddService;
import adpack.Address;
import billpay.BillPayment;
import controlpack.Controller;
import controlpack.Telco;
import numberport.NumberPortability;


public class Test {
	public static void main(String[] args)throws Exception {
		Telco telco=new Telco();
		Object obj=Controller.getTelecomAppObject(telco);
		
		BillPayment billPay=(BillPayment)obj;
		billPay.payBill(100);
	
		NumberPortability np=(NumberPortability)obj;
		np.portNumber(89898943, "airtel");
		
		AddService ads=(AddService)obj;
		ads.changeAddress(new Address());
	}
}
