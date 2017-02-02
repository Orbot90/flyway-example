CREATE TABLE COUNTRIES (
    ID int primary key,
    NAME varchar(100) not null
);

ALTER TABLE CITIES ADD COLUMN COUNTRY_ID int;
ALTER TABLE CITIES ADD FOREIGN KEY (COUNTRY_ID) REFERENCES COUNTRIES(ID);

INSERT INTO COUNTRIES (ID, NAME) VALUES (1, 'Russian Federation');
INSERT INTO COUNTRIES (ID, NAME) VALUES (2, 'USA');
INSERT INTO COUNTRIES (ID, NAME) VALUES (3, 'Kazakhstan');

UPDATE CITIES SET COUNTRY_ID = 1 WHERE ID <= 3;