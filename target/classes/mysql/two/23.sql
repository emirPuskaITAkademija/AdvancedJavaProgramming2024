-- VJEŽBA
-- Dobaviti kupce sa sljedećim filterima
-- first_name je ELKA ili AMBUR
-- last_name završava sa EY ili ON
-- last_name počinje sa MY ili sadrži SE
-- last_name sadrži B praćeno sa R ili U
SELECT *
FROM customers
WHERE last_name REGEXP 'b[ru]';
-- SELECT *
-- FROM customers
-- WHERE last_name REGEXP '^my|se';
-- SELECT *
-- FROM customers 
-- WHERE last_name REGEXP 'ey$|on$';

-- SELECT *
-- FROM customers
-- WHERE first_name REGEXP 'elka|ambur';