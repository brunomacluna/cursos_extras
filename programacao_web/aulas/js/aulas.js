function eventoClick() {
   // alert("Acionou um evento de clique");
    document.body.style.backgroundColor = "yellow";
}

function viraVermelho() {
    let div = document.getElementById("teste");
    div.style.backgroundColor = "red";
}

function viraAzul() {
    let div = document.getElementById("teste");
    div.style.backgroundColor = "blue";
}

function adicionaTexto() {
    let p = document.getElementById("texto");
    p.append("O mouse moveu<br>");
}

function limpaTexto() {
    document.getElementById("campoTexto").value = "";
}

const pessoa = ["Bruno", "Machado Luna", 43, "Desenvolvedor"];
// pessoa.pop(); retira o útilmo intem da lista
// pessoa.push("Trader"); adiciona um elemento no fianl da lista
pessoa.splice(2,0,"Item 1", "Item 2");

document.getElementById("teste").innerHTML = pessoa.join(" - ");
