package ec.edu.espol.workshops.second;
 
public class PremiumCalculation {
	public PremiumCalculation(){
	}
	public Integer calcularPremio(CarInsurance customer){
		Integer montoPagar = customer.getbasePremium();
		if(customer.getSex().equals("M") && !customer.getMarital_status() && customer.getAge()<25) {
			return montoPagar + 1500;
		}else if(customer.getSex().equals("F") || customer.getMarital_status()){
			montoPagar = montoPagar - 200;
		}else if(customer.getAge() >= 45 && customer.getAge() <= 65){
			montoPagar = montoPagar - 100;
		}else{
			montoPagar = null;
		}
		return montoPagar;
	}
}	