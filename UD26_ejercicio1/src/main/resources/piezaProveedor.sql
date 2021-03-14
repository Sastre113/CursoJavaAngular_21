DROP table IF EXISTS suministra;
DROP table IF EXISTS proveedor;
DROP table IF EXISTS pieza;

CREATE TABLE pieza(
	codigo INT AUTO_INCREMENT ,
    nombre VARCHAR(100),
    PRIMARY KEY (codigo)
);

CREATE TABLE proveedor(
	id CHAR(4),
	nombre VARCHAR(100),
    PRIMARY KEY (id)
);


CREATE TABLE suministra(
	id INT AUTO_INCREMENT ,
	precio INT ,
    pieza_id INT,
    proveedor_id CHAR(4),
    PRIMARY KEY (id,pieza_id,proveedor_id),
    
    CONSTRAINT pieza_id FOREIGN KEY (pieza_id)
	REFERENCES pieza(codigo)
		ON DELETE CASCADE
        ON UPDATE CASCADE,
        
	CONSTRAINT proveedor_id FOREIGN KEY (proveedor_id)
	REFERENCES proveedor(id)
		ON DELETE CASCADE
        ON UPDATE CASCADE
);

INSERT INTO pieza(nombre) 
VALUES ('Tuerca'),
		('Tornillo'),
		('Punta'),
		('Arandela'),
		('Valvula');

INSERT INTO proveedor(id,nombre) 
VALUES ('4Tue','LasTuercas'),
		('PePe','FerreteríaPepe'),
		('GaDa','Gandalf El Blanco'),
		('S.Hw','SuperFerreteria'),
		('6Ho9','Valvula caliente');

INSERT INTO suministra(pieza_id,proveedor_id,precio) 
VALUES (1,'PePe',20),
		(2,'GaDa',20),
		(2,'S.Hw',20),
		(4,'S.Hw',20),
		(5,'6Ho9',20);

