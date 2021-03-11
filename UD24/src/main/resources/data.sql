
DROP table IF EXISTS trabajador;

create table trabajador(
	id int auto_increment,
	nomApel varchar(250),
	trabajo varchar(250),
	salario decimal(10,2)
);

insert into trabajador (nomApel,trabajo,salario) values ('Jose Marin','formador',2000);
insert into trabajador (nomApel,trabajo,salario) values ('Miguel','ingeniero',3000);
insert into trabajador (nomApel,trabajo,salario) values ('Angel','Analista',5000.57);


