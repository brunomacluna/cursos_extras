import os

lista = [123, True, "indice 2", 1.6, [], False] # cria uma lista
print("Exibindo a lista: ", lista)
print("Exibindo o indice 2: ", lista[2]) # imprime o elemento da lista de acordo com o indice
lista.append("adicionado com append") #adiciona um elemento no final da lista
print("adicionando com append: ", lista)
del lista[2] #apaga o elemento correspondente ao indice
print("Apangando o indice 2: ", lista)
lista.pop() # remove o último elemento da lista
print("Removendo o último elemento da lista: ", lista)
# lista.clear() limpa a lista inteira
lista.insert(0, "inserido com insert") # insere elemento com dois argumento, indice e valor
print("Inserindo com insert: ", lista)

lista_a = [1, 2, 3]
lista_b = [4, 5, 6]
lista_c = lista_a + lista_b # concatena duas listas
lista_d = lista_a.extend(lista_b) # extend não retorna nada, portando está alterando a lista_a
print(lista_c)
print(lista_d)
print(lista_a)

lista_e = lista_a.copy() # para copiar de fato uma lista
print(lista_e)