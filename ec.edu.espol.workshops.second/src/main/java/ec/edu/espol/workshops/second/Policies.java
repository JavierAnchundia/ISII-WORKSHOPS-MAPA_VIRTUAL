package ec.edu.espol.workshops.second;

public class Policies {
	final static int max_age = 80;
	public Policies(){
		
	}
	
	public int validCustomer(CarInsurance customer, Integer valor){
		if(customer.getAge() >80 || !customer.getLicense() || valor == null){ return -1; } else{
			return valor;
		}
	}
}
