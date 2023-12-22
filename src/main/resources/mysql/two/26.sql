-- ORDER BY 
-- Vjerovali ili ne ?
-- Mi već implicitno koristimo ORDER BY iako nisamo eksplicitno naveli
-- SELECT *
-- FROM customers
-- ORDER BY birth_date;

-- IZBJEGAVATI
SELECT first_name, last_name, 10 AS points
FROM customers
ORDER BY 1, 2;

