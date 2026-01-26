-- =========================================
-- Task 01: Create Tables
-- =========================================

CREATE TABLE `minions` (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT
);
CREATE TABLE `towns` (
    town_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL
);

-- =========================================
-- Task 02: Alter Minions Table
-- =========================================

ALTER TABLE `minions`
ADD COLUMN `town_id` INT,
ADD FOREIGN KEY (town_id) REFERENCES towns(id);

-- =========================================
-- Task 03: Insert Records in Both Tables
-- =========================================

INSERT INTO towns
VALUES (1,'Sofia'),(2,'Plovdiv'),(3,'Varna');

INSERT INTO minions
VALUES (1,'Kevin',22,1),(2,'Bob',15,3),(3,'Steward',NULL,2) ;

-- =========================================
-- Task 04: Truncate Table Minions
-- =========================================

TRUNCATE TABLE minions

-- =========================================
-- Task 05: Drop All Tables
-- =========================================

DROP TABLES towns,minions;

-- =========================================
-- Task 06: Create Table People
-- =========================================

CREATE TABLE `people`(
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(200) NOT NULL,
picture MEDIUMBLOB,
height DECIMAL(3,2),
weight DECIMAL(5,2),
gender ENUM('m','f') NOT NULL,
birthdate DATE NOT NULL,
biography LONGTEXT
);
INSERT INTO people(name,picture,height,weight,gender,birthdate,biography)
VALUES('Nick',NULL,1.94,122.11,'m','1989-05-06',NULL),
('Nick',NULL,1.94,122.11,'m','1989-5-6',NULL),
('Nick',NULL,1.94,122.11,'m','1989-5-6',NULL),
('Nick',NULL,1.94,122.11,'m','1989-05-6',NULL),
('Nick',NULL,1.94,122.11,'m','1989-5-6',NULL);

-- =========================================
-- Task 07: Create Table Users
-- =========================================

CREATE TABLE `users` (
    id BIGINT AUTO_INCREMENT UNIQUE PRIMARY KEY,
    username VARCHAR(30)CHAR SET ASCII UNIQUE NOT NULL,
    password VARCHAR(26)CHAR SET ASCII NOT NULL,
    profile_picture MEDIUMBLOB,
    last_login_time DATETIME,
    is_deleted BOOL
);
INSERT INTO users
VALUES(NULL,'Nick1','asd123',NULL,'2025-09-03 13:23:22', FALSE),
(NULL,'Nick2','asd123',NULL,'2025-09-03 13:23:22', FALSE),
(null,'Nick3','asd123',NULL,'2025-09-03 13:23:22', FALSE),
(null,'Nick4','asd123',NULL,'2025-09-03 13:23:22', FALSE),
(null,'Nick5','asd123',NULL,'2025-09-03 13:23:22', FALSE);

-- =========================================
-- Task 08: Change Primary Key
-- =========================================

ALTER TABLE users
DROP PRIMARY KEY,
add constraint pk_users primary key (id,username)

-- =========================================
-- Task 09: Set Default Value of a Field
-- =========================================

ALTER TABLE users
modify last_login_time datetime default now()


-- =========================================
-- Task 10: Set Unique Field
-- =========================================

ALTER TABLE users
MODIFY COLUMN id BIGINT;   

ALTER TABLE users
DROP PRIMARY KEY;

ALTER TABLE users
ADD CONSTRAINT pk_users
PRIMARY KEY (id, username);
ALTER TABLE users
MODIFY id BIGINT NOT NULL;
ALTER TABLE users
DROP PRIMARY KEY;
ALTER TABLE users
ADD CONSTRAINT pk_users PRIMARY KEY (id, username);
ALTER TABLE users
DROP PRIMARY KEY;

ALTER TABLE users
ADD CONSTRAINT pk_users PRIMARY KEY (id);

ALTER TABLE users
ADD CONSTRAINT uq_username UNIQUE (username);

-- =========================================
-- Task 11: Movies Database
-- =========================================

CREATE TABLE directors (
    id INT PRIMARY KEY AUTO_INCREMENT,
    director_name VARCHAR(100) NOT NULL,
    notes TEXT
);

