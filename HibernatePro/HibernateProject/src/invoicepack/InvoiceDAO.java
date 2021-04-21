package invoicepack;

import java.util.*;

public interface InvoiceDAO {
	
	public InvoiceDTO getIvoice(int invid);
	public List<InvoiceDTO> getAllInvoice();
	public void createInvoice(InvoiceDTO i);
	public void updateInvoice(InvoiceDTO i);
	public void deleteInvoice(InvoiceDTO i);
	public void deleteInvoiceById(int invid);
}
