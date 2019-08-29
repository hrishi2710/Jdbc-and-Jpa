/*
create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);
*/


INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10001, 'Hrishi', 'Patna', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10002, 'Abhilash', 'Hyderabad', sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10003, 'Charlie', 'Bangalore', sysdate());
