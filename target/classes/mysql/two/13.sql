-- Selektujte sve kupce koji su
--  rođeni između 1990-01-01 i 2000-01-01
SELECT *
FROM customers
WHERE birth_date BETWEEN '1990-01-01' AND '2000-01-01';