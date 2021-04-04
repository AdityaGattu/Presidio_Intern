package day19;

import java.util.List;

public interface CustomerDAO {
	
	public CustomerDTO getCustomerById(int cid);
	public List<CustomerDTO>getAllCustomers();
	public int createCustomer(CustomerDTO c);
	public int updateCustomer(CustomerDTO c);
	public int deleteCustomer(CustomerDTO c);
	public int deleteCustomerById(int id);
	
}
