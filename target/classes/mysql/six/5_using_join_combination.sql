-- VJEŽBA
-- SQL invoicing BAZA
-- Direktor i kaže: "Želim da znam na koji datum 
-- i ko je radio uplatu i pomoću koje payment metode
-- RESULT: date, client, amount, name(payment method)
-- payments, payment_methods i client
SELECT 
    p.date, 
    c.name AS client, 
    p.amount, 
    pm.name AS payment_method
FROM payments p
JOIN clients c USING(client_id)
JOIN payment_methods pm 
     ON p.payment_method=pm.payment_method_id