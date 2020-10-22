package ec.edu.espol.workshops.second;

public class Policies {

	protected Boolean validCustomer(CarInsurance customer) {
		
		if(customer.age>80 || !customer.license) {return false;}
		return true;
	}
}
