print(57 * "-")
primeiro_termo = int(input("Digite o primeiro termo da progressão aritimética: "))
print(57 * "-")
razao = int(input("Digite a razão da PA: "))
contador = 0
print(57 * "-")
print(f"Os 10 primeiros termos da PA de {primeiro_termo} com a razão de {razao} é:")
while contador < 10:
    print(primeiro_termo, "=>", end=" ")
    primeiro_termo += razao
    contador += 1
   
print("FIM")
