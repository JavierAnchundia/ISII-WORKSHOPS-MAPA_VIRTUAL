Feature:Calcular la prima de seguro para un cliente

	Scenario: El cliente no cumple con los requisitos para acceder a una prima
		Given El cliente tiene una edad mayor a 80 años
		And no posee una licencia válida
		When Se calcule el valor de la prima
		Then Retornar -1
		
	Scenario: Un cliente que cumple los criterios solicita una prima 
		Given El cliente tiene una edad menor a 25 años 
		And posee una licencia válida
		And es hombre
		And no está casado
		When Se calcule el valor de la prima
		Then Retornar un valor positivo de 2000 para la prima
	
	Scenario: Un/a cliente que cumple cumple con todos los requisitos pero no presenta permiso de conducir
		Given El cliente tiene una edad menor a 80
		And puede ser hombre o mujer 
		And puede estar o no casado
		And no tiene permiso de conducir
		When Se calcule el valor de la prima
		Then Retornar -1
	
	Scenario Outline: Un cliente recibe o no recibe una prima
		Given El cliente tiene una edad "<simbolo>" a "<edad>"
		And es <"sexo">
		And esta casado: "<casado>"
		And tiene permiso de conducir: "<licencia>"
		When se calcule el valor de la prima
		Then retornar "<retorno>"
		
	Examples: 
		/simbolo /edad /licencia /sexo /casado /retorno/ 
		/> /80 /false / / /-1/
		/< /25 /true /M /false /2000/
		/< /80 /false / / /-1/
		
		
		 
		