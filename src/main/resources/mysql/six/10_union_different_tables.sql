--  Imena svih kupaca i dostavljača
SELECT first_name
FROM customers
UNION 
SELECT name
FROM shippers