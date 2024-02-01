-- Kreiramo kopije tabela
CREATE TABLE orders_archived3 AS
SELECT * FROM orders LIMIT 10, 6;