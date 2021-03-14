***
![banerGit](https://user-images.githubusercontent.com/22893383/107159880-121e0b80-6993-11eb-92e3-1efd1d8f4dba.PNG)

# Curso Desarrollo FullStack con Java, Angular & SQL

## UD25 - SPRING REST (WEB + H2 + JPA + ER)


### 1. Descripción
```
En esta práctica aprenderás a crear peticiones HTTP con un CRUD (Create, Read,
Update, Delete) al completo con H2 ER.
``` 

```
La carpeta "Postman" contiene capturas de la actividad donde se valida el CRUD de la API
```

- #### Ejercicio 1
 ![Captura](https://user-images.githubusercontent.com/22893383/111053535-e1833300-8464-11eb-931a-0dc41aca8c4e.PNG)
 
- #### Ejercicio 2
![2](https://user-images.githubusercontent.com/22893383/111053536-e2b46000-8464-11eb-9d79-4ddd78f38c45.PNG)

- #### Ejercicio 3
![3](https://user-images.githubusercontent.com/22893383/111053538-e3e58d00-8464-11eb-821d-2f02ecad25fc.PNG)

- #### Ejercicio 4
![4](https://user-images.githubusercontent.com/22893383/111053541-e516ba00-8464-11eb-964e-4352bb420c05.PNG)


### 2. Organización del código
***
- README.md
- UD25_ejercicioX
  - pom.xml
  - Postman/
  - src/main/
    - java/com/ejercicio1/
      - Ud25Ejercicio1Application.java
      - ServletInitializer.java
      - controller/
        + _"Clases que definen los endpoint de la API"_
      - dao/
        + _"Clases que definen el acceso a los datos"_
      - dto/
        + _"Clases que definen el modelo de las entidades"_
      - service/
        + _"Clases que validan los datos para su acceso"_
    - resources
      - application.properties
      - data.sql


### 3. Clonar y ejecutar
***
```
IDE         Eclipse Spring Tool Suite 4
Core        Java            
JRE         1.8
Builder     Maven
DB          H2
```

###### Install
```
Spring Tools 4        https://spring.io/tools
```

### 4. Dependencias
***

- H2 Database
- Spring Data JPA
- Spring Web
- Spring Boot DevTools
***
