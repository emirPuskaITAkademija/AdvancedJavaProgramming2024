-- Compound Join Conditions
-- Kompozitno Spajanje
-- jednu ili SINGLE COLUMN da povežemo redove iz dvije tabele
-- order_items: radimo povezivanje preko 2 kolone
-- order_items -> order_id
-- order_items -> product_id
-- Šta u tabeli order_items predstavlja jedinstvenost reda ? 
-- Odgovor: kombinacija order_id i product_id
-- Napraviti spajanje između order_items i order_item_notes

SELECT *
FROM order_items oi 
JOIN order_item_notes oin
     ON oi.order_id = oin.order_id
     AND oi.product_id = oin.product_id;
