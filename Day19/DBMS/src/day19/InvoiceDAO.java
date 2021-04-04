package day19;

import java.util.*;

public interface InvoiceDAO {
	
	public InvoiceDTO getIvoice(int invid);
	public List<InvoiceDTO> getAllInvoice();
	public int createInvoice(InvoiceDTO i);
	public int updateInvoice(InvoiceDTO i);
	public int deleteInvoice(InvoiceDTO i);
	public int deleteInvoiceById(int invid);
}
