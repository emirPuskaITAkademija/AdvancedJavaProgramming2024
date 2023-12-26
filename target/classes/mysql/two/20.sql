-- Želim dohvatiti kupce čije prezime sadrži
-- ili 'field' ili 'mac'
SELECT *
FROM customers
-- WHERE last_name LIKE '%field%' OR last_name LIKE '%mac%';
WHERE last_name REGEXP 'field$|mac|rose';