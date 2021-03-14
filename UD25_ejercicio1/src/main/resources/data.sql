DROP table IF EXISTS articulo;
DROP table IF EXISTS fabricante;


CREATE TABLE fabricante(
	codigo INT AUTO_INCREMENT ,
    nombre VARCHAR(100),
	PRIMARY KEY (codigo)
);


CREATE TABLE articulo(
	codigo INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    precio INT,
    fabricante_id INT NULL, 
    PRIMARY KEY(codigo) ,
	CONSTRAINT fabricante_id FOREIGN KEY (fabricante_id)
		REFERENCES fabricante(codigo)
		ON DELETE CASCADE
        ON UPDATE CASCADE
);

INSERT INTO fabricante(NOMBRE) 
VALUES ('NVIDIA'),
		('AMD'),
	    ('INTEL'),
	    ('ASUS'),
	    ('MSI'),
	    ('GIGABYTE'),
	    ('CORSAIR'),
	    ('ACER'),
	    ('NOX'),
	    ('RAZER');
    
INSERT INTO articulo (NOMBRE,PRECIO,fabricante_id) 
VALUES ('RTX 2060',375,1),
		('RTX 2070',600,1),
	    ('RX 480',300,2),
	    ('VOX URANO',65,9),
	    ('ROG POWER',180,4),
	    ('K68',150,7),
	    ('KRAKEN',80,10),
	    ('SWIFT 6',457,7),
	    ('DISIPADOR',45,5),
	    ('RTX 3080',900,6);