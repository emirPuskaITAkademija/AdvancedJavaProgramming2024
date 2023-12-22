
-- čije prezime počinje sa "field"
SELECT *
FROM customers
-- WHERE last_name LIKE 'B%';
WHERE last_name REGEXP '^B';