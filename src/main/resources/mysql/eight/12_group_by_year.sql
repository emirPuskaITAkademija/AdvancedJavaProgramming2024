-- VJEŽBA 
-- izbrojati sve filmove u jednoj godini
-- Rezultat treba biti : godina, broj filmova
SELECT 
	count(movie_id) AS 'Broj filmova', 
    year
FROM movies
GROUP BY year;