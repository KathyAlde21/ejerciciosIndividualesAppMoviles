SELECT * FROM world.countrylanguage;

-- contando idioma en sudamerica
SELECT COUNT(DISTINCT Language) AS NumberOfLanguages
FROM countrylanguage
JOIN country ON countrylanguage.CountryCode = country.Code
WHERE country.Continent = 'South America';

-- mostrando los datos
SELECT DISTINCT countrylanguage.Language AS Language
FROM countrylanguage
JOIN country ON countrylanguage.CountryCode = country.Code
WHERE country.Continent = 'South America'
ORDER BY country.Name, countrylanguage.Language;

-- mostrando los datos para cada pais
SELECT country.Name AS Country, countrylanguage.Language AS Language
FROM countrylanguage
JOIN country ON countrylanguage.CountryCode = country.Code
WHERE country.Continent = 'South America'
ORDER BY country.Name, countrylanguage.Language;
