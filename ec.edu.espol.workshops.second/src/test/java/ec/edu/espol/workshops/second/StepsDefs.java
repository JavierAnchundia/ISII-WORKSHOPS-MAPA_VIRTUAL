package ec.edu.espol.workshops.second;


import io.cucumber.java.en.Given; 
import io.cucumber.java.en.Then; 
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import static org.junit.Assert.*;

public class StepDefs {
	
private Boolean license;
private Boolean married;
private Integer actualAnswer;
private Boolean older_maxAge;
private Boolean younger_customer;
private Boolean gender;


@Given("El cliente tiene una edad mayor a 80") 
public Boolean older_than_maxAgea(Integer age) 
{
	if(age > 80) {
		return older_maxAge = true;
	}else {
		return older_maxAge = false;
	}
}

@And("El cliente tiene/no tiene licencia")
public void has_license(Boolean license) {
	this.license = license;
}

@And("El cliente está/no está casado")
public void marital_status(Boolean married) {
	this.married = married;
}

@And("El cliente es hombre/mujer")
public void gender(Boolean gender) {
	this.gender = gender;
}

@Given("El cliente tiene una edad menor a 25 ") 
public Boolean young_customer(Integer age) 
{
	if(age < 25) {
		return younger_customer = true;
	}else {
	return younger_customer = false;
	}
}


@When("Calcular valor de prima") 

public void calcular_valor_prima(Integer age, Boolean married, String sex, Boolean license) {
	PremiumCalculation premiumCalc = new PremiumCalculation();
	CarInsurance car = new CarInsurance();
	car.setAge(age);
	car.setMarital_status(married);
	car.setSex(sex);
	car.setLicense(license);
	actualAnswer = premiumCalc.calcularPremio(car); 
}

@Then("I should be told {string}")
public void i_should_be_told(Integer expectedAnswer) {
	assertEquals(expectedAnswer, actualAnswer); 
}


}