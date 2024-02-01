-- ZADATAK: Klijent nam je uplatio 50 % ukupnog iznosa 
-- na due_date. Npr. faktura sa invoice_id = 3
SELECT * FROM invoices;
UPDATE invoices
SET 
   payment_total=invoice_total*0.5,
   payment_date=due_date
WHERE invoice_id=3;