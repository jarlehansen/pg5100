CREATE TABLE person (id INT NOT NULL, name VARCHAR, PRIMARY KEY (id));
CREATE TABLE account (id INT NOT NULL, type VARCHAR, p_id INT NOT NULL, PRIMARY KEY (id), CONSTRAINT FK_Person FOREIGN KEY (p_id) REFERENCES person(id));
CREATE TABLE subscription (id INT NOT NULL, type VARCHAR, a_id INT NOT NULL, PRIMARY KEY (id), CONSTRAINT FK_Account FOREIGN KEY (a_id) REFERENCES account(id));

INSERT INTO person (id, name) VALUES (1, 'James Gosling');
INSERT INTO account (id, type, p_id) VALUES (1, 'PRIVATE', 1);
INSERT INTO subscription (id, type, a_id) VALUES(1, 'Small', 1);
INSERT INTO subscription (id, type, a_id) VALUES(2, 'Medium', 1);

INSERT INTO account (id, type, p_id) VALUES (2, 'BUSINESS', 1);
INSERT INTO subscription (id, type, a_id) VALUES(3, 'Large', 2);
INSERT INTO subscription (id, type, a_id) VALUES(4, 'Extra Large', 2);