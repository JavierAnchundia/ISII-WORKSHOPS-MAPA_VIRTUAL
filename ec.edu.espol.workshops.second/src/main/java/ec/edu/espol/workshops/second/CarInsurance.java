package ec.edu.espol.workshops.second;

public class CarInsurance {
	
	protected int age;
	protected String sex;
	protected Boolean marital_status;
	protected PremiumCalculation premiumCalculation;
	protected int precioPagar;
	protected CarInsurance me;
	
	private CarInsurance() {}
	
	public CarInsurance(int age, String sex, Boolean marital_status) {
		me = new CarInsurance();
		premiumCalculation = new PremiumCalculation();
		precioPagar = premiumCalculation.calcularPremio(me);
	}
}	
