-- VJEŽBA
-- IZVJEŠTAJ
-- 1. <2000 BRONZE
-- 2. 2000<=broj poena <3000 SILVER
-- 3. broj poena >= 3000 GOLD
-- Result: customer_id, first_name, points, type
-- type može imati BRONZE, SILVER, GOLD
SELECT 
    customer_id, 
    first_name, 
    points, 
    'Bronze' AS type
FROM customers
WHERE points <2000
UNION
SELECT 
    customer_id, 
    first_name, 
    points, 
    'Silver' AS type
FROM customers
WHERE points >= 2000 AND points < 3000
UNION
SELECT 
    customer_id, 
    first_name, 
    points, 
    'Gold' AS type
FROM customers
WHERE points >= 3000