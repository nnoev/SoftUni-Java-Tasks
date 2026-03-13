-- =========================================
-- Task 01: Count Employees by Town
-- =========================================
delimiter $$
CREATE FUNCTION ufn_count_employees_by_town(town_name VARCHAR(50))
RETURNS INT
NOT DETERMINISTIC
READS SQL DATA
BEGIN
	DECLARE result INT;
	SET result :=  (SELECT COUNT(e.employee_id)
	FROM employees e
	JOIN addresses a ON e.address_id = a.address_id
	JOIN towns t ON a.town_id = t.town_id
	WHERE t.name = town_name);
    RETURN result;
END$$
delimiter ;

-- =========================================
-- Task 02: Employees Promotion
-- =========================================
DELIMITER $$
CREATE PROCEDURE usp_raise_salaries(department_name VARCHAR(50))
BEGIN
	UPDATE employees
    SET salary = salary*1.05
    WHERE department_id = (
    SELECT department_id FROM departments WHERE name = department_name
    );
END$$
DELIMITER ;

-- =========================================
-- Task 03: Employees Promotion By ID
-- =========================================
delimiter $$
CREATE PROCEDURE usp_raise_salary_by_id(id INT)
BEGIN
DECLARE cnt INT;
START TRANSACTION;
SET cnt := (SELECT COUNT(*) FROM employees e WHERE e.employee_id = id);
UPDATE employees e
SET salary = salary*1.05
WHERE e.employee_id = id;
IF cnt = 1 THEN
COMMIT;
ELSE
ROLLBACK;
END IF;
END$$
delimiter ;

-- =========================================
-- Task 04: Triggered
-- =========================================
CREATE TABLE deleted_employees (
    employee_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    middle_name VARCHAR(50),
    job_title VARCHAR(50),
    department_id INT,
    salary DECIMAL(10 , 2 )
);
delimiter $$
CREATE TRIGGER trg_deleted_emp
AFTER DELETE
ON employees FOR EACH ROW
BEGIN
INSERT INTO deleted_employees(first_name,last_name,middle_name,job_title,department_id,salary)
VALUES(OLD.first_name,OLD.last_name,OLD.middle_name,OLD.job_title,OLD.department_id,OLD.salary);
END$$
delimiter ;
