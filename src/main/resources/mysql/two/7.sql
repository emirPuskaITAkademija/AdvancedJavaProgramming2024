-- VJEŽBA
-- TABELA: orders 
-- rezultat budu samo narudžbe poslije 2018 godine
SELECT *
FROM orders
WHERE order_date>='2018-01-01';