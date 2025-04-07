template-serenity-retoNttData
Este es un proyecto de automatización de pruebas de interfaz web, realizado como parte de un reto técnico para NTTDATA. Utiliza Java 18, Serenity BDD, JUnit5 y Cucumber para estructurar y ejecutar pruebas automatizadas.

🚀 Tecnologías Utilizadas
Java 18

Serenity BDD v4.1.14

JUnit Platform v1.10.2

Cucumber JUnit Platform v7.14.0

JUnit Jupiter v5.10.2

JUnit Vintage v5.10.2

Logback Classic v1.2.10

AssertJ Core v3.25.3

📁 Estructura del Proyecto screenplay

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

Autor
Cristhian Flores
Proyecto técnico para NTTDATA

