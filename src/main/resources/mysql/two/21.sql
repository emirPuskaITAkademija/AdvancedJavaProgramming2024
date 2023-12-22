-- želim sve kupce koji u prezimenu sadrže 'e'
SELECT *
FROM customers
WHERE last_name REGEXP '[gim]e';