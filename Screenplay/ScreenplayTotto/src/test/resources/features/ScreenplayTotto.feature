#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Buscar un producto en la pagina de Totto
  Saray quiere hacer una busqueda en la pagina de Totto

  @SmokeTest
  Scenario Outline: Buscar en Totto
    Given Saray esta en la pagina de totto
    When Ella busca el producto deseado
      | palabra1   | palabra2         |
      | <Producto> | <Caracteristica> |
    Then Ella verifica que el carrito tenga un producto 
    Examples: 
      | Producto | Caracteristica | 
      | Morral   | negro          | 
      | Reloj    | mujer          | 
