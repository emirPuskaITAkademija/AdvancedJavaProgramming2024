-- VJEŽBA
-- Kreirati order i povezati 3 stavke narudžbe
INSERT INTO orders(customer_id, order_date, status)
VALUES (2, '2024-01-25', 1);
INSERT INTO order_items
VALUES 
    (LAST_INSERT_ID(), 2 , 23, 3.98),
    (LAST_INSERT_ID(), 3 , 1, 4.98),
    (LAST_INSERT_ID(), 1 , 2, 5.98);