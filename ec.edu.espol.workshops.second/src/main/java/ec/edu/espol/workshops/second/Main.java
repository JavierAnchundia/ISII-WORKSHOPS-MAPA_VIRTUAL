package ec.edu.espol.workshops.second;
import java.util.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class Main { 

    
	public static void main(String[] args) { 
		Boolean marital_status=false, licencia=false;
		 final Logger logger = Logger.getLogger(Main.class.getName());
		 int edad = 0;
		  CustomRecordFormatter formatter = new CustomRecordFormatter();
	      ConsoleHandler consoleHandler = new ConsoleHandler();
	      consoleHandler.setFormatter(formatter);
	      logger.addHandler(consoleHandler);
	      logger.setUseParentHandlers(false);

		Scanner sc = new Scanner(System.in);
		logger.info("Ingrese el sexo M -> Masculino, F -> Femenino: ");
		String sex = sc.nextLine();
		
		try {
			logger.info("Ingrese la edad: ");
			edad= sc.nextInt();
		}catch(Exception e) {
			logger.info(Integer.toString(-1));
			System.exit(0);
		}
		try {
			logger.info("Tiene licencia ? si es si responda true, caso contrario false: ");
			licencia = sc.nextBoolean();
		}catch(Exception e) {
			logger.info(Integer.toString(-1));
			System.exit(0);
		}
		
		try {
			logger.info("Ingrese estado del matrimonio true -> para casado, false -> para no casado: ");
			marital_status = sc.nextBoolean();
		}catch(Exception e) {
			logger.info(Integer.toString(-1));
			System.exit(0);
		}
		
		CarInsurance car = new CarInsurance();
		car.setAge(edad);
		car.setMarital_status(marital_status);
		car.setSex(sex);
		car.setLicense(licencia);
		PremiumCalculation premiumCalc = new PremiumCalculation();
		Policies policies = new Policies();
		if(car.getSex().equals("M") || car.getSex().equals("F")) {
			Integer calculoMonto = premiumCalc.calcularPremio(car);
			logger.info(Integer.toString(policies.validCustomer(car, calculoMonto)));
			sc.close();
		}
		else {
			logger.info(Integer.toString(-1));
			System.exit(0);
		}
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
