from random import randint
from time import sleep

contador = 1
cor_preto = '\033[30m'
cor_amarelo = '\033[33m'
cor_ciano = '\033[36m'
cor_azul = '\033[34m'
cor_vermelho = '\033[31m'
fundo_azul = '\033[44m'
fundo_vermelho = '\033[41m'
fundo_ciano = '\033[46m'
resetar_cor = '\033[0m'

print(f"{fundo_vermelho}")
print(19 * "=*")
print("ESTOU PENSANDO EM UM NÚMERO! HA HA HA")
print(19 * "=*")
print(f"{resetar_cor}")
sleep(1)
print(f"{cor_azul}")
print(">>>>>>>>>>Escolha de 0 a 10<<<<<<<<<<")
print(f"{resetar_cor}")
sleep(1)
numero_escolhido = randint(0,10)


while True:
    chute = int(input(f"{cor_amarelo}Qual é o seu palpite? {resetar_cor}"))
    if chute == numero_escolhido:
        print(f"{fundo_azul}Você acertouuuuu, parabénssss coleguinha!!!{resetar_cor}")
        print(f"O número que eu escolhi foi {numero_escolhido}")
        print(f"{fundo_ciano}Você só precisou de {contador} tentativas para acertar!!!{resetar_cor}")
        
        break
    else:
        contador += 1
        if chute < numero_escolhido:
            print("Humm, é maior!!! Tente novamente!!!")
        elif chute > numero_escolhido:
            print("Humm, é menor!!! Tente novamente!!!")