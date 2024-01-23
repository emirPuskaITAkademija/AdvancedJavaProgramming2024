-- Recimo da želimo kreirati izvještaj i dohvatiti 
-- sve orders i uz svaku narudžbu(order) dodati neku 
-- dodatnu LABELU.
-- Dvije su moguće : ACTIVE and ARCHIVED
SELECT 
    order_id, 
    order_date, 
    'Active' AS status
FROM orders 
WHERE order_date>= '2019-01-01'
UNION
SELECT 
   order_id, 
   order_date, 
   'Archived' AS status
FROm orders 
WHERE order_date<'2019-01-01'

 