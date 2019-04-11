
@tag
Feature: Busqueda en Bing
 Yo como usuario de la web quiero ser capaz de realizar una busqueda en Bing

 Scenario Outline: : Buscar en Bing
    Given El usuario esta en el sitio de Bing
    When Busca la palabra "<palabra>" compuesta "<palabrado>"
    Then Verifica que la palabra "<resultados>" este en los resultados


    Examples: 
      | palabra     |palabrado |resultados|
      | Switch      |uno       |Switch		|
      | sophos      |dos			 |sophos		|
      | grst45254es |tres      |jfbkfjw   |
