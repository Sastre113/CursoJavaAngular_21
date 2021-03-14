DROP table IF EXISTS caja;
DROP table IF EXISTS almacen;


CREATE TABLE almacen(
	codigo INT AUTO_INCREMENT,
    Lugar VARCHAR(100),
    capacidad INT,
    PRIMARY KEY (codigo)
);

CREATE TABLE caja(
	numreferencia CHAR(5),
    contenido VARCHAR(100),
	valor INT,
    almacen_id INT NULL, 
    PRIMARY KEY (numreferencia),
    CONSTRAINT almacen_id FOREIGN KEY (almacen_id)
	REFERENCES almacen(codigo)
		ON DELETE CASCADE
        ON UPDATE CASCADE
);

INSERT INTO almacen(lugar,capacidad) VALUES
	('Black Mesa', 10),
    ('Aperture Science', 15),
	('Wasterlands', 5),
	('Screw',7),
    ('Nostromos',6),
    ('UNSC', 3),
    ('PELICAN', 5),
    ('MJOLNIR',4),
    ('ANDURIL',10),
    ('FROSTMOURE',12);
    
INSERT INTO caja(numreferencia,contenido,valor,almacen_id) VALUES
	('GAWYB','Tijeras',50,2),
	('35YET','Piedras',150,5),
    ('A56GH','Papel',20,7),
    ('QM773','Tijeras',70,8),
    ('XYK3S','Piedras',100,3),
    ('V2P32','Tijeras',200,2),
    ('LVB3F','Piedras',300,7),
    ('HXAMM','Papel',150,9),
    ('AEQXZ','Tijeras',113,6),
    ('L65X5','Papel',60,10);