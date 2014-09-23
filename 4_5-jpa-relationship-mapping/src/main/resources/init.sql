-- One to one
INSERT INTO Address (id, street, zip) VALUES(1, 'Testveien 1', '0185');
INSERT INTO Customer (id, firstname, lastname, FK_Address) VALUES(1, 'Ola', 'Nordmann', 1);


-- One to many
INSERT INTO MyOrder (id, creationdate) VALUES(1, sysdate);

INSERT INTO OrderLine (id, item, unitprice, quantity) VALUES(1, 'Book', 499, 5);
INSERT INTO OrderLine (id, item, unitprice, quantity) VALUES(2, 'Telephone', 1499, 1);

INSERT INTO OrderToOrderLine (MyOrder_id, ORDERLINES_ID) VALUES(1, 1);
INSERT INTO OrderToOrderLine (MyOrder_id, ORDERLINES_ID) VALUES(1, 2);


-- Many to many
INSERT INTO Course (id, title) VALUES (123, 'PG5100');

INSERT INTO Student (id, name) VALUES (321, 'Per');

INSERT INTO Student_courses (fk_course, fk_student) values (123, 321);