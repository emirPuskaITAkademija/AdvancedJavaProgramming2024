-- VJEŽBA
-- Reći da su svi iz 'CA' i 'NY'
-- platili 50 % fakture na due_date
UPDATE invoices
SET 
	payment_total=invoice_total*0.5,
    payment_date=due_date
WHERE client_id IN
(SELECT client_id FROM clients WHERE state IN ('CA', 'NY'));

SELECT client_id
FROM clients 
WHERE state IN ('CA', 'NY');

SELECT 
	invoice_total, 
    payment_total, 
    payment_date, 
    due_date, 
    state
FROM invoices
JOIN clients USING (client_id);