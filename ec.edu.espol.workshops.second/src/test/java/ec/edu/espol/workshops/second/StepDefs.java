package ec.edu.espol.workshops.second;


import io.cucumber.java.en.Given; 
import io.cucumber.java.en.Then; 
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import static org.junit.Assert.*;

public class StepDefs {
	
private Boolean licencia;
private Boolean casado;
private Integer retorno;
private Integer edad;
private String sexo;
private Boolean edadValida;


@Given("El cliente tiene una edad menor a (\\\\d+) anos : {string}") 
public void valid_edad(Integer edad) 
{
	this.edad = edad;
	if(this.edad > 80) {
		this.edadValida = false;
	}else {
		this.edadValida= true;
	}
}

@Given("posee una licencia valida: {string}")
public void posee_una_licencia_valida(String string) {
    this.licencia = true;
}

@And("esta casado: {}")
public void marital_status(Boolean casado) {
	this.casado = casado;
}

@And("es {string}")
public void gender(String sexo) {
	this.sexo = sexo;
}


@When("Se calcule el valor de la prima") 

public void calcular_valor_prima() {
	PremiumCalculation premiumCalc = new PremiumCalculation();
	CarInsurance car = new CarInsurance();
	car.setAge(this.edad);
	car.setMarital_status(this.casado);
	car.setSex(this.sexo);
	car.setLicense(this.licencia);
	Policies policies = new Policies();
	Integer calculoMonto = premiumCalc.calcularPremio(car);
	
	this.retorno = policies.validCustomer(car, calculoMonto);
}


@Then("Retornar {int}")
public void retornar(Integer int1) {
	assertEquals(int1, this.retorno); 
}

@Given("El cliente tiene una edad menor a {int} anos : false")
public void el_cliente_tiene_una_edad_menor_a_anos_false(Integer edad) {
	this.edad = edad;
	this.edadValida = false;

}

@Given("posee una licencia valida: true")
public void posee_una_licencia_valida_true() {
    this.licencia=true;
}

@Given("posee una licencia valida: false")
public void posee_una_licencia_valida_false() {
    this.licencia=false;

}

@Given("El cliente tiene una edad menor a {int} anos : {string}")
public void el_cliente_tiene_una_edad_menor_a_anos(Integer edad, String string) {
	this.edad = edad;
	if(this.edad > 80) {
		string = "false";
	}else {
		string= "true";
	}
}



@Given("El cliente tiene una edad menor a {int} anos : true")
public void el_cliente_tiene_una_edad_menor_a_anos_true(Integer edad) {
	this.edad = edad;
	this.edadValida = true;

}

@Given("El cliente tiene una edad menor a {string} anos : {string}")
public void el_cliente_tiene_una_edad_menor_a_anos(String string, String edad) {
	this.edad = Integer.valueOf(string);
	this.edadValida= true;
	
}



}