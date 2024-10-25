// Função para buscar os produtos da API do Mercado Livre
function buscarProdutos(query) {
    if (!query) {
        alert('Termo de busca não informado');
        return;
    }

    // Faz a requisição para a API
    fetch(`https://api.mercadolibre.com/sites/MLB/search?q=${query}`)
        .then(response => response.json())
        .then(data => {
            const produtos = data.results;
            renderizarProdutos(produtos); // Chama a função para renderizar os produtos
        })
        .catch(error => console.error('Erro ao buscar os produtos:', error));
}

// Função para renderizar os produtos na tela
function renderizarProdutos(produtos) {
    const container = document.getElementById('produtos-container');
    container.innerHTML = ''; // Limpa o conteúdo anterior

    produtos.forEach(produto => {
        const produtoDiv = document.createElement('div');
        produtoDiv.classList.add('produto');

        const titulo = document.createElement('h2');
        titulo.innerText = produto.title;

        const imagem = document.createElement('img');
        imagem.src = produto.thumbnail;
        imagem.alt = produto.title;

        const preco = document.createElement('p');
        preco.innerText = `R$ ${produto.price.toFixed(2)}`;

        const botaoAdicionar = document.createElement('button');
        botaoAdicionar.innerText = 'Adicionar ao Carrinho';
        botaoAdicionar.classList.add('btn-adicionar');

        produtoDiv.appendChild(titulo);
        produtoDiv.appendChild(imagem);
        produtoDiv.appendChild(preco);
        produtoDiv.appendChild(botaoAdicionar);

        container.appendChild(produtoDiv);
    });
}

// Função para lidar com o evento de clique no botão de pesquisa
function iniciarPesquisa() {
    const campoPesquisa = document.getElementById('campo-pesquisa');
    const termoPesquisa = campoPesquisa.value.trim();
    buscarProdutos(termoPesquisa); // Chama a função de busca com o termo digitado
}

// Adiciona o evento de clique ao botão de pesquisa
document.addEventListener('DOMContentLoaded', () => {
    const botaoPesquisar = document.getElementById('botao-pesquisar');
    botaoPesquisar.addEventListener('click', iniciarPesquisa);
});