CREATE TABLE genres (
    id INT PRIMARY KEY AUTO_INCREMENT,
    genre_name VARCHAR(50) NOT NULL,
    notes TEXT
);

CREATE TABLE categories (
    id INT PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(50) NOT NULL,
    notes TEXT
);

CREATE TABLE movies (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(150) NOT NULL,
    director_id INT,
    copyright_year YEAR,
    length INT,
    genre_id INT,
    category_id INT,
    rating DECIMAL(3,1),
    notes TEXT
);

INSERT INTO directors (director_name, notes) VALUES
('Christopher Nolan', 'notes'),
('Steven Spielberg', 'notes'),
('Martin Scorsese', 'notes'),
('Ridley Scott', 'notes'),
('James Cameron', 'notes');

INSERT INTO genres (genre_name, notes) VALUES
('Action', 'notes'),
('Drama', 'notes'),
('Comedy', 'notes'),
('Sci-Fi', 'notes'),
('Horror', 'notes');

INSERT INTO categories (category_name, notes) VALUES
('Feature Film', 'notes'),
('Short Film', 'notes'),
('Documentary', 'notes'),
('Animation', 'notes'),
('Series Episode', 'notes');

INSERT INTO movies (title, director_id, copyright_year, length, genre_id, category_id, rating, notes) VALUES
('Inception', 1, 2010, 148, 4, 1, 8.8, 'notes'),
('Jaws', 2, 1975, 124, 1, 1, 8.0, 'notes'),
('The Wolf of Wall Street', 3, 2013, 180, 2, 1, 8.2, 'notes'),
('Gladiator', 4, 2000, 171, 2, 1, 8.5, 'notes'),
('Avatar', 5, 2009, 162, 4, 1, 7.9, 'notes');


-- =========================================
-- Task 12: Car Rental Database
-- =========================================

CREATE TABLE categories (
    id INT PRIMARY KEY AUTO_INCREMENT,
    category VARCHAR(50) NOT NULL,
    daily_rate DECIMAL(10,2),
    weekly_rate DECIMAL(10,2),
    monthly_rate DECIMAL(10,2),
    weekend_rate DECIMAL(10,2)
);

CREATE TABLE cars (
    id INT PRIMARY KEY AUTO_INCREMENT,
    plate_number VARCHAR(20) NOT NULL,
    make VARCHAR(50) NOT NULL,
    model VARCHAR(50) NOT NULL,
    car_year YEAR,
    category_id INT,
    doors INT,
    picture BLOB,
    car_condition VARCHAR(50),
    available BOOLEAN
);

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    title VARCHAR(50),
    notes TEXT
);

CREATE TABLE customers (
    id INT PRIMARY KEY AUTO_INCREMENT,
    driver_licence_number VARCHAR(50) NOT NULL,
    full_name VARCHAR(100) NOT NULL,
    address VARCHAR(150),
    city VARCHAR(100),
    zip_code VARCHAR(20),
    notes TEXT
);

CREATE TABLE rental_orders (
    id INT PRIMARY KEY AUTO_INCREMENT,
    employee_id INT,
    customer_id INT,
    car_id INT,
    car_condition VARCHAR(50),
    tank_level VARCHAR(20),
    kilometrage_start INT,
    kilometrage_end INT,
    total_kilometrage INT,
    start_date DATE,
    end_date DATE,
    total_days INT,
    rate_applied DECIMAL(10,2),
    tax_rate DECIMAL(5,2),
    order_status VARCHAR(20),
    notes TEXT
);

INSERT INTO categories (category, daily_rate, weekly_rate, monthly_rate, weekend_rate) VALUES
('SUV', 50.00, 300.00, 1200.00, 120.00),
('Sedan', 40.00, 250.00, 1000.00, 100.00),
('Compact', 30.00, 180.00, 700.00, 80.00);

