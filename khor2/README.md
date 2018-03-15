# KHOR2.0

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

## Sugerencia para la instalación de cada requisito (indispensable seguir el orden)
1.- Instalación del sdkman
* Ejecutar el siguiente comando en una terminal como se indica en el siguiente link: **http://sdkman.io/** `curl -s "https://get.sdkman.io" | bash`
* Al terminar, se debe abrir una nueva terminal y ejecutar el comando: `source "$HOME_DIR/.sdkman/bin/sdkman-init.sh"`, en donde $HOME_DIR es el directorio raíz del usuario que realiza la instalación
* Para probar la instalación, ejecutar: `sdk help`

2.- Instalación del jdk 1.8+ como default
* Ejecutar: `sdk install java 8u161-oracle` y aceptar los terminos durante la instalación
* Para probar la instalación, ejecutar: `java -version`

3.- Instalación groovy 2.4.13 como default
* Ejecutar: `sdk install groovy 2.4.13`
* Para probar la instalación, ejecutar: `groovy -v`

4.- Instalación gradle 4.5.1 como default
* Ejecutar: `sdk install gradle 4.5.1`
* Para probar la instalación, ejecutar: `gradle -v`

5.- Instalación de linuxbrew (opcional) como se indica en el siguiente link: **http://linuxbrew.sh/**
* Ejecutar: sh -c `"$(curl -fsSL https://raw.githubusercontent.com/Linuxbrew/install/master/install.sh)"`, luego presiona enter durante la instalación para finalizar
* Siguientes pasos:
  
  Instalar dependencias de Linuxbrew si cuentas con acceso de superusuario:
  Debian, Ubuntu, etc.
    `sudo apt-get install build-essential`
  Fedora, Red Hat, CentOS, etc.
    `sudo yum groupinstall 'Development Tools'`
  See http://linuxbrew.sh/#dependencies for more information.

    Agregar Linuxbrew a la variable $PATH, ejecutando el siguiente bloque:
    *Debian/Ubuntu*
    ```
    test -d ~/.linuxbrew && PATH="$HOME/.linuxbrew/bin:$HOME/.linuxbrew/sbin:$PATH"
    test -d /home/linuxbrew/.linuxbrew && PATH="/home/linuxbrew/.linuxbrew/bin:/home/linuxbrew/.linuxbrew/sbin:$PATH"
    test -r ~/.bash_profile && echo "export PATH='$(brew --prefix)/bin:$(brew --prefix)/sbin'":'"$PATH"' >>~/.bash_profile
    ```
    *CentOS/Fedora/RedHat*
    ```
    echo "export PATH='$(brew --prefix)/bin:$(brew --prefix)/sbin'":'"$PATH"' >>~/.profile
    ```
    
    Se recomienda instalar gcc, ejecutando:
    `brew install gcc`
    
    Para probar la instalación, ejecutar: `brew help`

6.- Instalación de git y gitflow
* Ejecutar: `brew install git`
* Para probar la instalación, ejecutar: `git --version`
* Ejecutar: `brew install git-flow`
* Para probar la instalación, ejecutar `git-flow help`

7.- Instalación de Mongodb 3.6.3
*CentOS/Fedora/RedHat*
* Crea un archivo ejecutando: `sudo touch /etc/yum.repos.d/mongodb-org-3.6.repo`
* Agrega las siguientes lineas al archivo y guarda los cambios:
```
[mongodb-org-3.6]
name=MongoDB Repository
baseurl=https://repo.mongodb.org/yum/redhat/7Server/mongodb-org/3.6/x86_64/
gpgcheck=1
enabled=1
gpgkey=https://www.mongodb.org/static/pgp/server-3.6.asc
```
* Ejecuta: `dnf install -y mongodb-org` 
* Prueba la insatación ejecutando: `mongo -version`

8.- Instalación de Robomongo (cliente Mongodb)
* Descarga el paquete de instalación de: **https://robomongo.org/download**
* Descomprime el paquete en el directorio de tu preferencia ($DIR_MONGO)
* Renombra el directorio a: **/robo3t**
* Crea un link simbólico: `sudo ln -s $DIR_MONGO/bin/robo3t /usr/bin/robo3t`
* Crea un archivo para poder hacerlo ejecutable de la siguiente manera:
```
cat > ~/.local/share/applications/robo3t.desktop <<EOL
[Desktop Entry]
Encoding=UTF-8
Name=Robo3T
Exec=robo3t
Terminal=false
Type=Application
Categories=Development;
EOL
```
* Prueba la instalación haciendo la búsqueda en tus programas instalados con el nombre de *robo3t*

