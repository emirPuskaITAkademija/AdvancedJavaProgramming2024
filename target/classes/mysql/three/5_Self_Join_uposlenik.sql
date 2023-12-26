SELECT 
	u.ime, 
    u.prezime, 
    u.plata,
    concat(m.ime, ' ', m.prezime) AS 'Šef',
    m.plata
FROM uposlenik u
LEFT JOIN uposlenik m
     ON u.sefica=m.id