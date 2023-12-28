-- OUTER JOIN
-- Dvije vrste JOIN:
-- 1. INNER JOIN
-- 2. OUTER JOIN
--     2.1 LEFT  -> FROM customers : orders 
--     2.2 RIGHT -> FROM orders : customers
SELECT 
	c.customer_id, 
    c.first_name, 
    o.order_id
FROM customers c
LEFT JOIN orders o ON c.customer_id=o.customer_id
ORDER BY c.customer_id;