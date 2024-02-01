-- VJEŽBA
-- Baza: invoicing(sql_invoicing)
-- Tabela: invoices
-- Želimo podatke iz ove tabele prebaciti u drugu tabelu invoice_archived
-- Međutim, trik je u tome što želim prebaciti umjesto client_id
-- ime klijenta. Da ne bude baš jednostavan zadatak rekli smo 
-- da želimo prebaciti i kopirati samo invoices koji imaju payment.
-- Odnono prebacujemo plaćene fakture.
DROP TABLE IF EXISTS invoice_archived;
CREATE TABLE invoice_archived AS
SELECT 
    i.invoice_id, 
    i.number, 
    i.client_id, 
    c.name, 
    i.invoice_total, 
    i.payment_total, 
    i.invoice_date, 
    i.due_date, 
    i.payment_date
FROM invoices i
JOIN clients c USING(client_id)
WHERE i.payment_date IS NOT NULL;