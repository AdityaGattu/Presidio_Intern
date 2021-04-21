package customerpack;

import java.util.List;

public interface CustomerDAO {
	
	public CustomerDTO getCustomerById(int cid);
	public List<CustomerDTO>getAllCustomers();
	public void createCustomer(CustomerDTO c);
	public void updateCustomer(CustomerDTO c);
	public void deleteCustomer(CustomerDTO c);
	public void deleteCustomerById(int id);
	
}
