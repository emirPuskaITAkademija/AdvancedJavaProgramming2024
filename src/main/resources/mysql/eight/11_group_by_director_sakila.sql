-- GROUP BY 
-- SUM, AVERAGE, COUNT, MIN, MAX -> uvijek se gotovo kombinuju sa GROUP BY
SELECT COUNT(movie_id) AS Total, director
FROM movies
GROUP BY director;