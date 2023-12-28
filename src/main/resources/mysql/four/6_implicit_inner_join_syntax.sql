-- Implicit Join Syntax
-- orders and customers
--  orders : order_id, customer_id
--  customers: customer_id 
SELECT *
FROM orders o
JOIN customers c
ON o.customer_id = c.customer_id;

-- Mozemo zamijeniti ovaj query iznad: IMPLICIT
SELECT *
FROM orders o, customers c
WHERE o.customer_id = c.customer_id
