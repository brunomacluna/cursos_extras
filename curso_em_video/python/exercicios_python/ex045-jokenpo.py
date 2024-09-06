from random import choice
from time import sleep

lista = ["pedra","papel","tesoura"]

print(f'{"Jokenpô!":=^50}')

while True:
    computador = choice(lista)
    jogador = str(input("Digite: pedra, papel ou tesoura: "))
    print(50 * "=")
    print("JO")
    sleep(1)
    print("KEN")
    sleep(1)
    print("PO")

    if jogador == "pedra" and computador == "pedra":
        print(f"Jogador = ({jogador})\nComputador = ({computador}).\nEmpate, vamos outra.")
        print(50 * "=")
    elif jogador == "papel" and computador == "papel":
        print(f"Jogador = ({jogador})\nComputador = ({computador}).\nEmpate, bora outra.")
        print(50 * "=")
    elif jogador == "tesoura" and computador == "tesoura":
        print(f"Jogador = ({jogador})\nComputador = ({computador}).\nEmpate, bora outra.")
        print(50 * "=")
    elif jogador == "pedra" and computador == "tesoura":
        print(f"Jogador = ({jogador})\nComputador= ({computador}).\nJogador Ganhou!")
        print(50 * "=")
    elif jogador == "papel" and computador == "pedra":
        print(f"Jogador = ({jogador})\nComputador = ({computador}).\nJogador Ganhou!")
        print(50 * "=")
    elif jogador == "tesoura" and computador == "papel":
        print(f"Jogador = ({jogador})\nComputador = ({computador}).\nJogador Ganhou!")
        print(50 * "=")
    elif jogador == "pedra" and computador == "papel":
        print(f"Jogador = ({jogador})\nComputador = ({computador}).\nComputador Ganhou!")
        print(50 * "=")
    elif jogador == "papel" and computador == "tesoura":
        print(f"Jogador = ({jogador})\nComputador = ({computador}).\nComputador Ganhou!")
        print(50 * "=")
    elif jogador == "tesoura" and computador == "pedra":
        print(f"Jogador = ({jogador})\nComputador = ({computador}).\nComputador Ganhou!")
        print(50 * "=")
    else:
        print("Jogada Inválida! Tente novamente.")

    jogar_novamente = str(input("Deseja jogar novamente? (s/n): "))
    if jogar_novamente.lower() != "s":
        break
print("Obrigado pelo jogo!")

