package ec.edu.espol.workshops.second;

public class Policies {
<<<<<<< HEAD
	
	final static int max_age = 80;
	public Policies(){
		
	}
	public int validCustomer(CarInsurance customer, Integer valor) {
		
		if(customer.getAge() > max_age || !customer.getLicense() || valor == null) {
			return -1;
		}
		else {
=======

	public Policies(){}
	
	public int validCustomer(CarInsurance customer, Integer valor){
		if(customer.getAge() >80 || !customer.getLicense() || valor == null){ return -1; } else{
>>>>>>> f39891bc556081655e3429e1cdb560a7dfa5cf50
			return valor;
		}
	}
}
