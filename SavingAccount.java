package banking;

public class SavingAccount extends Account2 
{
	
	 private double interestRate;
	 
	  public SavingAccount(double interestRate,double balance)
	  {
	    super(balance);
	    this.interestRate=interestRate;
	  }
	  
	  public double getInterestRate(){
	      return interestRate;
	  }
	  
	    public String getDetails() 
	    {
	         return "SALDO: ("+balance+")\nINTERES=(" +interestRate+"%)";
	    }
	        
	

}
