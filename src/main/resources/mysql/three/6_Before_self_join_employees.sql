-- SELF JOIN
-- Tabelu možemo povezati samu sa sobom
SELECT *
FROM employees
WHERE reports_to=37851;