# Definindo uma lista 
lista = ["Maria", "Joana", "Cida"]
# Criando um objeto 'range' que gera uma sequência de números inteiros de 0 até o comprimento da lista - 1.
# A função len(lista) retorna o número de elementos na lista
# Portanto, range(len(lista)) é equivalente a range(3), que gera os números 0, 1 e 2.
indices = range(len(lista))
# Iniciando um loop 'for' que irá iterar sobre cada valor gerado pelo objeto 'range'.
# A variável 'indice' assumirá cada valor da sequência gerada por 'range' (0, 1, 2) em cada iteração.
for indice in indices:
    # Dentro do loop, estamos imprimindo o valor atual de 'indice' e o elemento correspondente na lista.
    # lista[indice] acessa o elemento da lista na posição especificada por 'indice'.
    # Por exemplo, na primeira iteração, indice = 0, então lista[0] retorna "Maria".
    print(indice, lista[indice])