  
![banerGit](https://user-images.githubusercontent.com/22893383/107159880-121e0b80-6993-11eb-92e3-1efd1d8f4dba.PNG)

# Curso Desarrollo FullStack con Java, Angular & SQL

## UD24 - SPRING REST

### 1. Descripción
```
En esta práctica aprenderás a crear peticiones HTTP con un CRUD (Create, Read,
Update, Delete) al completo. Por eso implementaremos un patrón de arquitectura MVC
con repositorios. Los recursos de esta actividad no tienen por qué usarse al 100% de la
documentación.

CONCEPTOS A INVESTIGAR:
● Enumerable
● RCP (webservice)
``` 

```
La carpeta "Postman" contiene capturas de la actividad donde se valida el CRUD de la API
```

 - ##### Ejercicio 1
```java
Crearemos un programa de gestión de empleados muy sencillo donde dependiendo del
trabajo del empleado se le asignará un salario automáticamente. De un trabajador
identificamos el nombre y su trabajo, estaría bueno tener un identificador único por este
trabajador. Los trabajos son fijos, es decir ya están definidos en un ENUMERABLE.
Dependiendo del trabajo se asignará un salario al empleado una vez se crea.

NOTAS:
  1. El servidor tiene que tener muy definidos los dominios y repositorios.
  2. El dominio tiene que tener el CRUD al completo. (Create, Read, Update, Delete)
  3. Las peticiones de frontal se realizará con POSTMAN.
  4. Finalmente crea una petición especial que busque empleados por trabajo.
```

### 2. Organización del código
- README.md
- Postman
  - deleteTrabajadorById.png
  - deleteTrabajadorById2.png
  - getAll.png
  - getTrabajadorById.png
  - getTrabajadorByTrabajo.png
  - postTrabajador1.png
  - postTrabajador2.png
  - putTrabajadorById.png
  - putTrabajadorById2.png
- UD24
  - pom.xml
  - src/main
  - resources
    - application.properties
    - data.sql
  - /java/com/
    - SpringRest
      - ServLetInitializer.java
      - Ud24Application.java
      - controller
          - TrabajadorController.java
      - dao
          - ITrabajadorDao.java
      - dto
          - Trabajador.java
      - service
          - ITrabajadorService.java
          - TrabajadorServiceImpl.java

### 3. Clonar y ejecutar

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

- H2 Database
- Spring Data JPA
- Spring Web
- Spring Boot DevTools
