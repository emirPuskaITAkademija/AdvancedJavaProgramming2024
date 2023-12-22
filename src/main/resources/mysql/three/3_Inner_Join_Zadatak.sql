-- Vježba
-- Za vježbu pogledajte strukturu order_items tabele
-- i obratite pažnju na kolone order_id, product_id
-- ZADATAK: selektujte product_id, ime proizvoda,
-- quantity, unit_price.

SELECT 
	oi.product_id, 
    p.name,
    oi.quantity, 
    oi.unit_price
FROM order_items oi
JOIN products p ON oi.product_id=p.product_id