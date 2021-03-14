DROP DATABASE IF EXISTS loscientificos;
CREATE DATABASE loscientificos;
USE loscientificos;

CREATE TABLE cientifico(
	dni VARCHAR(8) UNIQUE,
    nomapel VARCHAR(255),
    PRIMARY KEY (dni)
) ENGINE = InnoDB;

CREATE TABLE proyecto(
	id CHAR(4) UNIQUE,
	nombre VARCHAR(255),
    horas INT,
    PRIMARY KEY (id)
) ENGINE = InnoDB;


CREATE TABLE asignadoa(
	id INT AUTO_INCREMENT,
    cientifico_id VARCHAR(8) UNIQUE,
    proyecto_id CHAR(4) UNIQUE,
    PRIMARY KEY (id,cientifico_id,proyecto_id),
    CONSTRAINT cientifico_id FOREIGN KEY (cientifico_id)
	REFERENCES cientifico(dni)
		ON DELETE CASCADE
        ON UPDATE CASCADE,
        
	CONSTRAINT proyecto_id FOREIGN KEY (proyecto_id)
	REFERENCES proyecto(id)
		ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE = InnoDB;

INSERT INTO cientifico(dni,nomapel) VALUES
	('79033066',"Gordon Freeman"),
    ('10284470',"G-Man"),
    ('83225367',"Albert Einstein"),
    ('38444048',"Isaac Newton"),
    ('40219395',"Stephen Hawking"),
    ('63773951',"Marie Curie"),
    ('79260594',"Charles Darwin"),
    ('59519298',"Louis Pasteur "),
    ('09639281',"Gregor Mendel "),
    ('95752090',"Arquímedes de Siracusa");
    
INSERT INTO proyecto(id,nombre,horas) VALUES
	('1',"Manhattan",5),
    ('2',"Destruir el mundo",10),
    ('3',"Salvar al mundo",20),
    ('4',"Utopia",270),
    ('5',"eCola",300),
    ('6',"Sin Alimentos",30),
    ('7',"Salud mental",50),
    ('8',"Fin de curso",10),
    ('9',"Jangular",20),
    ('10',"Ticket free",10);
    
INSERT INTO asignadoa(cientifico_id,proyecto_id) VALUES
	('83225367','1'),
    ('10284470','2'),
    ('79033066','3'),
    ('38444048','4'),
    ('40219395','5'),
    ('63773951','6'),
    ('79260594','7'),
    ('59519298','8'),
    ('09639281','9'),
    ('95752090','10');


