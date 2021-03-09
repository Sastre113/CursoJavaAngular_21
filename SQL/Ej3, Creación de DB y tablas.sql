DROP DATABASE IF EXISTS PatronMVC_Ejercicio3;
CREATE DATABASE PatronMVC_Ejercicio3;
USE PatronMVC_Ejercicio3;

CREATE TABLE Cientificos(
	dni VARCHAR(8) UNIQUE,
    nomapels VARCHAR(255),
    PRIMARY KEY (dni)
) ENGINE = InnoDB;

CREATE TABLE Proyectos(
	id CHAR(4) UNIQUE,
	nombre VARCHAR(255),
    horas INT,
    PRIMARY KEY (id)
) ENGINE = InnoDB;


CREATE TABLE Asignado_A(
    FK_dni_Cientificos VARCHAR(8) UNIQUE,
    FK_id_Proyecto CHAR(4) UNIQUE,
    PRIMARY KEY (FK_dni_Cientificos,FK_id_Proyecto),
    CONSTRAINT FK_dni_Cientificos FOREIGN KEY (FK_dni_Cientificos)
	REFERENCES Cientificos(dni)
		ON DELETE CASCADE
        ON UPDATE CASCADE,
        
	CONSTRAINT FK_id_Proyecto FOREIGN KEY (FK_id_Proyecto)
	REFERENCES Proyectos(id)
		ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE = InnoDB;


