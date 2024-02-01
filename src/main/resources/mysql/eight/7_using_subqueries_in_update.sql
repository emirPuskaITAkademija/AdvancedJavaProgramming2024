-- Korištenje subqueries unutar update statementa
UPDATE invoices
SET 
	payment_total=invoice_total*0.5,
    payment_date=due_date
WHERE client_id=3;
-- Šta ako nemamo client_id ? 
-- Imamo npr. Neko
SELECT client_id
FROM clients 
WHERE name='Myworks';

UPDATE invoices 
SET 
	payment_total=invoice_total*0.5,
    payment_date=due_date
WHERE client_id = (
	SELECT client_id
	FROM clients
    WHERE name='Myworks'
);
SELECT * FROM invoices;
