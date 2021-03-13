  
![banerGit](https://user-images.githubusercontent.com/22893383/107159880-121e0b80-6993-11eb-92e3-1efd1d8f4dba.PNG)

# Curso Desarrollo FullStack con Java, Angular & SQL

### 1. Descripción

##### UD22 - Patrón MVC
 - ##### Ejercicio 1
```java
Crea un proyecto Maven siguiendo el patrón MVC que realice el CRUD completo
sobre la siguiente base de datos
```
![Captura](https://user-images.githubusercontent.com/22893383/111039766-05785180-8430-11eb-9178-2a7490d96fd2.PNG)

- ##### Ejercicio 2
```java
Crea un proyecto Maven siguiendo el patrón MVC que realice el CRUD completo
sobre la siguiente base de datos
```
![Captura](https://user-images.githubusercontent.com/22893383/111039773-1628c780-8430-11eb-85e2-377bc31fef59.PNG)


 - ##### Ejercicio 3
```java
Crea un proyecto Maven siguiendo el patrón MVC que realice el CRUD completo
sobre la siguiente base de datos
```
![Captura](https://user-images.githubusercontent.com/22893383/111039784-22148980-8430-11eb-9b41-b005e0f7ebd5.PNG)


### 2. Organización del código
- README.md
- T22 - Patrón MVC.pdf
- SQL
  - Ej1, creación de BD y tablas.txt
  - Ej2, creación BD y tablas.txt
  - Ej3, creación de DB y tablas.sql
- UD22_Ejercicio1
  - pom.xml
  - src/main/java
    - Backend
      - mainApp.java
      - controller
        - Controller.java
      - model
        - conexion
          - Conexion.java
        - dao
          - ClienteDao.java
        - dto
          - Cliente.java
        - service
          - ClienteServ.java
      - view
        - VentanaBuscar.java
        - VentanaInsertar.java
        - VentanaPrincipal.java
- UD22_Ejercicio2
  - pom.xml
  - src/main/java
    - Backend
      - mainAppEj2.java
      - controller
        - ControllerEj2.java
      - model
        - conexion
          - ConexionEj2.java
        - dao
          - ClienteDaoEj2.java
          - VideoDao.java
        - dto
          - ClienteDto.java
          - VideoDto.java
        - service
          - ClienteService.java
          - VideoService.java
      - view
        - VentPrincipal.java
        - VentanaBuscarCliente.java
        - VentanaBuscarVideo.java
        - VentanaInsertarCliente.java
        - VentanaInsertarVideo.java
        - VentanaMostrarTodosVideos.java

- UD22_Ejercicio1
  - pom.xml
  - src/main/java
    - Backend
      - mainAppEj3.java
      - controller
        - Controlador.java
      - model
        - conexion
          - Conectar.java
        - dao
          - AsignadoADao.java
          - CientificoDao.java
          - ProyectoDao.java
        - dto
          - AsignadoA.java
          - Cientifico.java
          - Proyecto.java
        - service
          - AsignadoAService.java
          - CientificoService.java
          - ProyectoService.java
      - view
        - GestionAsignado.java
        - GestionCientificos.java
        - GestionProyectos.java
        - InterfazGrafica.java

### 3. Clonar y ejecutar

```
IDE         Eclipse IDE Java EE Developers
Core        Java            
JRE         1.8
Builder 	Maven
```

###### Install
```
Eclipse    	https://www.eclipse.org/downloads/packages/
WindowBuilder 	https://www.eclipse.org/windowbuilder/download.php
```
