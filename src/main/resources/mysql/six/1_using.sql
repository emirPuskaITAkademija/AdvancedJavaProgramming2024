-- USING 
-- SELECT 
-- 	o.order_id, 
--     c.first_name, 
--     c.last_name
-- FROM orders o
-- JOIN customers c ON o.customer_id=c.customer_id
SELECT 
   o.order_id, 
   c.first_name, 
   c.last_name,
   s.name
FROM orders o 
JOIN customers c USING (customer_id)
JOIN shippers s USING (shipper_id)