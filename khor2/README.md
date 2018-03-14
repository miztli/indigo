# Examen Indigo

## Instrucciones

Las siguientes instrucciones, te crearán una copia del proyecto en tu máquina local con el propósito de contribuir con el desarrollo de la aplicación.                        

### Requisitos

* 1.- jdk-1.8+
* 2.- groovy 2.4.13
* 3.- gradle 4.5.1
* 4.- apache kafka 1.0.1
* 5.- node 9.5.0
* 6.- npm 5.6.0
* 7.- mongo 3.6.3
* 8.- git
* 9.- git-flow
* 10.- postgresql 9.5
* 11.- robomongo LATEST

## Sugerencia para la instalación de cada requisito

# ¿Cómo compilar el proyecto?
* 1.- Posicionarse sobre la carpeta raiz del proyecto, en donde se ubica el archivo: **${project.root}/pom.xml**
* 2.- Ejecutar el comando: `mvn clean package -DskipTests`

## Testing

* 1.- Posicionarse sobre la carpeta raiz del proyecto, en donde se ubica el archivo: **${project.root}/pom.xml**
* 2.- Ejecutar el comando: `mvn clean test`

## ¿Cómo ejecutar el proyecto después de la compilación?
* 1.- Posicionarse sobre la carpeta raiz del proyecto, en donde se ubica el archivo: **${project.root}/pom.xml**
* 2.- Para iniciar el ejercicio 1, ejecutar el comando: `java -cp target/exam-1.0-SNAPSHOT.jar com.indigo.SeriesProduct`
* 3.- Ingresar los datos en consola tal y como se indica en la hoja de examen
* 4.- Para iniciar el ejercicio 1, ejecutar el comando: `java -cp target/exam-1.0-SNAPSHOT.jar com.indigo.PalindromeSeries`
* 5.- Ingresar los datos en consola tal y como se indica en la hoja de examen
