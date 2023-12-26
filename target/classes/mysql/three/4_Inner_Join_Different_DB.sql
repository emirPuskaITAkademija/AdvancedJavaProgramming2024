-- SELECT * FROM inventory.products;
-- BAZA: inventory
-- BAZA: store
-- order_items(store)  i products(inventory)
SELECT * 
FROM store.order_items oi
JOIN inventory.products p
     ON oi.product_id=p.product_id
