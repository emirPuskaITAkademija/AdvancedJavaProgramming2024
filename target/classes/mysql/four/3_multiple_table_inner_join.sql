-- JOINING(SPAJANJE) podataka iz više od 2 tabele
SELECT * 
FROM orders;

SELECT * 
FROM order_statuses;

-- SPAJANJE tri tabele: orders, customers, order_statuses
SELECT 
	o.order_id, 
    o.order_date,
    c.first_name,
    c.last_name,
    os.name AS status
FROM orders o 
JOIN customers c ON o.customer_id=c.customer_id
JOIN order_statuses os ON o.status=os.order_status_id;
