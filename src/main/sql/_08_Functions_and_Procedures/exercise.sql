-- =========================================
-- Task 01: Employees with Salary Above 35000
-- =========================================
delimiter $$
CREATE PROCEDURE usp_get_employees_salary_above_35000 ()
NOT DETERMINISTIC
READS SQL DATA
BEGIN
	SELECT first_name,last_name
	FROM employees
	WHERE salary>35000
	ORDER BY first_name, last_name,employee_id;
END$$
delimiter ;

-- =========================================
-- Task 02: Employees with Salary Above Number
-- =========================================

delimiter $$
CREATE PROCEDURE usp_get_employees_salary_above(input_salary DECIMAL(10,4))
NOT DETERMINISTIC
READS SQL DATA
BEGIN
	SELECT first_name,last_name
	FROM employees
	WHERE salary>=input_salary
	ORDER BY first_name, last_name,employee_id;
END$$
delimiter ;

-- =========================================
-- Task 03: Town Names Starting With
-- =========================================

delimiter $$
CREATE PROCEDURE usp_get_towns_starting_with (search_for VARCHAR(50))
NOT DETERMINISTIC
READS SQL DATA
BEGIN

     SELECT
    name AS town_name
FROM
    towns
    WHERE name LIKE CONCAT(search_for,'%')

ORDER BY name;

END$$
delimiter ;


-- =========================================
-- Task 04: Employees from Town
-- =========================================

delimiter $$
CREATE PROCEDURE usp_get_employees_from_town (town_name VARCHAR(50))
NOT DETERMINISTIC
READS SQL DATA
BEGIN

    SELECT first_name,last_name FROM employees e
JOIN addresses a ON e.address_id=a.address_id
JOIN towns t ON a.town_id=t.town_id
WHERE t.name = town_name
ORDER BY first_name,last_name
;

END$$
delimiter ;



-- =========================================
-- Task 05: Salary Level Function
-- =========================================

delimiter $$
CREATE FUNCTION ufn_get_salary_level(input_salary DECIMAL(10,2))
RETURNS VARCHAR(50)
NOT DETERMINISTIC
READS SQL DATA
BEGIN
IF input_salary < 30000 THEN
RETURN 'Low';
        ELSEIF input_salary >= 30000 AND input_salary <= 50000 THEN
        RETURN'Average';
        ELSE RETURN 'High';
        END IF;
END$$
delimiter ;



-- =========================================
-- Task 06: Employees by Salary Level
-- =========================================

delimiter $$
CREATE PROCEDURE usp_get_employees_by_salary_level (salary_level VARCHAR(50))
NOT DETERMINISTIC
READS SQL DATA
BEGIN
    SELECT first_name, last_name
    FROM employees
    WHERE
        (LOWER(salary_level) = 'low' AND salary < 30000)
        OR
        (LOWER(salary_level) = 'average' AND salary BETWEEN 30000 AND 50000)
        OR
        (LOWER(salary_level) = 'high' AND salary > 50000)
    ORDER BY first_name DESC, last_name DESC;
END$$

delimiter ;


-- =========================================
-- Task 07: Define Function
-- =========================================
delimiter $$
CREATE FUNCTION ufn_is_word_comprised(set_of_letters VARCHAR(50), word VARCHAR(50))
RETURNS INT
DETERMINISTIC
BEGIN
   DECLARE i INT DEFAULT 1;
   DECLARE c CHAR(1);
   WHILE i<=LENGTH(word) DO
   SET c = SUBSTRING(word,i,1);
   IF  LOCATE(c,set_of_letters)=0 THEN
   RETURN 0;
   END IF;
   SET i = i+1;
   END WHILE;
   RETURN 1;

END$$

delimiter ;



-- =========================================
-- Task 08: Find Full Name
-- =========================================

delimiter $$
CREATE PROCEDURE usp_get_holders_full_name()
NOT DETERMINISTIC
READS SQL DATA
BEGIN
    SELECT CONCAT(first_name,' ', last_name) AS full_name
    FROM account_holders
    ORDER BY full_name ASC, id ASC;
END$$

delimiter ;

-- =========================================
-- Task 09: People with Balance Higher Than
-- =========================================

delimiter $$
CREATE PROCEDURE usp_get_holders_with_balance_higher_than(amount DECIMAL(19,4))
NOT DETERMINISTIC
READS SQL DATA
BEGIN
 SELECT filtered.first_name,filtered.last_name
 FROM (
 SELECT first_name,last_name,SUM(balance) AS sum
 FROM accounts a
 JOIN account_holders ah ON a.account_holder_id=ah.id
  GROUP BY a.account_holder_id
  ORDER BY a.account_holder_id
 ) AS filtered
  WHERE filtered.sum>amount;
END$$

delimiter ;

