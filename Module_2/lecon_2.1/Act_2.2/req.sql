SELECT * FROM Product;
SELECT * FROM Supplier;
SELECT * FROM customer;


\\sélectionner les produits de frs 1

SELECT p.*
FROM Product p
INNER JOIN Supplier s ON p.supplier_id = s.id
WHERE s.name = 'Fournisseur1';

\\jointure table product et table supplier

SELECT 
    p.id AS product_id,
    p.code AS product_code,
    p.type AS product_type,
    p.brand AS product_marque,
    s.id AS supplier_id,
    s.name AS supplier_name
FROM Product p
INNER JOIN Supplier s ON p.supplier_id = s.id;

 \\Afficher les types de produits qui existent dans la BD

SELECT DISTINCT type FROM Product;


\\ Afficher le nombre de produits disponibles pour chaque type de produit.

SELECT type, COUNT(*) AS nombre_de_produits
FROM Product
GROUP BY type;

\\Afficher les infos sur les clients dont le nom commence par 'S'
SELECT *
FROM customer
WHERE name LIKE 'S%';
\\ Dans la table produits, ajouter une colonne prix 

ALTER TABLE Product
ADD prix DECIMAL(10, 2); 
\\Insérer un prix (égal à 200) dans les lignes déjà existante
UPDATE Product
SET price= 200;

\\ Afficher pour tous les produits les infos suivantes :nom, type, prix, nom du fournisseur
SELECT 
    P.code AS product_code,
    P.type AS product_type,
    P.price,
    S.name AS supplier_name
FROM Product AS P
INNER JOIN Supplier AS S ON P.supplier_id = S.id;

\\Afficher le nombre de produit pour chaque fournisseur
SELECT
    S.name AS supplier_name,
    COUNT(*) AS product_number
FROM Supplier AS S
LEFT JOIN Product AS P ON S.id = P.supplier_id
GROUP BY S.name;