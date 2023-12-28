-- VJEŽBA
-- BAZU: invoicing
-- Analizirajte tabelu: payments
-- Kreirajte izvještaj koji će prikazati
-- koji klijenti su nam uplatili i kako su uplatili novce
SELECT 
	p.payment_id,
    c.client_id, 
    c.name, 
    pm.name
FROM payments p
JOIN clients c ON p.client_id=c.client_id
JOIN payment_methods pm ON pm.payment_method_id=p.payment_method;