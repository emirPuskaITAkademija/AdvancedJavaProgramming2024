-- Vježba
-- SELEKTUJTE sve stavke svih narudzbi
-- i učitajte komentare vezane za stavke 
-- Ukoliko note ili komentar postoji prikazite 
-- inače prikazite NULL
-- order_items, order_item_notes
SELECT *
FROM order_items oi
LEFT JOIN order_item_notes oin
-- ON oi.order_id=oin.order_Id AND oi.product_id=oin.product_id;
USING ( order_id, product_id)