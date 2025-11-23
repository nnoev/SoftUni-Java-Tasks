-- =========================================
-- Task 01: Departments Info
-- =========================================

SELECT department_id , count(id)
from employees
GROUP BY department_id;

-- =========================================
-- Task 02: Average Salary
-- =========================================

SELECT department_id ,round(avg(salary),2)
from employees
GROUP BY department_id;

-- =========================================
-- Task 03: Minimum Salary
-- =========================================

    SELECT 
    department_id, MIN(salary)
FROM
    employees
GROUP BY department_id
HAVING MIN(salary) > 800
;

-- =========================================
-- Task 04: Appetizers Count
-- =========================================

SELECT count(1)
FROM products
WHERE price>8 and category_id =2


-- =========================================
-- Task 05: Menu Prices
-- =========================================

SELECT 
    category_id,
    ROUND(AVG(price), 2),
    MIN(price),
    MAX(price)
FROM
    products
GROUP BY category_id;