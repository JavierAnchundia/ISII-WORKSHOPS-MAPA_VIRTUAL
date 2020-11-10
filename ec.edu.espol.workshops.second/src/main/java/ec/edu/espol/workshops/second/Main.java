package ec.edu.espol.workshops.second;
import java.util.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class Main { 

    
	public static void main(String[] args) { 
		
		 final Logger logger = Logger.getLogger(Main.class.getName());

		  CustomRecordFormatter formatter = new CustomRecordFormatter();
	      ConsoleHandler consoleHandler = new ConsoleHandler();
	      consoleHandler.setFormatter(formatter);
	      logger.addHandler(consoleHandler);
	      logger.setUseParentHandlers(false);

		Scanner sc = new Scanner(System.in);
		logger.info("Ingrese el sexo M -> Masculino, F -> Femenino: ");
		String sex = sc.nextLine();
		
		String edadTexto = "";
		boolean validar = false;
		while(!validar) {
			logger.info("Ingrese la edad: ");
			edadTexto= sc.nextLine();
			validar = validarNumero(edadTexto);
		}
		int edad = Integer.parseInt(edadTexto);
		
		logger.info("Tiene licencia ? si es si responda true, caso contrario false: ");
		Boolean licencia = sc.nextBoolean();
		
		logger.info("Ingrese estado del matrimonio true -> para casado, false -> para no casado: ");
		Boolean marital_status = sc.nextBoolean();
		CarInsurance car = new CarInsurance();
		car.setAge(edad);
		car.setMarital_status(marital_status);
		car.setSex(sex);
		car.setLicense(licencia);
		PremiumCalculation premiumCalc = new PremiumCalculation();
		Policies policies = new Policies();
		Integer calculoMonto = premiumCalc.calcularPremio(car);

		logger.info(Integer.toString(policies.validCustomer(car, calculoMonto)));

	}
	/***
	 * Funcion para validar que la edad sea tipo numero
	 * @param numero entrada a verificar
	 * @return returna true si el valor ingresado es digito y false si tiene otro caracter
	 */
	public static boolean validarNumero(String numero) {
		return numero.matches("[0-9]*");
	}
}
