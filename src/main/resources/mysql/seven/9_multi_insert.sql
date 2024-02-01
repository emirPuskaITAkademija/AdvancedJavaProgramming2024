-- LAST_INSERT_ID()
INSERT INTO orders(customer_id, order_date, status)
VALUES(2, '2024-03-12', 1);
INSERT INTO order_items(order_id, product_id, quantity, unit_price)
VALUES(last_insert_id(), 1, 3, 2.95)
