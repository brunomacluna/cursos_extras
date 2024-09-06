let contador = 0
let input = document.getElementById("inputTarefa");
let = btnAdd = document.getElementById("btn-add");
let = main = document.getElementById("areaLista");

function addTarefa() {
    // pegar o valor digitado no input
    let valorInput = input.value;

    // se não for vazio, nem nulo e nem indefinido
    if ((valorInput !== "") && (valorInput !== null) && (valorInput !== undefined)) {
       
       // adicionar +1 no contador
       ++contador;
       
        let novoItem = ` <div id="${contador}" class="item">
            <div onclick="marcarTarefa(${contador})" class="item-icone">
                <i id="icone_${contador}" class="far fa-circle"></i>
            </div>
            <div onclick="marcarTarefa(${contador})" class="item-nome">
                ${valorInput}
            </div>
            <div class="item-botao">
                <button onclick="deletar(${contador})" class="delete"><i class="fas fa-trash"></i> Deletar</button>
            </div>`;
            // acicionar novo item no main
            main.innerHTML += novoItem;

            // zerar os campinhos
            input.value = "";
            input.focus();
    }
}

function deletar(id) {
    var tarefa = document.getElementById(id);
    tarefa.remove();
}

function marcarTarefa(id) {
    var item = document.getElementById(id);
    var classe = item.getAttribute('class');

    if (classe == "item") {
        item.classList.add('clicado');

        var icone = document.getElementById('icone_' + id);
        icone.classList.remove('far', 'fa-circle');
        icone.classList.add('fas', 'fa-check-circle');
        
        item.parentNode.appendChild(item);

    } else {
        item.classList.remove('clicado');

        var icone = document.getElementById('icone_' + id);
        icone.classList.remove('fas', 'fa-check-circle');
        icone.classList.add('far', 'fa-circle');
    }

}

input.addEventListener("keyup", function(event) {
    // se teclou enter (13)
    if (event.keyCode === 13) {
        event.preventDefault();
        btnAdd.click();
    }
})