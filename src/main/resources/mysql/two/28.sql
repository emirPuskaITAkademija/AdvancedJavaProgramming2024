-- VJEŽBA
-- DOBAVITI top tri najlojalnija kupca
SELECT *
FROM customers
ORDER BY points DESC
LIMIT 3;