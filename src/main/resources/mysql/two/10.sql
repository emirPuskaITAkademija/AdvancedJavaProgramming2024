-- TABELA: order_items
-- dohvatiti sve stavke narudzbe koja ima id = 6
-- a kod koje je total price veći od 30
SELECT *
FROM order_items
WHERE order_id=6 AND (quantity*unit_price)>30;