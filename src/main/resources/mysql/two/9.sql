-- Dohvatiti kupce koji su ili rođeni 
-- poslije 1990-01-01 ili osobe koje žive u Virginiji 
-- I IMAJU najmanje 1000 poena 
SELECT *
FROM customers
WHERE birth_date>'1990-01-01' 
OR (points>=1000 AND state='VA');