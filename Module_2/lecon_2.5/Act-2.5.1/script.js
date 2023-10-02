var couleurBlanc = true;

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

    couleurBlanc = !couleurBlanc;
}

setInterval(changerCouleur, 5000); 
