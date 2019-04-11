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
@tag
Feature: Busqueda en google
  yo como usuaria de google quiero ser capaz de hacer una busqueda en google

  @smokeTest
  Scenario Outline: Envio de correo gmail
    Given puede entrar a la pagina de inicio de sesion de google
    When busca la palbra compiuesta "<palabraUno>" "<palabraDos>"
    Then verifica que encontro el resultado esperado

    Examples: 
      | palabraUno | palabraDos |
      | datatable  | cucumber   |
