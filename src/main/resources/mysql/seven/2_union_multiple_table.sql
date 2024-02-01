-- customers, shippers
SELECT 
first_name
FROM customers
UNION
SELECT 
name
FROM shippers; 