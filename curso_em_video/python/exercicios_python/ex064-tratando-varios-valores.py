contador = 0
soma = 0
while True:
    numero = int(input("Digite um número [999 para parar]: "))
    print(38 * "~")
    if numero == 999:
        break
    else:
        contador += 1
        soma += numero

print(f"O total de números digitados foram: {contador}")
print(38 * "~")
print(f"A soma de todos os números foi: {soma}")
print(38 * "~")
