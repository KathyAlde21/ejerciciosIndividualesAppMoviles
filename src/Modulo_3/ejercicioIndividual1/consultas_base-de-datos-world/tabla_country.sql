SELECT * FROM country;

SELECT Name
FROM country
ORDER BY Name ASC;

SELECT Name, Code
FROM country
WHERE Continent = 'South America'
ORDER BY Code ASC;

SELECT Name
FROM country
ORDER BY Name DESC;

SELECT COUNT(*)
FROM country;

SELECT COUNT(*) LocalName
FROM country
WHERE Continent = 'South America';

