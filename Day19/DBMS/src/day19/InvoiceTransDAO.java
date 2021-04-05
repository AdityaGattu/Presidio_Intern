package day19;

/*DAO - Data Access Object...
  DTO -Data Tranfer Object - used to reduce no of calls when working with remote interfaces...
 */
import java.util.*;

public interface InvoiceTransDAO {

	public InvoiceTransDTO getInvoice(int invid);
	public List<InvoiceTransDTO> getAllInvoice();
	public int createInvoiceTrans(InvoiceTransDTO t);
	public int updateInvoiceTrans(InvoiceTransDTO t);
	public int deleteInvoiceTrans(InvoiceTransDTO t);
	public int deleteInvoiceTransById(int invid);
	
	
}
