package ec.edu.espol.workshops.second;
 
public class PremiumCalculation {

//	static final int BASE_PREMIUM = 500;
	
	
	public PremiumCalculation() {
		
	}
	public Integer calcularPremio (CarInsurance customer) {
		
		Integer montoPagar = customer.getBASE_PREMIUN();
		
		if(customer.getSex().equals("M") && !customer.getMarital_status() && customer.getAge()<25) {
			return montoPagar + 1500;
		}
		
		else if(customer.getSex().equals("F") || customer.getMarital_status()) {
			montoPagar = montoPagar - 200;
		}	
		
		else if(customer.getAge() >= 45 && customer.getAge() <= 65 ) {
			montoPagar = montoPagar - 100;
		}
		else {
			montoPagar = null;
		}
		return montoPagar;
	}
}
	