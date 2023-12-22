-- IS NULL operator
-- Zamislite situaciju u kojoj imate customers(kupce)
-- koji nisu htjeli ostaviti broj telefona
SELECT * 
FROM customers
WHERE phone IS NOT NULL;
-- WHERE phone IS NULL;