# Automatización de Pruebas de API con SerenityRest

Este proyecto de automatización de pruebas de API utiliza SerenityRest para realizar pruebas en una aplicación de portal de pagos que ofrece tres servicios: PSE, Cash y CreditCard, que permiten realizar pagos por esos tres medios. El proyecto está construido utilizando Gradle y Java.

## Requisitos Previos

Antes de ejecutar las pruebas de automatización, asegúrate de tener instalado lo siguiente:

- Java JDK 11: [Descargar e Instalar](https://www.oracle.com/java/technologies/javase-downloads.html)
- Gradle 8.3: [Instrucciones de Instalación](https://gradle.org/install/)

## Configuración del Proyecto

1. Clona el repositorio:


    ./git clone https://github.com
   
2. Configura las variables de entorno necesarias, como las URL de los servicios y las credenciales, en el archivo 

 
    src/test/resources/serenity.properties.

## Estructura del Proyecto

La estructura del proyecto es la siguiente:

automatizacion-api-portal-pagos/

![Estructura.png](img%2FEstructura.png)

## Ejecución de las Pruebas

Para ejecutar las pruebas de automatización, utiliza el siguiente comando Gradle:

    ./gradlew clean test

Esto limpiará el proyecto y ejecutará todas las pruebas definidas en el proyecto.

## Informe de Resultados

Serenity generará un informe de resultados que puedes encontrar en la carpeta 


    target/site/serenity/index.html 

después de ejecutar las pruebas. Abre este archivo en tu navegador web para ver un informe detallado de las pruebas, incluyendo estadísticas, capturas de pantalla y más.

## Contribuciones

Si deseas contribuir a este proyecto, siéntete libre de hacer un fork del repositorio y enviar pull requests con tus mejoras.

## Problemas y Sugerencias

Si encuentras algún problema o tienes alguna sugerencia, por favor abre un issue en el repositorio para que podamos abordarlo.