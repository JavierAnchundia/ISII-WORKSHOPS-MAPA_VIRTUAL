package ec.edu.espol.workshops.second;


import static org.junit.Assert.*;

import org.junit.Test;

public class PathCoverageTest {

	@Test
	public void testPC1() {
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
	public void testPC2() {
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
	public void testPC3() {
		CarInsurance car = new CarInsurance();
		car.setAge(70);
		car.setMarital_status(true);
		car.setSex("F");
		car.setLicense(true);
		PremiumCalculation premiumCalc = new PremiumCalculation();
		Policies policies = new Policies();
		Integer calculoMonto = premiumCalc.calcularPremio(car);

		int value = policies.validCustomer(car, calculoMonto);
		assertEquals(300, value);
	}
	
	@Test
	public void testPC4() {
		CarInsurance car = new CarInsurance();
		car.setAge(24);
		car.setMarital_status(false);
		car.setSex("M");
		car.setLicense(true);
		PremiumCalculation premiumCalc = new PremiumCalculation();
		Policies policies = new Policies();
		Integer calculoMonto = premiumCalc.calcularPremio(car);

		int value = policies.validCustomer(car, calculoMonto);
		assertEquals(2000, value);
	}
	
	@Test
	public void testPC5() {
		CarInsurance car = new CarInsurance();
		car.setAge(70);
		car.setMarital_status(false);
		car.setSex("M");
		car.setLicense(false);
		PremiumCalculation premiumCalc = new PremiumCalculation();
		Policies policies = new Policies();
		Integer calculoMonto = premiumCalc.calcularPremio(car);

		int value = policies.validCustomer(car, calculoMonto);
		assertEquals(-1, value);
	}
	
	@Test
	public void testPC6() {
		CarInsurance car = new CarInsurance();
		car.setAge(46);
		car.setMarital_status(false);
		car.setSex("M");
		car.setLicense(false);
		PremiumCalculation premiumCalc = new PremiumCalculation();
		Policies policies = new Policies();
		Integer calculoMonto = premiumCalc.calcularPremio(car);

		int value = policies.validCustomer(car, calculoMonto);
		assertEquals(-1, value);
	}
	
	@Test
	public void testPC7() {
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
	public void testPC8() {
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
