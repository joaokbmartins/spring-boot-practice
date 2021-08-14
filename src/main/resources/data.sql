CREATE TABLE cars (
  id INT NOT NULL PRIMARY KEY,
  brand VARCHAR(255),
  model VARCHAR(255)
);

INSERT INTO cars
  (id, model, brand) 
VALUES 
  (1, 'a1', 'aaa1'),
  (2, 'a2', 'aaa2'),
  (3, 'a3', 'aaa3'),
  (4, 'a4', 'aaa4'),
  (5, 'a2', 'aaa5');