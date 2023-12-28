-- VJEŽBA
-- order_items, products
-- Selektujte product_id, njegovo ime, quantity, unit_price

SELECT
    p.product_id, name, oi.quantity, oi.unit_price
FROM order_items oi
JOIN products p
	ON oi.product_id=p.product_id;