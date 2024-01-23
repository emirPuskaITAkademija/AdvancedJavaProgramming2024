-- Kako se USING može koristiti i sa OUTER i sa INNER join
SELECT 
   o.order_id,
   c.first_name, 
   c.last_name, 
   s.name 
FROM orders o
JOIN customers c USING (customer_id)
LEFT JOIN shippers s USING (shipper_id);