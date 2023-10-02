// Fonction pour afficher les attributs dans des alertes
function afficherAttributs() {
    var lien = document.getElementById("ta");

    var href = lien.getAttribute("href");
    var hreflang = lien.getAttribute("hreflang");
    var rel = lien.getAttribute("rel");
    var target = lien.getAttribute("target");
    var type = lien.getAttribute("type");

    alert("href : " + href);
    alert("hreflang : " + hreflang);
    alert("rel : " + rel);
    alert("target : " + target);
    alert("type : " + type);
}

// Ajouter un gestionnaire d'événements au bouton
var bouton = document.getElementById("boutonAttributs");
bouton.addEventListener("click", afficherAttributs);