9.- Instalación de nvm (Node Version Manager)
* Ejecutar: `curl -o- https://raw.githubusercontent.com/creationix/nvm/v0.33.8/install.sh | bash`
* Ejecutar: `source ~/.bashrc`, para recargar la configuración del bash
* Para probar la instalación, ejecutar: `nvm --version`

10.- Instalación de node y npm
* Ejecutar: `nvm install node`
* Para probar la instalación de npm, ejecutar: `node -v`
* Para probar la instalación de node, ejecutar: `nvm -v`

11.- Instalación de docker
*CentOS/Fedora/RedHat*
* Instalar el paquete `dnf-plugins-core` para manejar los repositorios DNF desde la línea de comandos: `sudo dnf -y install dnf-plugins-core`
* Agregar el repositorio estable: `sudo dnf config-manager --add-repo https://download.docker.com/linux/fedora/docker-ce.repo`
* Instalar docker y aceptar los terminos durante la instalación: `sudo dnf install docker-ce`
* Prueba la instalación: `systemctl status docker`

*NOTA: para ejecutar docker sin usar sudo, ejecutar:*
```
    sudo groupadd docker && sudo gpasswd -a ${USER} docker && sudo systemctl restart docker
    sudo gpasswd -a miztlim docker && sudo systemctl restart docker
```

12.- Instalación de postgresql (con docker)
* Ejecutar el siguiente comando:
`docker run --name postgres-9.5 -e POSTGRES_PASSWORD=indigo -p 5432:5432 -d postgres:9.5`
    En donde: *--name* es el nombre identificador de la imagen que levanta el docker
              *-e* es la variable de ambiente para la contraseña de la instancia de postgres
              *-p* es el **bridge** entre el puerto interno del contenedor, y lo enlaza con el puerto de nuestra máquina local
              *-d* corre el contenedor en modo "detached"
              *postgres:9.5*  es la versión exacta de postgresql que se utiliza
* Prueba la instalación ejecutando: `docker ps`         

13.- Instalación de Apacke Kafka 1.0.1
* Descargar el arvivo binario del siguiente link: **https://www.apache.org/dyn/closer.cgi?path=/kafka/1.0.1/kafka_2.11-1.0.1.tgz**
* Desempaquetar el archivo
* No es necesaria una instalación, únicamente se ejecuta un .jar

## Levantamiento del ambiente de pruebas
*NOTA* **$KAFKA_DIR**, es el directorio raiz de apache kafka

1.- Iniciar servidor zookeper (puerto default 2181)
* Ejecutar el comando: `./$KAFKA_DIR/bin/zookeeper-server-start.sh ../config/zookeeper.properties`

2.- Iniciar servidor kafka (puerto default 9092)
* Ejecutar el comando: `./$KAFKA_DIR/bin/kafka-server-start.sh ../config/server.properties`

3.- Descargar los siguientes repositorios de bitbucket sobre el workspace deseado y hacer un checkout a la rama development en cada uno de ellos:
```
    git clone https://miztli_melgoza@bitbucket.org/team-HUM1701/hum1703-administracion.git
    git clone https://miztli_melgoza@bitbucket.org/team-HUM1701/hum1703-endpoint.git
    git clone https://miztli_melgoza@bitbucket.org/team-HUM1701/hum1703-preferencias.git
    git clone https://miztli_melgoza@bitbucket.org/team-HUM1701/hum1703-psicometria.git
    git clone https://miztli_melgoza@bitbucket.org/team-HUM1701/hum1703-topicmonitor.git
    git clone https://miztli_melgoza@bitbucket.org/team-HUM1701/hum1703-web.git
```

4.- Registrar los tópicos en kafka
* Posicionarse en el proyecto *hum1703-topicmonitor* y ejecutar: 
    ```
        npm install
        node index.js
    ```
*NOTA: La ejecución de este último comando, creará los tópicos necesario para el funcionamiento de los microservicios, si se requiere agregar un tópico adicional, se debe incluir en el archivo **kafka.topics.yml** dentro del módulo correspondiente*

5.- Cargar script de carga de esquemas en postgresql
* Ejecutar: `psql -h localhost -p 5432 -U postgres`

6.- Levantar los microservicios:
    	* administración:
	`${MICROSERVICES_PATH}/hum1703-administracion/gradle bootRun`
	
	* psicometria
	`${MICROSERVICES_PATH}/hum1703-psicometria/gradle bootRun`
    	
	* endpoint	
	`${MICROSERVICES_PATH}/hum1703-endpoint/npm install`
	`${MICROSERVICES_PATH}/hum1703-endpoint/src node index.js`
    	
	* web
	`${MICROSERVICES_PATH}/hum1703-web/npm install`
    
	* crear un archivo propio en: **${MICROSERVICES_PATH}/hum1703-web/.env.local** y agregar las siguientes líneas*
    	`${MICROSERVICES_PATH}/hum1703-web/`
    
    