-- =========================================
-- Task 10: Future Value Function
-- =========================================
delimiter $$
CREATE FUNCTION ufn_calculate_future_value (sum DECIMAL(10,4),rate DOUBLE, years INT)
RETURNS DECIMAL(10,4)
DETERMINISTIC
READS SQL DATA
BEGIN
DECLARE FV DECIMAL(10,4);
SET fv = sum* POWER((1+rate),years);
RETURN fv;
END$$
delimiter ;
-- =========================================
-- Task 11: Calculating Interest
-- =========================================

delimiter $$
	CREATE PROCEDURE usp_calculate_future_value_for_account(account_id INT, rate DECIMAL(10,4))
	NOT DETERMINISTIC
	READS SQL DATA
	BEGIN
	SELECT a.id,ah.first_name,ah.last_name,a.balance,UFN_CALCULATE_FUTURE_VALUE(a.balance,rate,5)
	FROM account_holders ah
	JOIN accounts a ON ah.id=a.account_holder_id
	WHERE a.id=account_id;

	END$$

delimiter ;

-- =========================================
-- Task 12: Deposit Money
-- =========================================
delimiter $$
	CREATE PROCEDURE usp_deposit_money(account_id INT, money_amount DECIMAL(19,4))

BEGIN
START TRANSACTION;
IF money_amount<=0 THEN
ROLLBACK;
ELSE
UPDATE accounts
SET balance = balance+money_amount
WHERE id=account_id;
COMMIT;
END IF;
END$$

delimiter ;
-- =========================================
-- Task 13: Withdraw Money
-- =========================================

delimiter $$
	CREATE PROCEDURE usp_withdraw_money(account_id INT, money_amount DECIMAL(19,4))

BEGIN
DECLARE cur_balance DECIMAL(19,4);
START TRANSACTION;
SET cur_balance = (SELECT balance FROM accounts
WHERE id=account_id);
IF cur_balance<money_amount THEN
ROLLBACK;
ELSEIF money_amount <0 THEN
ROLLBACK;
ELSE
UPDATE accounts
SET balance = balance-money_amount
WHERE id=account_id;
COMMIT;
END IF;
END$$

delimiter ;

-- =========================================
-- Task 14: Money Transfer
-- =========================================

delimiter $$
CREATE PROCEDURE usp_transfer_money(from_account_id int, to_account_id int, amount decimal (19,4))
BEGIN
DECLARE from_id INT;
DECLARE to_id INT;
DECLARE cur_balance DECIMAL(19,4);
START TRANSACTION;
SET cur_balance = (SELECT balance FROM accounts
WHERE id=from_account_id);
set from_id = (SELECT id FROM accounts
WHERE id=from_account_id);
set to_id = (SELECT id FROM accounts
WHERE id=to_account_id);
IF from_id is NULL or to_id is NULL THEN
ROLLBACK;
ELSEIF amount <=0 THEN
ROLLBACK;
ELSEIF cur_balance<amount THEN
ROLLBACK;
ELSEIF from_id=to_id THEN
ROLLBACK;
ELSE
UPDATE accounts
SET balance = balance-amount
WHERE id=from_id;
UPDATE accounts
SET balance = balance+amount
where id=to_id;
COMMIT;
END IF;
END$$

delimiter ;

-- =========================================
-- Task 15: Log Accounts Trigger
-- =========================================
CREATE TABLE logs (
log_id INT PRIMARY KEY AUTO_INCREMENT,
account_id int,
old_sum decimal(19,4),
new_sum decimal(19,4)
);
delimiter $$
CREATE TRIGGER log
AFTER UPDATE
ON accounts FOR EACH ROW
BEGIN
INSERT into logs (account_id,old_sum,new_sum)
VALUES (OLD.id,OLD.balance,NEW.balance);
END$$
delimiter ;



-- =========================================
-- Task 16: Emails Trigger
-- =========================================

CREATE TABLE notification_emails (
id INT PRIMARY KEY AUTO_INCREMENT,
recipient int,
subject TEXT,
body TEXT
);
delimiter $$
DELIMITER $$

CREATE TRIGGER trg_accounts_balance_change
AFTER UPDATE ON accounts
FOR EACH ROW
BEGIN
    IF OLD.balance <> NEW.balance THEN
        -- Insert into logs
        INSERT INTO logs(account_id, old_sum, new_sum)
        VALUES (OLD.id, OLD.balance, NEW.balance);

        -- Insert into notification_emails
        INSERT INTO notification_emails(recipient, subject, body)
        VALUES (
            OLD.id,
            CONCAT('Balance change for account: ', OLD.id),
            CONCAT('On ', DATE_FORMAT(NOW(), '%b %d %Y at %r'),
                   ' your balance was changed from ', OLD.balance, ' to ', NEW.balance, '.')
        );
    END IF;
END $$

DELIMITER ;

