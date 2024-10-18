print(57 * "-")
primeiro_termo = int(input("Digite o primeiro termo da progressão aritimética: "))
print(57 * "-")
razao = int(input("Digite a razão da PA: "))
contador = 0
print(57 * "-")
print(f"Os 10 primeiros termos da PA de {primeiro_termo} com a razão de {razao} é:")
while contador < 10:
    primeiro_termo += razao
    print(primeiro_termo, "→",end=" ")
    contador += 1

print("PAUSA")
while True:
    print(57 * "-")
    print("Quer ver mais termos? Digite a quantidade.")
    print("Se quiser sair digite zero.")
    mais_termos = int(input("Digite aqui: "))
    if mais_termos == 0:
        print(f"Progressão finalizada com {contador} termos. Obrigado!!!")
        exit()
    else:
        while mais_termos > 0:
            primeiro_termo += razao
            print(primeiro_termo, "→",end=" ")
            mais_termos -= 1
        print("PAUSA")


