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

-- Write your SQL query here


-- =========================================
-- Task 06: Deposits Sum for Ollivander Family
-- =========================================

-- Write your SQL query here


-- =========================================
-- Task 07: Deposits Filter
-- =========================================

-- Write your SQL query here


-- =========================================
-- Task 08: Deposit Charge
-- =========================================

-- Write your SQL query here


-- =========================================
-- Task 09: Age Groups
-- =========================================

-- Write your SQL query here


-- =========================================
-- Task 10: First Letter
-- =========================================

-- Write your SQL query here


-- =========================================
-- Task 11: Average Interest
-- =========================================

-- Write your SQL query here


-- =========================================
-- Task 12: Employees Minimum Salaries
-- =========================================

-- Write your SQL query here


-- =========================================
-- Task 13: Employees Average Salaries
-- =========================================

-- Write your SQL query here


-- =========================================
-- Task 14: Employees Maximum Salaries
-- =========================================

-- Write your SQL query here


-- =========================================
-- Task 15: Employees Count Salaries
-- =========================================

-- Write your SQL query here


-- =========================================
-- Task 16: 3rd Highest Salary
-- =========================================

-- Write your SQL query here


-- =========================================
-- Task 17: Salary Challenge
-- =========================================

-- Write your SQL query here


-- =========================================
-- Task 18: Departments Total Salaries
-- =========================================

-- Write your SQL query here
