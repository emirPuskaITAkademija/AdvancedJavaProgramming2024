-- CILJ: dobaviti sve kupce koji su aktivni bili
-- customers, orders
SELECT 
	c.first_name, 
    c.last_name, 
    c.birth_date, 
    o.order_id
FROM customers c
LEFT JOIN orders o ON c.customer_id=o.customer_id