-- Mi smo do sada slektovali podatke iz JEDNE TABELE.
-- SELECT * FROM IME_TABELE;
-- U realnom svijetu u RELACIONIM bazama podataka imamo 
-- tabele povezane relacijama.
-- Relacije su: one-to-one, one-to-many(many-to-one), many-to-many
-- Dvije vrste JOIN:
-- 1. INNER JOIN
-- 2. OUTER JOIN
SELECT 
	o.order_id, c.customer_id, c.first_name, c.last_name
FROM orders o
INNER JOIN customers c
ON o.customer_id=c.customer_id;