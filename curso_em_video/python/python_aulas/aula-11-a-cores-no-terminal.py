# \033[ ; ; m aqui fica o que será pintado e fecha a coloração com \033[m
# parametros: none = 0, negrito = 1, sublinhado = 4, invertido = 7
# cores do texto: branco = 30, vermelho = 31, verde = 32, amarelo = 33, azul escuro = 34, roxo = 35, axul claro = 36, cinza = 37
# cores do background = idem, començando com 40 
print("\033[1;30;41mOlá, Mundo!\033[m")