/* Objetos (É uma espécie de variável com vários atributos e métodos, sendo os métodos uma espécie de função. )
const carro = {
    marca: "Chevrolet",
    modelo: "Cobalt 1.4 LTZ ",
    ano: 2014,
    palca: "OZZ-6J31",
    buzina: function () {alert("Biiiiiiiiiiiiiii")},
    completo: function () {
        return "A marca é "+this.marca+" e o modelo é: "+this.modelo;
    }
};
carro.buzina();
console.log(carro);
console.log(carro.ano);
console.log(carro.completo());
*/
 
/* Funções (chama uma tarefa pre-deterninada para seu código)
function soma(valor1, valor2) {
   return valor1 + valor2
}
document.getElementById("texto").innerHTML = soma(10, 50);
*/

/* Variáveis
let, var e const
*/

/* EVENTOS
onclick - Disparedo quando recebe um click
ondblclick - disparado quando clique duplo
onmouseover - diparado quando o mouse está sobre
onmouseout - disparado quando o mouse é movido para fora do elemento
onmousemove - disparado quando o mouse é movido no elemento.
onmousedown - disparado quando o clique do botão foi pressionado
onmouseseup - disparado quando o clique do botão é liberado
onfocus - disparado quando o elemento recebe o foco. Válido para input,
onchange - disparado quando existe uma mudança no conteudo. "Ao mudar".
onblur - disparado quando o elemento perde o focu.
onkeydown - disparado quando uma tecla é pressionada.
onkeypress - disparado quando uma tecla é pressionada e solta.
onkeyup - disparado quando uma tecla é solta sobre um elemento.
onload - disparado quando a página terminou de ser carregada. Body.
onresize - disparado quando há um redimencionamento da janela.
*/

/* Array ou vetor
const pessoa = ["Bruno", "Machado Luna", 43, "Desenvolvedor"];
pessoa.pop(); //retira o útilmo intem da lista
pessoa.push("Trader"); //adiciona um elemento no final da lista
pessoa.shift(); //remove o primeiro item da lista
pessoa.unshift(); //adiciona um item no inicio da lista
delete pessoa[0]; //deleta a posição indicada, mas não atualiza a matriz e fica indefinido aquele espaço
pessoa.splice(2,0,"Item 1", "Item 2"); //entre parenteses, o 2 indica a posição que o item será adicionado, o zero indica que não substituirá nada, se fosse 1 por exemplo, substituiria o primeiro item a direita. Item 1 e 2 são as adições.
*/

/* Concatenação de Arrays
const lista_1 = ["Arroz", "Feijão", "Macarrão"];
const lista_2 = ["Carne", "Frango", "Verduras"];
const superLista = lista_1.concat(lista_2);
*/

/* fatiar um Array 
const jogadores = ["Paulo Baier", "Baltazar", "Romario", "Ronaldinho"];
const craques = jogadores.slice(2); // irá retornar a partir da posição 2. 
Um segundo parametro dentro dos parenteses indica até onde irá fatiar.
jogadores.sort(); //deixa em ordem alfabética
jogadores.reverse(); //deixa em ordem desalfabética
numeros.sort(function (a, b){return a - b}); //no caso de ordem númerica devo usar essa função.
numeros.sort(function (a, b){return b - a}); // ordem decresente essa aqui.
*/

/* Pegar o maior número em um Array 
const numeros = [40, 100, 1, 5, 25, 10];

document.getElementById("teste").innerHTML = MaiorNumero(numeros);

function MaiorNumero(array) {
    return Math.max.apply(null, array);
}

// o menor número é o mesmo, mudando o nome da função e trocando max por min
*/

/* filtrar valores num Array
const numeros = [40, 100, 1, 5, 25, 10];
const maiorQUE20 = numeros.filter(filtragem);
document.getElementById("teste").innerHTML = maiorQUE20;
function filtragem(value, index, array) {
    return value > 20;
// Essa função irá filtrar todos os valores maiores que 20
}
*/

/*if e else
var interruptor = "on";

if (interrutor == "on") {
    alert("A lampada está ligada");
} else {
    alert("A lampada está desligada")
}
*/

/* Swith
É usado para realizar diferentes ações com base em diferentes condições no mesmo 
bloco de verificação. Caso a condição não seja compatível não será executada e o
valor padão será aciondo
switch (expressão) {
    case a:
        //o que acontece
        break;
    case b:
        //o que acontece
        break;
    case c:
        //o que acontece
        break;
    default:
    //o que acontece
}

*/

/* Laço de Repetição For
Oferecem um jeito fácil e rápido de executar uma ação repetidas vezes.
for (let i = 0; i < 1001; i++) {
    document.getElementById("teste").innerHTML += i + ", ";
}
*/

/* Classes //são como fabricas de objetos
class Carro {
    constructor(valor1, valor2, valor3) {
        this.marca = valor1;
        this.modelo = valor2;
        this.ano = valor3;
    }
    buzina() {                         // essa função dentro da classe é um método
    return this.modelo + "Biiiiiiiiiiiiiiii";
    }
}

const cobalt = new Carro("Chevrolet", "Cobalt", 2014); // posso criar vários modelos de carro assim.
console.log(cobalt);
*/

/* Manipular datas em Javascript

let data = new Date(); // objeto para pegar a data
let ano = data.getFullYear(); // função para pegar o ano
let mes_atual = data.getMonth(); // mes atual, de 0 até 11
let dia_mes = data.getDate(); // dia do mes
let dia_semana = data.getDay(); // dia da semana, de 0 a 6
let hora = data.getHours(); // horas de 0 até 23
let minutos = data.getMinutes(); // minutos de 0 a 59
let segundos = data.getSeconds(); // segundos de 0 a 59
let milisegundos = data.getMilliseconds(); // milisegundos
let data_BR = data.toLocaleDateString('pt-br'); // data no formato brasileiro // opcioanl ('pt-br', {dateStyle/; 'short' })

// comparação de datas
var hoje = new Date();
var vencimento = new Date(2024, 7, 15);
if (hoje > vencimento) {
    console.log("Sua conta está vencida.");
} else {
    console.log("Ainda não venceu, tudo certo.");
}

// difernça entre duas datas em dias
var data_inicial = new Date();
var data_final = new Date(2024, 7, 31);

var diferenca_tempo = data_final.getTime() - data_inicial.getTime();

var diferenca_dias = Math.ceil(diferenca_tempo / (24 * 60 * 60 * 1000));
console.log(diferenca_dias);
*/

/* JSON // Javascript Object Notation // Notação de objeto Javascript
JSON.parse() // converte testo no padrão JSON em objetos
JSON.stringify() // converte objetos em texto padrão JSON
*/
/* const ajax = new XMLHttpRequest();
ajax.open('GET','https://viacep.com.br/ws/70640038/json/');
ajax.send();

ajax.onload = function() {
    document.getElementById("texto").innerHTML = this.responseText;
    let obj = JSON.parse(this.responseText);
    alert(obj.logradouro);
} 

*/

function buscarCep() {
    let input = document.getElementById('cep').value;

    const ajax = new XMLHttpRequest();
    ajax.open('GET', 'http://viacep.com.br/ws/' + input + '/json/');
    ajax.send
}