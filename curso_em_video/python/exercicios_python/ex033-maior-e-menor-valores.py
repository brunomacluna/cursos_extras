a = int(input("Digite o primeiro número: "))
b = int(input("Digite o segundo número: "))
c = int(input("Digite o terceiro número: "))
menor = a # aqui já foi atribuido valor de "a" a variável, sendo assim se elimina uma linha de condição if
if b < a and b < c:
    menor = b
if c < a and c < b:
    menor = c
maior = b # idem
if a > b and a > c:
    maior = a
if c > a and c > b:
    maior = c
print(f"O número maior é {maior} e o menor é {menor}.")

