
var part1 = document.createElement("div");
part1.id = "part1";

var strong = document.createElement("strong");
strong.textContent = "Talan Academy";

var anchor = document.createElement("a");
anchor.href = "https://talan.com";
anchor.textContent = "Talan";

var textNode1 = document.createTextNode(" est une école de reconversion interne à ");
var textNode2 = document.createTextNode(", qui propose une formation professionnalisante basée sur une pédagogie innovante.");

part1.appendChild(strong);
part1.appendChild(textNode1);
part1.appendChild(anchor);
part1.appendChild(textNode2);

var part2 = document.createElement("div");
part2.id = "part2";

var p = document.createElement("p");
p.textContent = "Les cursus proposés :";

var ul = document.createElement("ul");

var courses = ["Java", "PHP", "Test et validation"];
for (var i = 0; i < courses.length; i++) {
    var li = document.createElement("li");
    li.textContent = courses[i];
    ul.appendChild(li);
}

part2.appendChild(p);
part2.appendChild(ul);


var body = document.body;
body.appendChild(part1);
body.appendChild(part2);