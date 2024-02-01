INSERT INTO orders_archived2
SELECT *
FROM orders
WHERE order_date<'2018-01-01';