-- =========================================
-- Task 01: Employee Address
-- =========================================

SELECT  e.employee_id, e.job_title,a.address_id,a.address_text
FROM employees e
JOIN addresses a
ON e.address_id=a.address_id
ORDER BY address_id
LIMIT 5
;

-- =========================================
-- Task 02: Addresses with Towns
-- =========================================

SELECT first_name, last_name, t.name , a.address_text
FROM employees e
JOIN addresses a
ON e.address_id=a.address_id
JOIN towns t
on a.town_id = t.town_id
ORDER BY e.first_name, e.last_name
LIMIT 5
;

-- =========================================
-- Task 03: Sales Employee
-- =========================================

SELECT e.employee_id, first_name, last_name, d.name
FROM employees e
JOIN departments d
on e.department_id=d.department_id
WHERE d.name="Sales"
order BY e.employee_id DESC;



-- =========================================
-- Task 04: Employee Departments
-- =========================================

SELECT e.employee_id, first_name, salary, d.name
FROM employees e
JOIN departments d
on e.department_id=d.department_id
WHERE salary>15000
order BY e.department_id DESC,employee_id
LIMIT 5
;


-- =========================================
-- Task 05: Employees Without Project
-- =========================================

SELECT e.employee_id,first_name
FROM employees e
left JOIN employees_projects ep
on	e.employee_id=ep.employee_id
WHERE project_id is NULL
ORDER BY e.employee_id DESC
LIMIT 3
;
-- =========================================
-- Task 06: Employees Hired After
-- =========================================

SELECT first_name, last_name,hire_date,d.name
FROM employees e
JOIN departments d
on e.department_id=d.department_id
WHERE hire_date > '1999-1-1' AND (d.name='Sales' OR d.name='Finance')
ORDER BY hire_date
;

-- =========================================
-- Task 07: Employees with Project
-- =========================================

SELECT e.employee_id,e.first_name,p.name
FROM employees e
JOIN employees_projects ep
ON e.employee_id=ep.employee_id
JOIN projects p
on ep.project_id=p.project_id
WHERE p.start_date >='2002-08-14' AND p.end_date is NULL
ORDER BY e.first_name ASC,p.name ASC
LIMIT 5
;

-- =========================================
-- Task 08: Employee 24
-- =========================================

SELECT e.employee_id,e.first_name,
CASE
 WHEN p.start_date >='2005-1-1'
 THEN NULL
 ELSE p.name
 END project
FROM employees e
JOIN employees_projects ep
ON e.employee_id=ep.employee_id
JOIN projects p
on ep.project_id=p.project_id
WHERE e.employee_id = 24
ORDER BY project
LIMIT 5
;

-- =========================================
-- Task 09: Employee Manager
-- =========================================

SELECT e.employee_id,e.first_name,m.employee_id,m.first_name
FROM employees e
JOIN employees m
ON e.manager_id = m.employee_id
WHERE m.employee_id in (3,7)
ORDER BY	e.first_name
;

-- =========================================
-- Task 10: Employee Summary
-- =========================================

SELECT e.employee_id,concat(e.first_name,' ',e.last_name),concat(m.first_name,' ',m.last_name) ,d.name
FROM employees e
JOIN employees m
ON e.manager_id = m.employee_id
JOIN departments d
ON e.department_id=d.department_id
ORDER BY	e.employee_id
LIMIT 5
;

-- =========================================
-- Task 11: Min Average Salary
-- =========================================

SELECT avg(salary) a
FROM employees
GROUP BY department_id
ORDER BY a
LIMIT 1
;


-- =========================================
-- Task 12: Highest Peaks in Bulgaria
-- =========================================

	SELECT c.country_code,m.mountain_range,p.peak_name,p.elevation
    FROM countries c
    JOIN mountains_countries mc
    on c.country_code = mc.country_code
    JOIN mountains m
    on mc.mountain_id = m.id
    JOIN peaks p
    on m.id = p.mountain_id
    WHERE c.country_code = 'BG' and p.elevation > 2835
    ORDER BY p.elevation DESC
	LIMIT 10
    ;
-- =========================================
-- Task 13: Count Mountain Ranges
-- =========================================

SELECT c.country_code,count( m.mountain_range) c
    FROM countries c
    JOIN mountains_countries mc
    on c.country_code = mc.country_code
    JOIN mountains m
    on mc.mountain_id = m.id
    WHERE c.country_code = 'BG' or c.country_code = 'US' or c.country_code = 'RU'
	GROUP BY c.country_code
    ORDER BY c DESC
	;
-- =========================================
-- Task 14: Countries with Rivers
-- =========================================

SELECT c.country_name ,
CASE
WHEN r.river_name is NULL
THEN NULL
else r.river_name
END
FROM countries c
left JOIN countries_rivers cr
ON c.country_code = cr.country_code
left JOIN rivers r
ON cr.river_id = r.id
WHERE c.continent_code = 'AF'
ORDER BY c.country_name
LIMIT 5
;
-- =========================================
-- Task 15: Continents and Currencies
-- =========================================
SELECT *

from
(SELECT continent_code, count(currency_code) u , currency_code
FROM countries
GROUP BY continent_code,currency_code)as t




-- =========================================
-- Task 16: Countries without any Mountains
-- =========================================

-- Write your SQL query here


-- =========================================
-- Task 17: Highest Peak and Longest River by Country
-- =========================================

-- Write your SQL query here
