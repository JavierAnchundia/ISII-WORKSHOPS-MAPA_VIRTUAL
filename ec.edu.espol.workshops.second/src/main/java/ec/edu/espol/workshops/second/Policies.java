package ec.edu.espol.workshops.second;

public class Policies {

	protected Boolean validCustomer(CarInsurance customer) {
		
		if(customer.age>80 || !customer.license) {return false;}
		return true;
	}
	
	protected int validardatos(Boolean police, String sex, Boolean marital_status) {
		if(police && (sex == "M" || sex == "F") && (marital_status || !marital_status)) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
