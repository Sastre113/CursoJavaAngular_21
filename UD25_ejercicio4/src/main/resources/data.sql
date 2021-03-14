DROP table IF EXISTS sala;
DROP table IF EXISTS pelicula;


CREATE TABLE pelicula(
	codigo INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    calificacionEdad INT,
    PRIMARY KEY (codigo)
);

CREATE TABLE sala(
	codigo INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    pelicula_id INT, 
    PRIMARY KEY (codigo),
    CONSTRAINT pelicula_id FOREIGN KEY (pelicula_id)
	REFERENCES pelicula(codigo)
		ON DELETE CASCADE
        ON UPDATE CASCADE
);

INSERT INTO pelicula(nombre,calificacionedad) 
VALUES ('La comunidad del anillo', 7),
	    ('La dos torres', 7),
	    ('El retorno del rey', 7),
	    ('Mad Max', 16),
	    ('La torre oscura', 16),
	    ('La cabaña del bosque', 16),
	    ('12 Angry Men',16),
	    ('Metropolis',7),
	    ('Watchmen',13),
	    ('Wall-e',7);
    
INSERT INTO sala(nombre,pelicula_id) 
VALUES ('Valporquero',1),
	    ('Altamira ',2),
	    ('Drach',3),
	    ('Jameos del Agua',4),
	    ('Nerja',5),
	    ('La mora',6),
	    ('Maravillas',1),
	    ('Sant Josep',1),
	    ('Enebralejos',3),
	    ('Cerro del Águila',7);