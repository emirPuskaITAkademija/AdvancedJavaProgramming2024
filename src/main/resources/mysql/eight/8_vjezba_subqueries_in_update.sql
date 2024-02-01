-- BAZA: store(sql_store)
-- Tabela: orders
-- VJEZBA: za sve kupce koji imaju više od 
-- 3000 poena neka stoji komentar 'ZLATNI KUPAC'
SELECT 
		order_id, order_date, status, comments, shipped_date, shipper_id, points
FROM orders
JOIN customers USING(customer_id)
WHERE points>=3000;

UPDATE orders 
SET comments='ZLATNI KUPAC'
WHERE orders.customer_id IN 
(SELECT customer_id FROM customers WHERE points>=3000);





