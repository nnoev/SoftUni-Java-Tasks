-- =========================================
-- Task 01: Find Names of All Employees by First Name
-- =========================================

SELECT first_name,last_name
FROM employees
WHERE substring(first_name from 1 for 2)="Sa";

-- =========================================
-- Task 02: Find Names of All Employees by Last Name
-- =========================================

SELECT first_name,last_name
FROM employees
WHERE last_name LIKE '%ei%';

-- =========================================
-- Task 03: Find First Names of All Employees
-- =========================================

SELECT first_name
FROM employees
WHERE (department_id = 3 
OR department_id = 10 )
AND extract(YEAR FROM hire_date)>=1995 
AND extract(YEAR FROM hire_date)<=2005
ORDER BY employee_id;

-- =========================================
-- Task 04: Find All Employees Except Engineers
-- =========================================

SELECT first_name,last_name
FROM employees
WHERE job_title NOT LIKE '%engineer%';

-- =========================================
-- Task 05: Find Towns with Name Length
-- =========================================

SELECT name
FROM towns
WHERE length(name) BETWEEN 5 AND 6
ORDER BY name ASC;

-- =========================================
-- Task 06: Find Towns Starting With
-- =========================================

SELECT *
FROM towns
WHERE name REGEXP '^[MKBE]'
ORDER BY name ASC;

-- =========================================
-- Task 07: Find Towns Not Starting With
-- =========================================

SELECT *
FROM towns
WHERE name NOT REGEXP '^[RBD]'
ORDER BY name ASC;

-- =========================================
-- Task 08: Create View Employees Hired After
-- =========================================

CREATE VIEW v_employees_hired_after_2000 AS
SELECT first_name, Last_name
FROM employees
WHERE YEAR(hire_date)>2000;

-- =========================================
-- Task 09: Length of Last Name
-- =========================================

SELECT first_name, last_name
FROM employees
WHERE length(last_name)=5;

-- =========================================
-- Task 10: Countries Holding 'A'
-- =========================================

SELECT country_name,iso_code
FROM countries
WHERE country_name LIKE '%a%a%a%'
ORDER BY iso_code

-- =========================================
-- Task 11: Mix of Peak and River Names
-- =========================================

SELECT peak_name,river_name,lower(concat(peak_name,substring(river_name,2))) as mix
FROM peaks,rivers
WHERE right(peak_name,1)= left(river_name,1)
ORDER BY mix ASC;

-- =========================================
-- Task 12: Games From 2011 and 2012 Year
-- =========================================

SELECT name,date_format(start,'%Y-%m-%d')
FROM games
WHERE year(start) in (2011,2012)
ORDER BY start , name
LIMIT 50;

-- =========================================
-- Task 13: User Email Providers
-- =========================================

SELECT user_name,substring(email, LOCATE('@',email)+1)as provider
FROM users
ORDER BY provider ASC,user_name ASC;

-- =========================================
-- Task 14: Get Users with IP Address Like Pattern
-- =========================================

SELECT user_name, ip_address
FROM users
WHERE ip_address LIKE '___.1%.%.___'
ORDER BY user_name ASC;

-- =========================================
-- Task 15: Show All Games with Duration
-- =========================================

SELECT 
    name,
    CASE
        WHEN HOUR(start) >= 0 AND HOUR(start) < 12 THEN 'Morning'
        WHEN HOUR(start) >= 12 AND HOUR(start) < 18 THEN 'Afternoon'
        WHEN HOUR(start) >= 18 AND HOUR(start) < 24 THEN 'Evening'
    END AS 'Parf of the day',
    CASE
        WHEN duration <= 3 THEN 'Extra Short'
        WHEN duration > 3 AND duration <= 6 THEN 'Short'
        WHEN duration > 6 AND duration <= 10 THEN 'Long'
        ELSE'Extra Long'
    END AS Duration
FROM games;

-- =========================================
-- Task 16: Orders Table
-- =========================================

SELECT 
    product_name, order_date, TIMESTAMPADD(day , 3, order_date), TIMESTAMPADD(month,1,order_date)  
FROM orders;