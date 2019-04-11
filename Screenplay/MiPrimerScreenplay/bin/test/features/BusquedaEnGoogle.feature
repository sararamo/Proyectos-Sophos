Feature: Search in google with data from feature
  Saray quiere hacer una busqueda en google con datos

  @SmokeTest
  Scenario Outline: buscar en google
    Given Saray esta en el sitio de google
    When ella busca la frase compuesta 
      | cadenaUno | cadenaDos   |
      | <palabra> | <palabrados>|
    Then ella verifica que la palabra "<resultadoEsperado>" este en los resultados

    Examples: 
      | palabra | palabrados | resultadoEsperado |
      | switch  | uno        | switch uno        |
      | sophos  | dos        | sophos dos        |
      | hola    | tres       | Adios Adios       |
