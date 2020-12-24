package ec.edu.espol.workshops.second;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatementCoverageTest {

	@Test
	public void testSC1() {
		CarInsurance car = new CarInsurance();
		car.setAge(70);
		car.setMarital_status(true);
		car.setSex("M");
		car.setLicense(false);
		PremiumCalculation premiumCalc = new PremiumCalculation();
		Policies policies = new Policies();
		Integer calculoMonto = premiumCalc.calcularPremio(car);

		int value = policies.validCustomer(car, calculoMonto);
		assertEquals(-1, value);
	}
	
	@Test
	public void testSC2() {
		CarInsurance car = new CarInsurance();
		car.setAge(46);
		car.setMarital_status(false);
		car.setSex("M");
		car.setLicense(true);
		PremiumCalculation premiumCalc = new PremiumCalculation();
		Policies policies = new Policies();
		Integer calculoMonto = premiumCalc.calcularPremio(car);

		int value = policies.validCustomer(car, calculoMonto);
		assertEquals(400, value);
	}
	
	@Test
	public void testSC3() {
		CarInsurance car = new CarInsurance();
		car.setAge(70);
		car.setMarital_status(true);
		car.setSex("F");
		car.setLicense(false);
		PremiumCalculation premiumCalc = new PremiumCalculation();
		Policies policies = new Policies();
		Integer calculoMonto = premiumCalc.calcularPremio(car);

		int value = policies.validCustomer(car, calculoMonto);
		assertEquals(-1, value);
	}
	
	@Test
	public void testSC4() {
		CarInsurance car = new CarInsurance();
		car.setAge(24);
		car.setMarital_status(false);
		car.setSex("M");
		car.setLicense(false);
		PremiumCalculation premiumCalc = new PremiumCalculation();
		Policies policies = new Policies();
		Integer calculoMonto = premiumCalc.calcularPremio(car);

		int value = policies.validCustomer(car, calculoMonto);
		assertEquals(-1, value);
	}
	
	

}
