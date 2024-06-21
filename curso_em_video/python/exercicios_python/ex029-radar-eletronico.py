velocidade = float(input("Digite a velocidade: "))
multa = (velocidade - 80) * 7
if velocidade > 80:
    print(f"Você ultrapassou os limites da via, será multado em R${multa:.2f}.\nDirija com cuidado.")
print("Boa viagem! Dirija com cuidado.")    