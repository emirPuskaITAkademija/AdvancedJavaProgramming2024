-- GOLD, SILVER, BRONZE
-- GOLD  broje_poena>= 3000
-- SILVER  2000 <= broj_poena <3000
-- BRONZE broj_poena<2000
SELECT
   customer_id, 
   first_name, 
   points, 
   'BRONZE' as LEVEL
FROM customers 
WHERE points<2000
UNION
SELECT
   customer_id, 
   first_name, 
   points, 
   'SILVER' as LEVEL 
FROM customers
WHERE points BETWEEN 2000 AND 3000
UNION
SELECT
   customer_id, 
   first_name, 
   points, 
   'GOLD' as LEVEL 
FROM customers
WHERE points>=3000;