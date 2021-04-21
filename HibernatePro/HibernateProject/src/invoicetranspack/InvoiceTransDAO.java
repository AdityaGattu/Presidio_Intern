package invoicetranspack;

/*DAO - Data Access Object...
  DTO -Data Tranfer Object - used to reduce no of calls when working with remote interfaces...
 */
import java.util.*;

public interface InvoiceTransDAO {

	public InvoiceTransDTO getInvoice(int invid);
	public List<InvoiceTransDTO> getAllInvoice();
	public void createInvoiceTrans(InvoiceTransDTO t);
	public void updateInvoiceTrans(InvoiceTransDTO t);
	public void deleteInvoiceTrans(InvoiceTransDTO t);
	public void deleteInvoiceTransById(int invid);
	
	
}
