var couleurBlanc = true; // Définit la couleur de fond initiale à blanc

function changerCouleur() {
    var corps = document.body;
    var texte = document.getElementById("text");

    if (couleurBlanc) {
        corps.style.backgroundColor = "black";
        texte.textContent = "nuit";
        texte.style.color = "white";
    } else {
        corps.style.backgroundColor = "white";
        texte.textContent = "jour";
        texte.style.color = "black";
    }

    couleurBlanc = !couleurBlanc; // Inverse la couleur de fond
}

setInterval(changerCouleur, 5000); // Changer la couleur toutes les 5 secondes
