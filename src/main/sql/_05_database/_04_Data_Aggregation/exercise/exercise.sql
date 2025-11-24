-- =========================================
-- Task 01: Records’ Count
-- =========================================

SELECT count(*)
FROM wizzard_deposits;


-- =========================================
-- Task 02: Longest Magic Wand
-- =========================================

SELECT 
    MAX(magic_wand_size) AS longest_magic_wand
FROM
    wizzard_deposits;
    


-- =========================================
-- Task 03: Longest Magic Wand per Deposit Groups
-- =========================================

SELECT 
    deposit_group, MAX(magic_wand_size) AS 'longest_magic_wand'
FROM
    wizzard_deposits
GROUP BY deposit_group
ORDER BY `longest_magic_wand`,deposit_group
;


-- =========================================
-- Task 04: Smallest Deposit Group per Magic Wand Size
-- =========================================

SELECT 
    deposit_group
FROM
    wizzard_deposits
GROUP BY deposit_group
ORDER BY AVG(magic_wand_size)
LIMIT 1
;


-- =========================================
-- Task 05: Deposits Sum
-- =========================================

SELECT 
    deposit_group, SUM(deposit_amount) AS total
FROM
    wizzard_deposits
GROUP BY deposit_group
ORDER BY total

;


-- =========================================
-- Task 06: Deposits Sum for Ollivander Family
-- =========================================

SELECT 
    deposit_group, SUM(deposit_amount) AS total
FROM
    wizzard_deposits
WHERE
    magic_wand_creator = 'Ollivander family'
GROUP BY deposit_group
ORDER BY deposit_group

;


-- =========================================
-- Task 07: Deposits Filter
-- =========================================

SELECT 
    deposit_group, SUM(deposit_amount) AS total
FROM
    wizzard_deposits
WHERE
    magic_wand_creator = 'Ollivander family'
GROUP BY deposit_group
having total < 150000
ORDER BY total desc

;


-- =========================================
-- Task 08: Deposit Charge
-- =========================================

SELECT 
    deposit_group,magic_wand_creator, min(deposit_charge)
FROM
    wizzard_deposits
GROUP BY deposit_group,magic_wand_creator
order by magic_wand_creator,deposit_group
;


-- =========================================
-- Task 09: Age Groups
-- =========================================

SELECT 
    CASE
        WHEN age >= 0 AND age <= 10 THEN '[0-10]'
        WHEN age >= 11 AND age <= 20 THEN '[11-20]'
        WHEN age >= 21 AND age <= 30 THEN '[21-30]'
        WHEN age >= 31 AND age <= 40 THEN '[31-40]'
        WHEN age >= 41 AND age <= 50 THEN '[41-50]'
        WHEN age >= 51 AND age <= 60 THEN '[51-60]'
        WHEN age >= 61 THEN '[61+]'
    END AS age_group,
    COUNT(*)
FROM
    wizzard_deposits
GROUP BY age_group
  order by age_group
;


-- =========================================
-- Task 10: First Letter
-- =========================================

SELECT DISTINCT
left(first_name,1) letter
from wizzard_deposits
WHERE deposit_group = 'Troll Chest'
order by letter
;


-- =========================================
-- Task 11: Average Interest
-- =========================================

SELECT 
    deposit_group, is_deposit_expired, AVG(deposit_interest)
FROM
    wizzard_deposits
WHERE
    deposit_start_date > '1985-01-01'
GROUP BY deposit_group , is_deposit_expired
ORDER BY deposit_group DESC , is_deposit_expired ASC

;


-- =========================================
-- Task 12: Employees Minimum Salaries
-- =========================================

SELECT 
   department_id,  MIN(salary)
FROM
    employees
    WHERE department_id in (2,5,7) and hire_date>'2000-01-01'
group by department_id
;


-- =========================================
-- Task 13: Employees Average Salaries
-- =========================================

CREATE TABLE high_salary AS SELECT * FROM
    employees
WHERE
    salary > 30000
;
DELETE FROM high_salary 
WHERE
    manager_id = 42;
    UPDATE high_salary 
SET 
    salary = salary + 5000
WHERE
    department_id = 1;
    
SELECT 
    department_id, AVG(salary)
FROM
    high_salary
GROUP BY department_id
ORDER BY department_id
;


-- =========================================
-- Task 14: Employees Maximum Salaries
-- =========================================

SELECT department_id, max(salary) high
from employees
GROUP BY department_id
HAVING high < 30000 or high>70000
ORDER BY department_id;

-- =========================================
-- Task 15: Employees Count Salaries
-- =========================================

SELECT count(salary)
from employees
where manager_id is NULL;


-- =========================================
-- Task 16: 3rd Highest Salary
-- =========================================

SELECT *
FROM (
    SELECT
        department_id,
        (
            SELECT DISTINCT salary
            FROM employees e2
            WHERE e1.department_id = e2.department_id
              AND salary IS NOT NULL
            ORDER BY salary DESC
            LIMIT 1 OFFSET 2
        ) AS third
    FROM employees AS e1
    GROUP BY department_id
) AS t
WHERE third IS NOT NULL
ORDER BY department_id;

    

-- =========================================
-- Task 17: Salary Challenge
-- =========================================

SELECT first_name,last_name,department_id
FROM employees e1
WHERE salary>
(SELECT avg(salary)
FROM employees e2
WHERE e1.department_id = e2.department_id)
ORDER BY department_id,employee_id
limit 10;


-- =========================================
-- Task 18: Departments Total Salaries
-- =========================================

    SELECT department_id, sum(salary) as total
    from employees
    GROUP BY department_id
    ORDER BY department_id;
    
    
    