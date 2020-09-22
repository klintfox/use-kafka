# Apache Kafka
Ejemplo de la creación de un Producer y Consumer en Apache Kafka y Springboot

### Descripción
Apache Kafka es un proyecto de intermediación de mensajes de código abierto desarrollado por LinkedIn y donado a la Apache Software Foundation escrito en Java y Scala

### Tecnologías
- Java 8
- Apache Kafka 2.13
- Zookeeper
- Gson

### Enlace de Descarga
https://kafka.apache.org/downloads

### Ejecución
### Paso 1
- Ubicarse en la raiz de kafka y crear la carpeta data
- Editar el archivo zookeeper.properties ubicado en la carpeta "config" y agregar en la propiedad "dataDir" la ruta de la carpeta "data"
    ```
    dataDir=D:/6-Programas/kafka_2.13-2.6.0/data
    ```
### Paso 2
- Abrir el promt de comandos como adminstador y ubicarse en el archivo kafka/bin/windows y ejeuctar el siguiente comando para inciar Zoo
    ```
    zookeeper-server-start.bat ../../config/zookeeper.properties
    ```
- Abrir el promt de comandos como administrador y ubicarse en elarchivo kafka/bin/windows y ejecutar el siguiente comando para iniciar el servidor de Kafka
    ```
    kafka-server-start.bat ../../config/server.properties
    ```
- Abrir el promt de comandos como administrador y ubicars een el archivo kafka/bin/windows y ejecutar el siguiente comando para ejecutar el "Consumer"
    ```
    kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic myTopic
    ```
### SprignBoot
- Ejecutar la aplicación "use-kafka"

### Postman
## Prueba en postman para myTopic
- Realizar un Post a la siguiente  y pasarle el siguiente json para probar uno de los métodos del proyecto de ejemplo
    ```
    localhost:8090/api/kafka/ejemplo    
    {
        "name": "Axl",
        "lastname": "Rose"
    }
    ```
## Prueba para myTopic2 
- Realizar un Post a la siguiente  y pasarle el siguiente json para probar uno de los métodos del proyecto de ejemplo
    ```
    localhost:8090/api/kafka/persona    
    {
        "name": "Mick",
        "lastname": "Jagger",
        "age": 77
    }
    ```