package sprintrans;

public class BusinessBeanImpl implements BusinessBean{
	//association
	private MoneyTransferBean mtb;
	public MoneyTransferBean getMtb() {
		return mtb;
	}
	public void setMtb(MoneyTransferBean mtb) {
		this.mtb = mtb;
	}
	
	@Override
	public void doTransaction(int creditaccountid, int debitaccountid, int amt) throws Exception {		
		
		
		mtb.credit(creditaccountid, amt);
		mtb.debit(debitaccountid, amt);
	}
}
