package banking;

public class CheckingAccount extends Account2
{
	
	private double overdraftProtection;
	private String date;
	
	public  CheckingAccount(double balance) 
	{
	  super(balance);
	  date=" no tiene proteccion de sobregiros";
	}
	
	public  CheckingAccount(double balance, double overdraftProtection)
	{
		super(balance);
		this.overdraftProtection=overdraftProtection;
		date=" "+getOverdraftProtection()+" sobreproteccion de sobregiros";
	}  
	
	public double getOverdraftProtection() 
	{
		return overdraftProtection;
	}

	public String getDate() 
	{
		return date;
	}
		   
	 public boolean whithdraw(double amt){
		 
		 
	    double sumaOv = balance+overdraftProtection;
		 
		 if(balance<amt &&  sumaOv  >amt)
		 {
		  setOverdraftProtection(amt);
		        super.whithdraw(super.getBalance() );
		        
		     return (true);   
		 }
		 
		 if(balance > amt){
			 
		        super.whithdraw(amt);
		        
		     return (true);   
		 }
		
		 return (false);   
		 
	 }
	 
	 
	public double setOverdraftProtection(double amt)
	{
		
		double resta = amt-super.getBalance();
		return (overdraftProtection =overdraftProtection-resta  );
	}   

}
