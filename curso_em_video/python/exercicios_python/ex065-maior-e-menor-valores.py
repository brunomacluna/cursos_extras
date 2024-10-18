lista = []
soma = 0
contador = 0
while True:
    print(40 * "~")
    numero = int(input("Digite o número: "))
    print(40 * "-")
    lista.append(numero)
    soma += numero
    contador += 1
    condicao = str(input(f"Deseja inserir mais números? [S] ou [N] ")).upper().strip()
    
    if condicao == "N":
        break

maior_numero = max(lista)
menor_numero = min(lista)

media = soma / contador

print(40 * "~")
print(f"Você digitou {contador} números.")
print(40 * "-")
print(f"A média dos valores é {media:.2f}")
print(40 * "~")
print(f"O maior número inserido foi {maior_numero}")
print(40 * "-")
print(f"O menor número inserido foi {menor_numero}")