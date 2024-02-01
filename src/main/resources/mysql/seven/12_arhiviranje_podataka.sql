-- Zamislimo da orders tabela ima 1 000 0000 000 redova
-- Kako kreirati tabelu koja će arhivirati orders ?
CREATE TABLE orders_archived 
AS SELECT * FROM orders;