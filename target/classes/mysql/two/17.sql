
SELECT *
FROM customers
-- WHERE last_name LIKE '%field%';  
WHERE last_name REGEXP 'field';