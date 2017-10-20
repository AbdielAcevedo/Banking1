package banking;

public class Bank {
	
	private Customer[] customers;
	
	private int numberOfCuentomers = 0;
	
	public Bank() 
	{
		
		customers = new Customer[5];
		
	}
	
	public void addCustomer(String f ,String l)
	{	
		int i = numberOfCuentomers++;
		
		customers[i] = new Customer(f,l);
	}
	
	public int getNumberOfCustomers() 
	{
		return numberOfCuentomers;
	}
	
	public Customer getCustomers(int index)
	{
		return customers[index];
	}

}
