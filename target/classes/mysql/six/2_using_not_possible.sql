-- Probajte koristiti USING kada želite 
-- povezati orders i order_statuses
-- VJEŽBA: prikažite sve narudžbe i njihove statuse
SELECT 
   o.order_id,
   os.name
FROM orders o
JOIN order_statuses os ON o.status=os.order_status_id;
 