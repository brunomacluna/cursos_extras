from random import shuffle # shuffle coloca em ordem aleatoria uma lista
n1 = input("1º Nome: ")
n2 = input("2º Nome: ")
n3 = input("3º Nome: ")
n4 = input("4º Nome: ")
lista = [n1, n2, n3, n4]
shuffle(lista)
print("A ordem de apresentação será: ")
print(lista)