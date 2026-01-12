-- ===============================================
-- 1. Managers
-- ===============================================

SELECT employee_id,concat(first_name,' ',last_name)as name , d.department_id , d.name
FROM employees e
JOIN departments d on e.employee_id=d.manager_id
ORDER BY employee_id
limit 5;

-- ===============================================
-- 2. Towns and Addresses
-- ===============================================

SELECT t.town_id,t.name , a.address_text from towns t
JOIN addresses a on t.town_id=a.town_id and t.name in ('San Francisco', 'Sofia', 'Carnation')
ORDER BY t.town_id , a.address_id
;

-- ===============================================
-- 3. Employees Without Managers
-- ===============================================

select  employee_id, first_name, last_name, department_id ,salary
from employees
WHERE manager_id is null  

-- ===============================================
-- 4. High Salary
-- ===============================================

select  count(*)
from employees
WHERE salary > (select avg(salary) from employees)  