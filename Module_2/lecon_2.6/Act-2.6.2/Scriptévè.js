// Fonction pour charger le fichier XML
function loadXML() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            parseXML(this);
        }
    };
    xhttp.open("GET", "Mon évènement.xml", true); // Remplacez "votre_fichier.xml" par le chemin vers votre fichier XML
    xhttp.send();
}

// Fonction pour parser le XML et afficher les noms des événements
function parseXML(xml) {
    var xmlDoc = xml.responseXML;
    var eventNames = xmlDoc.getElementsByTagName("titre");
    var output = "";

    for (var i = 0; i < eventNames.length; i++) {
        output += eventNames[i].childNodes[0].nodeValue + "<br>";
    }

    document.getElementById("eventNames").innerHTML = output;
}

// Appeler la fonction pour charger le XML
loadXML();