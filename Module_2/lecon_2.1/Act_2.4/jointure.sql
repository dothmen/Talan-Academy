SELECT
    OC.offerName AS "Nom du Produit",
    OC.unitPriceTTC AS "Prix Unitaire",
    QC.quantity AS "Quantité",
    QC.totalTTC AS "Total TTC"
FROM
    quotationContent QC
INNER JOIN
    offer OC ON QC.#id_offer = OC.id
WHERE
    QC.#id_quotation = 10;


SELECT
    Q.id AS "ID Devis",
    U.firstname AS "Prénom de l'Utilisateur",
    U.lastname AS "Nom de l'Utilisateur",
    U.email AS "Adresse Email"
FROM
    quotation Q
INNER JOIN
    user U ON Q.#id_user = U.id
WHERE
    U.email LIKE '%@gmail.com%';