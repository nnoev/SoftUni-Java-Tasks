-- ===============================================
-- 1. One-To-One Relationship
-- ===============================================

CREATE table passports (
passport_id int AUTO_INCREMENT PRIMARY KEY,
passport_number VARCHAR(10)
);
CREATE TABLE people (
    person_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    salary DECIMAL(10 , 5 ),
    passport_id int,
    CONSTRAINT FOREIGN KEY fk_people_passports (passport_id)
    REFERENCES passports(passport_id)
);
alter TABLE passports
add UNIQUE (passport_number);
alter TABLE people
add UNIQUE (passport_id),
modify column salary decimal(10,2);
DESCRIBE people;
INSERT INTO passports (passport_id, passport_number) VALUES
(101, 'N34FG21B'),
(102, 'K65LO4R7'),
(103, 'ZE657QP2');

-- Insert people
INSERT INTO people (person_id, first_name, salary, passport_id) VALUES
(1, 'Roberto', 43300.00, 102),
(2, 'Tom', 56100.00, 103),
(3, 'Yana', 60200.00, 101);



-- ===============================================
-- 2. One-To-Many Relationship
-- ===============================================

CREATE TABLE manufacturers (
    manufacturer_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(45) NOT NULL,
    established_on DATE NOT NULL
);
CREATE TABLE models (
    model_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(45) NOT NULL,
    manufacturer_id INT,
    FOREIGN KEY (manufacturer_id)
        REFERENCES manufacturers (manufacturer_id)
)  AUTO_INCREMENT=101;

INSERT into manufacturers (name, established_on)
VALUES ('BMW',  '1916-03-01'),
('Tesla', '2003-01-01'),
('Lada',  '1966-05-01');
INSERT INTO models (name,manufacturer_id)
VALUES('X1',	1),
('i6',	1),
('Model S',	2),
('Model X',	2),
('Model 3'	,2),
('Nova',	3);


-- ===============================================
-- 3. Many-To-Many Relationship
-- ===============================================

create table students (
student_id int AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(45) not NULL
);
create table exams(
exam_id int PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(45) not NULL
) AUTO_INCREMENT =101;
CREATE TABLE students_exams (
student_id int,
exam_id int,
PRIMARY KEY (student_id,exam_id),
FOREIGN KEY (student_id) REFERENCES students(student_id),
FOREIGN KEY (exam_id) REFERENCES exams(exam_id)
);
INSERT INTO students(name)
VALUES('Mila'),
('Toni'),
('Ron');
INSERT into exams(name)
VALUES ('Spring MVC'),
('Neo4j'),
('Oracle 11g');
-- Assign students to exams
INSERT INTO students_exams (student_id, exam_id) VALUES
(1, 101),  
(1, 102), 
(2, 101),
(2,102), 
(2, 103), 
(3, 103);


-- ===============================================
-- 4. Self-Referencing
-- ===============================================

create TABLE teachers (
teacher_id int PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(45) not NULL,
manager_id int,
FOREIGN KEY (manager_id) REFERENCES teachers(teacher_id)
)AUTO_INCREMENT=101;
SET FOREIGN_KEY_CHECKS = 0;
INSERT INTO teachers (name, manager_id) VALUES
('John', NULL),
( 'Maya', 106),
( 'Silvia', 106),
( 'Ted', 105),
( 'Mark', 101),
( 'Greta', 101);

-- ===============================================
-- 5. Online Store Database
-- ===============================================

CREATE TABLE item_types (
    item_type_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50)
);
CREATE TABLE items (
    item_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    item_type_id int,
    FOREIGN KEY (item_type_id) REFERENCES item_types(item_type_id)
);
CREATE TABLE cities (
    city_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50)
);
CREATE TABLE customers (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    birthday DATE,
    city_id INT,
    FOREIGN KEY (city_id)
        REFERENCES cities (city_id)
);
CREATE TABLE orders (
    order_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id INT,
    FOREIGN KEY (customer_id)
        REFERENCES customers (customer_id)
);
CREATE TABLE order_items (
    order_id INT,
    item_id int,
    PRIMARY KEY(order_id,item_id),
    FOREIGN KEY (order_id)REFERENCES orders(order_id),
        FOREIGN KEY (item_id)REFERENCES items(item_id)
);


-- ===============================================
-- 6. University Database
-- ===============================================

CREATE TABLE subjects (
    subject_id INT PRIMARY KEY AUTO_INCREMENT,
    subject_name VARCHAR(50)
);
CREATE TABLE majors (
    major_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50)
);
create table students(
student_id int PRIMARY KEY AUTO_INCREMENT,
student_number VARCHAR(12),
student_name VARCHAR(50),
major_id int,
FOREIGN KEY (major_id) REFERENCES majors(major_id)
);
CREATE TABLE agenda(
student_id int,
subject_id int,
PRIMARY KEY(student_id,subject_id),
FOREIGN KEY (student_id) REFERENCES students(student_id),
FOREIGN KEY (subject_id) REFERENCES subjects(subject_id)
);
create table payments (
payment_id int PRIMARY KEY AUTO_INCREMENT,
payment_date DATE,
payment_amount DECIMAL(8,2),
student_id int,
FOREIGN KEY (student_id) REFERENCES students(student_id)
);


-- ===============================================
-- 9. Peaks in Rila
-- ===============================================

SELECT 
    mountains.mountain_range,peaks.peak_name,peaks.elevation
FROM mountains
JOIN peaks ON mountains.id = peaks.mountain_id
WHERE mountains.id = 17
ORDER BY peaks.elevation DESC
;