
![banerGit](https://user-images.githubusercontent.com/22893383/107159880-121e0b80-6993-11eb-92e3-1efd1d8f4dba.PNG)

# Curso Desarrollo FullStack con Java, Angular & SQL

### 1. Descripción

##### UD7 - ArrayList y Hashtable
 -  ##### Ejercicio 1
 ```
Crea una aplicación que calcule la nota media de los alumnos pertenecientes al 
curso de programación. 
Una vez calculada la nota media se guardara esta información en un diccionario 
de datos que almacene la nota media de cada alumno. 
Todos estos datos se han de proporcionar por pantalla.
```
 - ##### Ejercicio 2
  ```
Crea una aplicación que gestione el flujo de ventas de una caja de supermercado. 
El programa guardara la cantidades del carrito de compra dentro de una lista. 
Mostrará por pantalla la siguiente informacón:
	• IVA aplicado 21 o 4
	• Precio total bruto y precio mas IVA
	• Numero de artículos comprados
	• Cantidad pagada
	• Cambio a devolver al cliente
```
 - ##### Ejercicio 3
 ```
Crea una base de datos de 10 artículos para controlar el stock de productos de 
una tienda por medio de un diccionario de datos articulo precio. 
El usuario podrá añadir, por medio de interfaz visual artículos nuevos y cantidades de estos. 
El usario podrá consultar la información almacenada en el diccionario referente 
a un articulo concreto e incluso listar toda la información en la terminal del programa
```
 - ##### Ejercicio 4
  ```
Combina los métodos generados en las actividades 2 y 3 creando una aplicación 
que gestione ventas y control de stock en una misma interfaz. 
Utiliza para ello las estructuras de datos que creas conveniente.
```


### 2. Organización del código
- src
	- default_package
		- Alumno.java
		- AuxMethod.java
		- Ejercicio1.java
		- Ejercicio2.java
		- Ejercicio3.java
		- MainApp.java
		- Venta.java
	- ejercicio4
		- Articulo.java
		- Cliente.java
		- Ejercicio4.java
		- Tienda.java
		- Venta.java


### 3. Documentación del código
 MainApp.java
----
 Clase encargada de generar un menú desplegable donde podemos elegir que ejercicio ejecutar.  
 ```java
 public static void main(String[] args) {
		AuxMethod.menu(4,"Selecciona un ejercicio de la UD7","UD7");
	}
 ```
   ![Captura](https://user-images.githubusercontent.com/22893383/107164512-a4cca380-69af-11eb-9e5a-e7c68575ec0e.PNG)

AuxMethod.java
---
Clase auxiliar. Contiene métodos para la interacción con el usuario y métodos de
validación de los datos. 

##### Métodos
```java
static void menu(int numEjercicios, String textoSeleccion, String textoTitulo)
```
```java
public static Object menuDesplegable(String [] opciones)
```
```java
private static String[] autoGenerarOpciones(int size)
```
```java
public static boolean esNumero(String strNum)
```
```java
public static String solicitarDatosString(String texto)
```
```java
public static int solicitarDatosInt(String texto)
```
```java
public static double solicitarDatosDouble(String texto)
```
```java
public static void mostrarInfo(String text)
```
```java
public static int darOpciones(String [] opciones)
```
```java
public static int darOpciones(String [] opciones, String textoOpciones)
```
Ejercicio 1: Ejercicio1.java y Alumno.java
---
#### Ejercicio1.java

##### Atributos
```java
static Hashtable<Integer,Alumno> dBNotas = new Hashtable<Integer,Alumno>()
```
##### Métodos
```java
static private void mostrarAlumnos()
```
```java
public static void main()
```
#### Alumno.java
##### Atributos
```java
private String nombreApellido
private int notas[]
private double notaMedia
```
##### Métodos
```java
public Alumno(String nombreApellido, int notas[])
```
```java
private double calcularMedia()
```
```java
private String notasToString()
```
```java
private String notaMediaToString()
```
```java
public String getNombreApellido()
```
```java
public void setNombreApellido(String nombreApellido)
```
```java
public int[] getNotas()
```
```java
public void setNotas(int[] notas)
```
```java
public void setOneNotas(int idx, int nota)
```
```java
public double getNotaMedia()
```
```java
public String toString()
```
Ejercicio 2: Ejercicio2.java y Venta.java
---
#### Ejercicio2.java
##### Atributos
```java
static ArrayList<Venta> ventas = new ArrayList<Venta>()
```
##### Métodos
```java
public static void main()
```
```java
static private void mostrarVentas()
```
```java
static private boolean pagoSuficiente(double pago,double iva, double precioBruto)
```

#### Venta.java
##### Atributos
```java
	private int cantArticulos
	private double iva
	private double precioBruto
	private double precioIVA
	private double pagado
	private double devolver
```
##### Métodos
```java
public Venta (int cantArticulos,double precioBruto,double pagado,double porcertanjeIVA)
```
```java
public double getprecioIVA()
```
```java
public double getIva()
```
```java
public int getCantArticulos()
```
```java
public double getPrecioBruto()
```
```java
public double getPagado()
```
```java
public double getDevolver() 
```
```java
public String toString()
```





Ejercicio 3: Ejercicio3.java
---
#### Ejercicio3.java
##### Atributos
```java
static Hashtable<String,Double> dBArticulos = new Hashtable<String,Double>() 
```
##### Métodos
```java
public static void main()
```
```java
static private void mostrarStock() 
```
```java
static private void cargarDB() 
```


Ejercicio 4: Ejercicio4.java, Cliente.java, Tienda.java, Articulo.java y Venta.java
---
#### Ejercicio4.java
##### Métodos
```java
private static Hashtable<String, Articulo> cargarDatosTest() 
```
```java
public static void main()
```
#### Cliente.java
##### Métodos
```java
private static String[] obtenerKeys(Hashtable<String, Articulo> stock)
```
```java
private static double costeCesta(Hashtable<String, Articulo> cesta )
```
```java
private static double solicitarPago(double costeCesta) 
```
```java
public static void comprar(Hashtable<String, Articulo> stock, ArrayList<Venta> ventas)
```
####  Tienda.java

##### Atributos
```java
public static ArrayList<Venta> ventas = new ArrayList<Venta>()
public static Hashtable<String, Articulo> stock = new Hashtable<String, Articulo>()
```
##### Métodos
```java
public Tienda(Hashtable<String, Articulo> stock)
```
```java
private static void mostrarStock()
```
```java
private static void mostrarVentas()
```
```java
private static double ivaElegido(int iva) 
```
```java
public void gestion()
```
```java
public ArrayList<Venta> getVentas()
```
```java
public Hashtable<String, Articulo> getStock() 
```
#### Articulo.java

##### Atributos
```java
private String nombre
private int cantidad
private double precio
private double iva
```
##### Métodos
```java
public Articulo(String nombre, int cantidad, double precio, double iva)
```
```java
public int retirarStock(int cantRetirada)
```
```java
public void agregarStock(int cantAgregada)
```
```java
public double factura()
```
```java
public String toString()
```
```java
public String getNombre()
```
```java
public int getCantidad()
```
```java
public double getPrecio() 
```
```java
public double getIva() 
```
#### Venta.java

##### Atributos
```java
private int idVenta
private double precioTotal
private double pagado
private double devolver
private Hashtable<String, Articulo> articulos
```
##### Métodos
```java
public Venta (Hashtable<String, Articulo> articulos, int cantArticulos ,double pagado, double precioTotal)
```
```java
public int getIdVenta()
```
```java
public double getPrecioTotal()
```
```java
public double getPagado()
```
```java
public double getDevolver()
```
```java
public Hashtable<String, Articulo> getArticulos() 
```
```java
public String toString()
```

### 4. Lista con los pasos mínimos que se necesitan para clonar exitosamente el proyecto y echarlo a andar en local.

```
IDE               Eclipse IDE Java Developers
Core              Java 
Framework         
DataBase          
Virtual           
SO                
```

###### Install
```
Eclipse    https://www.eclipse.org/downloads/packages/
```


