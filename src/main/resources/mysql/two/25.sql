-- Vježba
-- TABELA: orders
-- Dobaviti sve orders(narudžbe) koje nisu isporučene
SELECT *
FROM orders
WHERE shipped_date IS NULL;