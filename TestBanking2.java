package programacion3;

import banking.*;

public class TestBanking2 {

	public static void main(String[] args) {
		
		
		Bank banco = new Bank();
		
		String []  last = {"SIMMS","BRYANT","SOLEY","SOLEY"};
		
		String [] name = {"JANE","OWEN","TIM","MARIA"};
		
		
		for(int i=0; i<=3 ; i++)
		{
			banco.addCustomer(name[i], last[i]);
		}
		
		for(int i=0; i<=3 ; i++)
		{
			System.out.print("\n"+banco.getCustomers(i).getFirstName());
			System.out.print(" "+banco.getCustomers(i).getLastName());
		}
		

	}

}