INSERT INTO cars (plate_number, make, model, car_year, category_id, doors, picture, car_condition, available) VALUES
('CA1234AB', 'Toyota', 'RAV4', 2020, 1, 5, NULL, 'Excellent', TRUE),
('PB5678CD', 'Honda', 'Civic', 2018, 2, 4, NULL, 'Good', TRUE),
('CT9012EF', 'Volkswagen', 'Polo', 2019, 3, 4, NULL, 'Fair', FALSE);

INSERT INTO employees (first_name, last_name, title, notes) VALUES
('John', 'Smith', 'Manager', 'Experienced'),
('Anna', 'Brown', 'Sales Agent', NULL),
('Peter', 'Johnson', 'Mechanic', 'Certified');

INSERT INTO customers (driver_licence_number, full_name, address, city, zip_code, notes) VALUES
('DL123456', 'Michael Green', '12 Maple St', 'Sofia', '1000', NULL),
('DL987654', 'Sarah Connor', '45 Oak Ave', 'Plovdiv', '4000', 'VIP'),
('DL555777', 'Ivan Ivanov', '78 Pine Blvd', 'Varna', '9000', NULL);

INSERT INTO rental_orders (
    employee_id, customer_id, car_id,
    car_condition, tank_level,
    kilometrage_start, kilometrage_end, total_kilometrage,
    start_date, end_date, total_days,
    rate_applied, tax_rate, order_status, notes
) VALUES
(1, 1, 1, 'Excellent', 'Full', 10000, 10200, 200, '2023-01-01', '2023-01-05', 4, 50.00, 20.00, 'Completed', NULL),
(2, 2, 2, 'Good', 'Half', 50000, 50150, 150, '2023-02-10', '2023-02-12', 2, 40.00, 20.00, 'Completed', 'Customer returned early'),
(3, 3, 3, 'Fair', 'Quarter', 30000, 30100, 100, '2023-03-01', '2023-03-03', 2, 30.00, 20.00, 'Pending', NULL);


-- =========================================
-- Task 13: Basic Insert
-- =========================================

INSERT INTO towns (name)
VALUES
('Sofia'),
('Plovdiv'),
('Varna'),
('Burgas');

INSERT INTO departments (name)
VALUES
('Engineering'),
('Sales'),
('Marketing'),
('Software Development'),
('Quality Assurance');

INSERT INTO employees (first_name, middle_name, last_name, job_title, department_id, hire_date, salary)
VALUES
('Ivan', 'Ivanov', 'Ivanov', '.NET Developer',
        (SELECT id FROM departments WHERE name = 'Software Development'),
        '2013-02-01',
        3500.00),
('Petar', 'Petrov', 'Petrov', 'Senior Engineer',
        (SELECT id FROM departments WHERE name = 'Engineering'),
        '2004-03-02',
        4000.00),
('Maria', 'Petrova', 'Ivanova', 'Intern',
        (SELECT id FROM departments WHERE name = 'Quality Assurance'),
        '2016-08-28',
        525.25),
('Georgi', 'Terziev', 'Ivanov', 'CEO',
        (SELECT id FROM departments WHERE name = 'Sales'),
        '2007-12-09',
        3000.00),
('Peter', 'Pan', 'Pan', 'Intern',
        (SELECT id FROM departments WHERE name = 'Marketing'),
        '2016-08-28',
        599.88);



-- =========================================
-- Task 14: Basic Select All Fields
-- =========================================

SELECT * FROM towns;
SELECT * FROM departments;
SELECT * FROM employees;


-- =========================================
-- Task 15: Basic Select All Fields and Order Them
-- =========================================

SELECT * FROM towns ORDER BY name;
SELECT * FROM departments ORDER BY name;
SELECT * FROM employees ORDER BY salary DESC;

-- =========================================
-- Task 16: Basic Select Some Fields
-- =========================================

SELECT name FROM towns ORDER BY name;
SELECT name FROM departments ORDER BY name;
SELECT  first_name, last_name, job_title, salary FROM employees ORDER BY salary DESC;

-- =========================================
-- Task 17: Increase Employees Salary
-- =========================================

UPDATE employees
SET salary = salary*1.1;
SELECT salary FROM employees;