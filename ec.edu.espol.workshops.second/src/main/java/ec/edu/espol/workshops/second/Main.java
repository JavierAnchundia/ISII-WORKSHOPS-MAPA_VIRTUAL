package ec.edu.espol.workshops.second;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el sexo M -> Masculino, F -> Femenino: ");
		String sex = sc.nextLine();
		
		System.out.println("Ingrese la edad: ");
		int edad = sc.nextInt();
		
		System.out.println("Tiene licencia ? si es si responda true, caso contrario false: ");
		Boolean licencia = sc.nextBoolean();
		
		System.out.println("Ingrese estado del matrimonio true -> para casado, false -> para no casado: ");
		Boolean marital_status = sc.nextBoolean();
		
		CarInsurance car = new CarInsurance();
		car.setAge(edad);
		car.setMarital_status(marital_status);
		car.setSex(sex);
		car.setLicense(licencia);
		
		PremiumCalculation premiumCalc = new PremiumCalculation();
		Policies policies = new Policies();
//		boolean estado = policies.validCustomer(car);
		
		Integer calculoMonto = premiumCalc.calcularPremio(car);

		System.out.println(policies.validCustomer(car, calculoMonto));

	}

}
