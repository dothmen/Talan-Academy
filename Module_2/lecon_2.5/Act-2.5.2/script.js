
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


var bouton = document.getElementById("boutonAttributs");
bouton.addEventListener("click", afficherAttributs);