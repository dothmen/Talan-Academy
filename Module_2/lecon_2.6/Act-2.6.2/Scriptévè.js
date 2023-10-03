
function loadXML() {
    var xhttp = new XMLHttpRequest();
    var url = "http://localhost/wamp/Mon évènement.xml"; 
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            parseXML(this);
        }
    };
    xhttp.open("GET", url, true);
    xhttp.send();
}


function parseXML(xml) {
    var xmlDoc = xml.responseXML;
    var eventNames = xmlDoc.getElementsByTagName("titre");
    var output = "";

    for (var i = 0; i < eventNames.length; i++) {
        output += eventNames[i].textContent + "<br>";
    }

    document.getElementById("eventNames").innerHTML = output;
}

loadXML();
