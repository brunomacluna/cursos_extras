cor_verde = '\033[32m'
cor_magenta = '\033[35m'
cor_vermelho = '\033[31m'
cor_azul = '\033[34m'
resetar_cor = '\033[0m'

print(f"{cor_azul}{40 * "="}{resetar_cor}")
print("Calcule o seu Indice de Massa Corporal.")
print(f"{cor_azul}{40 * "="}{resetar_cor}")
peso = float(input("Digite seu peso: (kg) "))
print(f"{cor_azul}{40 * "="}{resetar_cor}")
altura = float(input("Digite sua altura: (m) "))

imc = peso / (altura ** 2)

if imc < 18.5:
    print(f"{cor_azul}{40 * "="}{resetar_cor}")
    print(f"{cor_vermelho}{imc:.2f} {"= Perigo, abaixo do peso."}{resetar_cor}")
    print(f"{cor_azul}{40 * "="}{resetar_cor}")
elif imc >= 18.5 and imc < 25:
    print(f"{cor_azul}{40 * "="}{resetar_cor}")
    print(f"{cor_verde}{imc:.2f} {"= Peso normal."}{resetar_cor}")
    print(f"{cor_azul}{40 * "="}{resetar_cor}")
elif imc >= 25 and imc < 30:
    print(f"{cor_azul}{40 * "="}{resetar_cor}")
    print(f"{cor_magenta}{imc:.2f} {"= Cuidado, sobrepeso."}{resetar_cor}")
    print(f"{cor_azul}{40 * "="}{resetar_cor}")
elif imc >=30 and imc < 40:
    print(f"{cor_azul}{40 * "="}{resetar_cor}")
    print(f"{cor_vermelho}{imc:.2f} {"= Perigo, obesidade."}{resetar_cor}")
    print(f"{cor_azul}{40 * "="}{resetar_cor}")
elif imc >= 40:
    print(f"{cor_azul}{40 * "="}{resetar_cor}")
    print(f"{cor_vermelho}{imc:.2f} {"= Urgente, obesidade morbida."}{resetar_cor}")
    print(f"{cor_azul}{40 * "="}{resetar_cor}")