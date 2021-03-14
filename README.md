***
![banerGit](https://user-images.githubusercontent.com/22893383/107159880-121e0b80-6993-11eb-92e3-1efd1d8f4dba.PNG)

# Curso Desarrollo FullStack con Java, Angular & SQL

## UD26 - SPRING REST (WEB + MYSQL + JPA + ER)


### 1. Descripción
```
En esta práctica aprenderás a crear peticiones HTTP con un CRUD 
(Create, Read, Update, Delete) al completo con MySQL ER (n/n).
``` 

```
La carpeta "Postman" contiene capturas de la actividad donde se valida el CRUD de la API
```

- #### Ejercicio 1
![1](https://user-images.githubusercontent.com/22893383/111074372-e5559a80-84e2-11eb-809b-99b4c02490f3.PNG)

- #### Ejercicio 2
![2](https://user-images.githubusercontent.com/22893383/111074374-e5ee3100-84e2-11eb-9e49-302ac61794dd.PNG)

- #### Ejercicio 3
![3](https://user-images.githubusercontent.com/22893383/111074377-e686c780-84e2-11eb-8393-d431a7bef0be.PNG)

- #### Ejercicio 4
![4](https://user-images.githubusercontent.com/22893383/111074378-e71f5e00-84e2-11eb-9f89-b63053ea563f.PNG)


### 2. Organización del código
***
- README.md
- UD26_ejercicioX
  - pom.xml
  - Postman/
  - src/main/
    - java/com/ejercicioX/
      - Ud26EjercicioXApplication.java
      - ServletInitializer.java
      - controller/ ``"Clases que definen los endpoint de la API"``
      - dao/ ``"Clases que definen el acceso a los datos"``
      - dto/ ``"Clases que definen el modelo de las entidades"``
      - service/ ``"Clases que validan los datos para su acceso"``
    - resources
      - application.properties
      - data.sql ``"Archivo sql que ha servido de base para crear la BD"``
      - dataExport.sql ``"Archivo sql exportado de la BD"``


### 3. Clonar y ejecutar
***
```
IDE         Eclipse Spring Tool Suite 4
Core        Java            
JRE         1.8
Builder     Maven
DB          MySQL
```

###### Install
```
Spring Tools 4        https://spring.io/tools
MySQL Workbench 8.0   https://www.mysql.com/products/workbench/       
```

### 4. Dependencias
***

- MySQL Driver
- Spring Data JPA
- Spring Web
- Spring Boot DevTools

***
