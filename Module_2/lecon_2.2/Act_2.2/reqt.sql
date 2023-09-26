Act 2.2.1

CREATE TABLE ft_table (
     id INT AUTO_INCREMENT PRIMARY KEY,
     login VARCHAR(255) DEFAULT 'toto',
     band ENUM('staff', 'student', 'other'),
     creation_date DATE NOT NULL
);
Act 2.2.2

INSERT INTO ft_table (login, band, creation_date)
VALUES
    ('loki', 'staff', '2013-05-01'),
    ('scadoux', 'student', '2014-01-01'),
    ('chap', 'staff', '2011-04-27'),
    ('bambou', 'staff', '2014-03-01'),
    ('fantomet', 'staff', '2010-04-03');
Act 2.2.3

INSERT INTO ft_table (login, band, creation_date)
SELECT 
    nom, 
    'other' AS band, 
    date_naissance AS creation_date
FROM fiche_personne
WHERE 
    CHAR_LENGTH(nom) < 9
    AND nom LIKE '%a%'
ORDER BY nom ASC
LIMIT 10;

Act 2.2.4

UPDATE ft_table
SET creation_date = DATE_ADD(creation_date, INTERVAL 20 YEAR)
WHERE id > 5;

Act 2.2.5

DELETE FROM ft_table
ORDER BY id ASC
LIMIT 5;

Act 2.2.6

SELECT titre, resum
FROM film
WHERE LOWER(resum) LIKE '%vincent%'
ORDER BY id_film ASC;

Act 2.2.7

SELECT titre, resum
FROM film
WHERE titre LIKE '%42%' OR resum LIKE '%42%'
ORDER BY LENGTH(titre), LENGTH(resum);

Act 2.2.8

SELECT 
    nom, 
    prenom, 
    DATE_FORMAT(date_naissance, '%Y-%m-%d') AS "date de naissance"
FROM fiche_personne
WHERE YEAR(date_naissance) = 1989
ORDER BY nom;

Act 2.2.9

SELECT COUNT(*) AS "nb_court-metrage"
FROM film
WHERE duree_min <= 42;

Act 2.2.10

SELECT film.titre AS Titre, film.resum AS Resume, film.annee_prod
FROM film 
INNER JOIN genre  ON film.id_genre = genre.id_genre
WHERE genre.nom = 'experimental'
ORDER BY film.annee_prod DESC;

Act 2.2.11

SELECT UPPER(fiche_personne.nom) AS NOM, fiche_personne.prenom, abonnement.prix
FROM fiche_personne
INNER JOIN membre ON fiche_personne.id_perso = membre.id_fiche_perso
INNER JOIN abonnement ON membre.id_abo = abonnement.id_abo
WHERE abonnement.prix > 42
ORDER BY NOM ASC, fiche_personne.prenom ASC;
 
Act 2.2.12

SELECT nom, prenom
FROM fiche_personne
WHERE nom LIKE '%-%' OR prenom LIKE '%-%'
ORDER BY nom ASC, prenom ASC;

Act 2.2.13

SELECT ROUND(AVG(nbr_siege)) AS moyenne
FROM salle;

Act 2.2.14

SELECT etage_salle AS etage, COUNT(*) AS nbr_siege
FROM salle
GROUP BY etage_salle
ORDER BY nbr_siege DESC;

Act 2.2.15

SELECT CONCAT(REVERSE(SUBSTR(telephone, 2)), '') AS enohpelet
FROM distrib
WHERE telephone LIKE '05%';

Act 2.2.16

SELECT COUNT(*) AS films
FROM membre
WHERE
    (date_dernier_film>= '2006-10-30' AND date_dernier_film <= '2007-07-27') OR
    (MONTH(date_dernier_film) = 12 AND DAY(date_dernier_film) = 24);

Act 2.2.17

SELECT
  COUNT(*)  AS nb_abo,
  FLOOR(AVG(prix)) AS moy_abo,
  SUM(duree_abo % 42) AS ft
FROM abonnement;
