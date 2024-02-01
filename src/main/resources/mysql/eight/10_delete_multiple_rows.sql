-- Vježba
-- Izbrisati sve fakture od klijenta koji se zove
-- 'Myworks'
SELECT * FROM clients;

DELETE FROM invoices
WHERE client_id = (
	SELECT client_id
    FROM clients 
    WHERE name='Myworks'
);
SELECT * FROM invoices;actor