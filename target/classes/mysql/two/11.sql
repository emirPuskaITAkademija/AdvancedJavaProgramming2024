-- TABELA: products
-- selektovati sve proizvode čiji  quantity in stock
-- jednak 49, 38, 72
SELECT *
FROM products
WHERE quantity_in_stock IN (49, 38, 72)

