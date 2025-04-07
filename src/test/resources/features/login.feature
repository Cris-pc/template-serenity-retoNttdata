Feature: ingreso a la pagina https://www.saucedemo.com/ y compra de 2 productos

  Scenario: Ingreso satisfactorio y compra de productos
    Given el usuario ingresa a la pagina web
    When El usuario ingresa las credenciales de manera correcta
    Then El usuario ingresa al home a realizar la compra de 2 productos