template-serenity-retoNttData
Este es un proyecto de automatización de pruebas de interfaz web, realizado como parte de un reto técnico para NTTDATA. Utiliza Java 18, Serenity BDD, JUnit5 y Cucumber para estructurar y ejecutar pruebas automatizadas.

Tecnologías Utilizadas
Java 18

Serenity BDD v4.1.14

JUnit Platform v1.10.2

Cucumber JUnit Platform v7.14.0

JUnit Jupiter v5.10.2

JUnit Vintage v5.10.2

Logback Classic v1.2.10

AssertJ Core v3.25.3

Estructura del Proyecto screenplay

src
├── java
│   ├── questions            # Métodos de aserción (validaciones)
│   ├── tasks                # Acciones del usuario (login, proceso de compra)
│   ├── userinterface        # Localización de elementos web
│
└── test
    ├── runners              # Clases para ejecutar los features
    ├── stepdefinitions      # Definición de pasos (step definitions)
    └── resources



Descripción del Proyecto
Este proyecto automatiza un flujo de prueba sobre una aplicación web de compras electronicas. Los flujos cubiertos incluyen:

Login exitoso del usuario.

Proceso de compra de productos.

Validación de mensajes y comportamiento de la interfaz.

Requisitos Previos
Java 18 instalado

Gradle 7+ instalado o usar el wrapper ./gradlew

Navegador Chrome

ChromeDriver compatible en el PATH


*****Ejecutar ****
ubicarse en la raiz del proyecto y ejecutar 
gradle.bat clean test aggregate

En la carpeta target se genera la reporteria de serenity.

Verificar el archivo index.html


*** Conclusiones *** 
	El uso de Scenario Outline permite hacer pruebas reutilizables con diferentes combinaciones de datos, lo que mejora la escalabilidad del proyecto.

	La estructura del patrón Screenplay separa claramente responsabilidades, haciendo el proyecto más mantenible y fácil de extender.

	Se logró automatizar satisfactoriamente todo el flujo E2E de compra, cumpliendo con todos los requerimientos funcionales establecidos.

	Serenity proporciona un reporte detallado que permite visualizar el comportamiento de la prueba paso a paso.
   Adicional el front end de la pagina algunos web element no disponian de id, se tuvo que ubicar xpath, esto es una mala practica sin embargo no habia otros localizadores ni clas ni name.



Autor
Cristhian Flores
Proyecto técnico para NTTDATA

