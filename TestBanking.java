package banking;

public class TestBanking 
{

	public static void main(String[] args) 
	{
		
		Account2 cuenta[]= new Account2[3];
		
		for(int i=0; i<3 ; i++)
		{
			if(i == 0)
			{
				cuenta[i]=  new Account2(500.00);
			    cuenta[i]= new SavingAccount(3.00,cuenta[i].getBalance());
			    cuenta[i]= new CheckingAccount(cuenta[i].getBalance());
			    
			    System.out.println("cliente : jane smith\nsaldo de cuenta: "
			    		   +cuenta[i].getBalance()+" interes =  3% ");
			    
			    System.out.println("\ncuenta de ahorros\n");
			    System.out.println("retirar: 150.00: "+cuenta[i].whithdraw(150.00));
			    System.out.println("deposito: 22.50: "+cuenta[i].deposit(22.50));
			    System.out.println("retirar: 47.62: "+cuenta[i].whithdraw(47.62));
			    System.out.println("retirar: 400.00: "+cuenta[i].whithdraw(400.00));
			    System.out.println("saldo: "+cuenta[0].getBalance());
			    
				
			}
			
			if(i == 1)
			{
				cuenta[i]= new Account2(500.00);
			    cuenta[i]=new SavingAccount(0.00,cuenta[i].getBalance());
			    cuenta[i]=new CheckingAccount(cuenta[i].getBalance());
			    
			    System.out.println("\ncliente: owen bryant\nsaldo de cuenta: "
			    		   +cuenta[i].getBalance()+" "+(((CheckingAccount)cuenta[i]).getDate()));
			    
			    System.out.println("\ncuenta corriente sin proteccion de sobregiros\n");
			    System.out.println("retirar: 150.00: "+cuenta[i].whithdraw(150.00));
			    System.out.println("depositar: 22.50: "+cuenta[i].deposit(22.50));
			    System.out.println("retirar: 47.62: "+cuenta[i].whithdraw(47.62));
			    System.out.println("retirar: 400.00: "+cuenta[i].whithdraw(400.00));
			    System.out.println(" saldo:"+cuenta[i].getBalance());
				
			}
			
			if(i==2)
			{
				cuenta[i]= new Account2(500.00);
			    cuenta[i]=new SavingAccount(0.00,cuenta[i].getBalance());
			    cuenta[i]=new CheckingAccount(cuenta[i].getBalance(),500.00);
			    
			    System.out.println("\ncliente: maria soley\n cliente: Tim \nsaldo de cuenta: "
			    		   +cuenta[i].getBalance()+" "+(((CheckingAccount)cuenta[i]).getDate() ));
			    
			    System.out.println("\ncuenta de cheques que contienen proteccion con sobregiros\n");
			    System.out.println("retirar: 150.00: "+cuenta[2].whithdraw(150.00));
			    System.out.println("depocito: 22.50: "+cuenta[2].deposit(22.50));
			    System.out.println("retirar: 47.00: "+cuenta[2].whithdraw(47.62));
			    System.out.println("retirar: 400.00:"+(((CheckingAccount)cuenta[2]).whithdraw(400.00)));
			    
			    System.out.println("\ncuenta de cheques de maria y tim\n");
			    System.out.println("deposito: 150.00: "+cuenta[2].deposit(150.00));
			    System.out.println("retirar: 750.00: "+(((CheckingAccount)cuenta[2]).whithdraw(750.00)));
			    
			    System.out.println("saldo de cuenta: "+cuenta[2].getBalance());
			}   
			    		  
			}
			
			
		}
		
		
		

	

}
