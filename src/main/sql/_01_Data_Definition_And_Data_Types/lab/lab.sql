-- =========================================
-- Task 01: Create Tables
-- =========================================

CREATE TABLE `employees`(
`id` INT NOT NULL AUTO_INCREMENT,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
PRIMARY KEY(id) 
);
CREATE TABLE `categories`(
`id` INT auto_increment,
`name` varchar(50) not null,
primary key(id)
);
CREATE TABLE `products`(
`id` INT auto_increment,
`name` varchar(50) not null,
`category_id` int not null,
primary key(id)
);



-- =========================================
-- Task 02: Insert Data in Tables
-- =========================================

INSERT INTO employees(first_name, last_name)
VALUES ('Gosho','Last'),
 ('Gosho','Last'),
  ('Gosho','Last');


-- =========================================
-- Task 03: Alter Tables
-- =========================================

 ALTER TABLE employees
  ADD COLUMN `middle_name` VARCHAR(50); 



-- =========================================
-- Task 04: Modifying Columns
-- =========================================

-ALTER TABLE `employees`
MODIFY COLUMN `middle_name` VARCHAR(100)
