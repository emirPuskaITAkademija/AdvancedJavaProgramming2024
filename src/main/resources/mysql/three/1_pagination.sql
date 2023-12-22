-- LIMIT 
-- Pagination -> 7,8,9 record
-- page 1 : 1, 2, 3 (offset=0, row_number=3)
-- page 2 : 4, 5, 6 (offset=3, row_number=3)
-- page 3 : 7, 8, 9 (offset=6, row_number=3)
SELECT *
FROM customers
LIMIT 6, 3;