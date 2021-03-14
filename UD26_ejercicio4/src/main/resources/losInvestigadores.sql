DROP DATABASE IF EXISTS losInvestigador;
CREATE DATABASE losInvestigador;
USE losInvestigador;

CREATE TABLE facultad(
	codigo INT,
    nombre VARCHAR(100),
    PRIMARY KEY (codigo)
) ENGINE = InnoDB;

CREATE TABLE investigador(
	dni VARCHAR(8),
	nomapels VARCHAR(255),
    investigador_facultad_id INT ,
    PRIMARY KEY (dni),
	CONSTRAINT investigador_facultad_id FOREIGN KEY (investigador_facultad_id)
	REFERENCES facultad(codigo)
		ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE = InnoDB;

CREATE TABLE equipo(
	numserie CHAR(4),
	nombre VARCHAR(100),
	facultad_id INT ,
    PRIMARY KEY (numserie),
    CONSTRAINT facultad_id FOREIGN KEY (facultad_id)
	REFERENCES facultad(codigo)
		ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE = InnoDB;


CREATE TABLE reserva(
	id INT AUTO_INCREMENT,
	comienzo DATETIME,
    fin DATETIME,
	investigador_id VARCHAR(8) UNIQUE ,
    equipo_id CHAR(4) UNIQUE,
    PRIMARY KEY (id,investigador_id,equipo_id),
    CONSTRAINT investigador_id FOREIGN KEY (investigador_id)
	REFERENCES investigador(dni)
		ON DELETE CASCADE
        ON UPDATE CASCADE,
	
    CONSTRAINT equipo_id FOREIGN KEY (equipo_id)
	REFERENCES equipo(numserie)
		ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE = InnoDB;


INSERT INTO facultad(codigo,nombre) VALUES
	(1,"facultad 1"),
    (2,"facultad 2"),
    (3,"facultad 3"),
    (4,"facultad 4"),
    (5,"facultad 5"),
    (6,"facultad 6"),
    (7,"facultad 7"),
    (8,"facultad 8"),
    (9,"facultad 9"),
    (10,"facultad 10");


INSERT INTO investigador(dni, nomapels,investigador_facultad_id) VALUES
	('79033066',"Gordon Freeman",1),
    ('10284470',"G-Man",2),
    ('83225367',"Albert Einstein",3),
    ('38444048',"Isaac Newton",4),
    ('40219395',"Stephen Hawking",5),
    ('63773951',"Marie Curie",6),
    ('79260594',"Charles Darwin",7),
    ('59519298',"Louis Pasteur ",8),
    ('09639281',"Gregor Mendel ",9),
    ('95752090',"Arquímedes de Siracusa",10);

INSERT INTO equipo(numserie,nombre,facultad_id) VALUES
	('100',"Team 1",1),
    ('200',"Team 2",2),
    ('300',"Team 3",3),
    ('400',"Team 4",4),
    ('500',"Team 5",5),
    ('600',"Team 6",6),
    ('700',"Team 7",7),
    ('800',"Team 8",8),
    ('900',"Team 9",9),
    ('1000',"Team 10",10);
    

INSERT INTO reserva(investigador_id,equipo_id, comienzo, fin) VALUES
	('79033066', '100', "2001-01-1","2001-03-30"),
   	('10284470', '200',"2002-01-1","2002-03-30"),	
    ('83225367', '300',"2003-01-1","2003-03-30"),
	('38444048', '400',"2004-01-1","2004-03-30"),
	('40219395', '500',"2005-01-1","2005-03-30"),
	('63773951', '600',"2006-01-1","2006-03-30"),
	('79260594', '700',"2007-01-1","2007-03-30"),
	('59519298', '800',"2008-01-1","2008-03-30"),
	('09639281', '900',"2009-01-1","2009-03-30"),
	('95752090', '1000',"2010-01-1","2010-03-30");
