Feature: Calcular la prima de seguro para un cliente

  Scenario: El cliente no cumple con los requisitos para acceder a una prima
    Given El cliente tiene una edad menor a 80 anos : false
    And es 'F'
    And esta casado: true
    And posee una licencia valida: false
    When Se calcule el valor de la prima
    Then Retornar -1

  Scenario: Un cliente que cumple los criterios solicita una prima
    Given El cliente tiene una edad menor a 25 anos : true
    And es 'M'
    And esta casado: false
    And posee una licencia valida: true
    When Se calcule el valor de la prima
    Then Retornar 2000

  Scenario: Un/a cliente que cumple cumple con todos los requisitos pero no presenta permiso de conducir
    Given El cliente tiene una edad menor a 80 anos : true
    And es 'F'
    And esta casado: true
    And posee una licencia valida: false
    When Se calcule el valor de la prima
    Then Retornar -1

  Scenario Outline: Un cliente recibe o no recibe una prima
    Given El cliente tiene una edad menor a <edad> anos : <edadValida>
    And es "<sexo>"
    And esta casado: <casado>
    And posee una licencia valida: <licencia>
    When Se calcule el valor de la prima
    Then Retornar <retorno>

    Examples: 
      | edad | edadValida | licencia | sexo | casado | retorno |
      |   80 | false      | false    | F    | true   |      -1 |
      |   25 | true       | true     | M    | false  |    2000 |
      |   80 | true       | false    | F    | false  |      -1 |
