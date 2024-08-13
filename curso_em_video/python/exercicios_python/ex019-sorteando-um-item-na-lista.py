from random import choice #choice vai sortear um elemento de forma randomica
# nomes = ("Valciley", "Cornison", "Estranhoval", "Chico Santo")
# nome_sorteado = random.choice(nomes)
# print(f"O sorteado foi o {nome_sorteado}. Parábens!")
n1 = input("Nome: ")
n2 = input("Nome: ")
n3 = input("Nome: ")
n4 = input("Nome: ")
lista = [n1, n2, n3, n4]
escolhido = choice(lista)
print(f"O sorteado foi o {escolhido}. Parábens!")