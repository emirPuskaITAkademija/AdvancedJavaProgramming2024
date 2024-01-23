SELECT 
	c.first_name as customer, 
    p.name AS product
FROM customers c
CROSS JOIN products p 
ORDER BY customer