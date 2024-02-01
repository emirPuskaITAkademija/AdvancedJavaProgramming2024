SELECT 
	order_id, 
    customer_id, 
    order_date, 
    status, 
    comments, 
    shipped_date, 
    'AKTIVNE NARUDŽBE'AS status
FROM orders
WHERE order_date>= '2018-01-01'
UNION
SELECT 
	order_id, 
    customer_id, 
    order_date, 
    status, 
    comments, 
    shipped_date, 
    'ARHIVIRANE' AS status
FROM orders
WHERE order_date < '2018-01-01';
