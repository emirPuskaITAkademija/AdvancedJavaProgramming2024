-- Selektuje sve kupce koji imaju 1000 ili više poena a manje ili bar 3000 poena
-- SELECT *
-- FROM customers
-- WHERE points>=1000 AND points<=3000;
SELECT *
FROM customers
WHERE points BETWEEN 1000 AND 3000;