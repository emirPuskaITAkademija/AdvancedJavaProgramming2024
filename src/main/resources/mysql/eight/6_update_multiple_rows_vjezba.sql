-- VJEZBA
-- Kreirati SQL statement koji će
--   1. svim customers rođenim prije 1990 dati extra 50 poena
SELECT * FROM customers;
UPDATE customers
SET points = points + 50
WHERE birth_date<'1990-01-01';