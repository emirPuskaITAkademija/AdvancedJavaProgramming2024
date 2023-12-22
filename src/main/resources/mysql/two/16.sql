-- ZAKLJUČAK: 
-- LIKE 
-- 1. % 
-- 2. _
-- VJEŽBA
-- Dobaviti sve kupce 
-- čije adrese sadrže TRAIL ili AVENUE
-- a čiji phone numbers završava sa 9
SELECT *
FROM customers
WHERE (address LIKE '%TRAIL%' 
OR address LIKE '%AVENUE%')
AND phone LIKE '%9';

