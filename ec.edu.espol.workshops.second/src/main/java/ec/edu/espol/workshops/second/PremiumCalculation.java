package ec.edu.espol.workshops.second;
 
public class PremiumCalculation {

	static final int BASE_PREMIUM = 500;
	
	
	public PremiumCalculation() {
		
	}
	static public int calcularPremio (CarInsurance customer) {
		
		int montoPagar = BASE_PREMIUM;
		if(customer.sex.equals("M") && !customer.marital_status && customer.age<25) {
			return montoPagar + 1500;
		}
		
		if(customer.sex.equals("F") || customer.marital_status) {
			montoPagar = montoPagar - 200;
		}	
		
		if(customer.age >= 45 && customer.age <=65 ) {
			montoPagar = montoPagar - 100;
		}
		return montoPagar;
	}
}
	