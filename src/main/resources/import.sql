-- You can use this file to load seed data into the database using SQL statements
insert into STATE (name) values ('Salta');
insert into STATE (name) values ('Córdoba');

insert into USER (name, last_name, email) values ('Jose Maria', 'Quiroga', 'jmquiroga@hotmail.com');

insert into ADDRESS (address_type, number, street, state_id, user_id) values (3, 2015, 'Independencia', 2, 1);

INSERT INTO MOVIE(GENRE,SYNOPSIS,TITLE,YEAR)VALUES(5,"Los heroes mas famosos de marvel combaten contra el mal.","Los Vengadores",2015);

INSERT INTO MOVIE(GENRE,SYNOPSIS,TITLE,YEAR)VALUES(2,"Una adaptacion de la obra de Sir Arthur Conan Doyle llega a la gran pantalla.","Sherlock",2013);

INSERT INTO MOVIE(GENRE,SYNOPSIS,TITLE,YEAR)VALUES(0,"El gran misterio va a ser revelado. O lo hara?","Slender",2014);

INSERT INTO MOVIE(GENRE,SYNOPSIS,TITLE,YEAR)VALUES(1,"De las mejores obras de Charlie Chaplin.","El Gran Dictador",1933);

INSERT INTO MEMBER(DNI,EMAIL,LAST_NAME,NAME)VALUES("0000001","test123@prueba.com","Parma","Miguel");

INSERT INTO MEMBER(DNI,EMAIL,LAST_NAME,NAME)VALUES("l33tsp34k","IlovetoTest@hotmail.com","de Diego","Diego");

INSERT INTO MEMBER(DNI,EMAIL,LAST_NAME,NAME)VALUES("1111111","Iam_TEST@gmail.com","Ivanovich","Ivan Ivanov");

INSERT INTO MEMBER(DNI,EMAIL,LAST_NAME,NAME)VALUES("A154b82","Testificar@home.net","Perez","Juan");

