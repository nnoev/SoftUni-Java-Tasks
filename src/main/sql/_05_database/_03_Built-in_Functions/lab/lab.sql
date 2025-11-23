-- =========================================
-- Task 01: Find Book Titles
-- =========================================

	SELECT  title 
	FROM books
	WHERE substring(title from 1 for 3)="the"
	ORDER BY id;

-- =========================================
-- Task 02: Replace Titles
-- =========================================

SELECT REPLACE(title,"The" , "***")
from books
WHERE substring(title from 1 for 3)="the"
ORDER BY id;

-- =========================================
-- Task 03: Sum Cost of All Books
-- =========================================

SELECT round(SUM(cost),2)
FROM books;

-- =========================================
-- Task 04: Days Lived
-- =========================================

SELECT CONCAT(first_name, " ", last_name), DATEDIFF(died,born)
FROM authors;

-- =========================================
-- Task 05: Harry Potter Books
-- =========================================

SELECT title 
FROM books
WHERE substring(title from 1 for 5)="Harry"
ORDER BY id;