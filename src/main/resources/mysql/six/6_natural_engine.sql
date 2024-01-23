-- Kada koristimo NATURAL JOIN ne specificiramo
-- COLUMN NAME nego sam DB engine pretražuje dvije 
-- tabele koje se JOINAJU  i povezat će ih po 
-- IMENIMA KOLONA SA ISTIM IMENOM
SELECT 
   o.order_id, 
   c.first_name
FROM orders o
NATURAL JOIN customers c