SELECT *
FROM invoices;
-- Želimo ažurirati red sa invoice_id = 1;
UPDATE invoices
SET payment_total=10, payment_date='2024-02-01'
WHERE invoice_id=3;