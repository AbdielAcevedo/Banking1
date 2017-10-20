package banking;

public class Account2 
{
	
	   protected double balance;
	   
	   public Account2 (double init_balance)
	   {
	    balance=init_balance;   
	   }
	   
	   public double getBalance()
	   {
	       return balance;
	   }
	   
	   public boolean deposit(double amt)
	   {
	    if(amt>0)
	    {
	        setBalanceIn(amt);
	     return true;   
	    }
	    
	    else{
	     return false;   
	    }
	    
	   }
	   
	   public boolean whithdraw(double amt)
	   {
	    if(balance>=amt)
	    {
	        setBalanceDe(amt);
	     return true;   
	    }
	    else
	    {
	     return false;   
	    }
	   } 

	    public double setBalanceIn(double amt)
	    {
	        return balance= balance + amt;
	       
	    }

	    public double setBalanceDe(double amt) 
	    {
	        return balance-=amt;
	        
	    }
	    
	   
	

}
