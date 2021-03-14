DROP DATABASE IF EXISTS grandesAlmacenes;
CREATE DATABASE grandesAlmacenes;
USE grandesAlmacenes;

CREATE TABLE producto(
	codigo INT UNIQUE AUTO_INCREMENT,
    nombre VARCHAR(100),
    precio INT,
    PRIMARY KEY (codigo)
) ENGINE = InnoDB;

CREATE TABLE cajero(
	codigo INT UNIQUE AUTO_INCREMENT,
	nomapels VARCHAR(255),
    PRIMARY KEY (codigo)
) ENGINE = InnoDB;

CREATE TABLE maquinaregistradora(
	codigo INT UNIQUE AUTO_INCREMENT,
	piso INT,
    PRIMARY KEY (codigo) 
) ENGINE = InnoDB;


CREATE TABLE venta(
	id INT AUTO_INCREMENT,
	producto_id INT UNIQUE ,
    cajero_id INT UNIQUE ,
    maquinaregistradora_id INT UNIQUE ,
    PRIMARY KEY (id,producto_id,cajero_id,maquinaregistradora_id),
    CONSTRAINT producto_id FOREIGN KEY (producto_id)
	REFERENCES producto(codigo)
		ON DELETE CASCADE
        ON UPDATE CASCADE,
	
    CONSTRAINT cajero_id FOREIGN KEY (cajero_id)
	REFERENCES cajero(codigo)
		ON DELETE CASCADE
        ON UPDATE CASCADE,
        
	CONSTRAINT maquinaregistradora_id FOREIGN KEY (maquinaregistradora_id)
	REFERENCES maquinaregistradora(codigo)
		ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE = InnoDB;

INSERT INTO cajero(nomapels) VALUES
	("Geralt of Rivia"),
    ("Yennefer of Vengerberg"),
    ("Cirilla"),
    ("Jaskier"),
    ("Frodo Baggins"),
    ("Aragorn"),
    ("Éowyn"),
    ("Faramir"),
    ("Samsagaz Gamyi"),
    ("Gollum");
    
INSERT INTO producto(precio,nombre) VALUES
	(79,"Llave inglesa"),
    (10,"Llave española"),
    (83,"Pico de oro"),
    (38,"Tornillo"),
    (40,"Escuadra"),
    (63,"Tuerca"),
    (33,"Arandela"),
    (59,"Goma"),
    (9,"Remache"),
    (95,"Punta");

INSERT INTO maquinaregistradora(piso) VALUES
	(1),
    (2),
    (3),
    (4),
    (5),
    (6),
    (7),
    (8),
    (9),
    (10);


INSERT INTO venta(producto_id,
	cajero_id,
	maquinaregistradora_id) VALUES
    (1,1,1),
    (2,2,2),
    (3,3,3),
    (4,4,4),
    (5,5,5),
    (6,6,6),
    (7,7,7),
    (8,8,8),
    (9,9,9),
    (10,10,10);