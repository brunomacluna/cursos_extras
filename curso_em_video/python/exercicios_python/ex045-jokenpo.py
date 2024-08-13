from random import choice

lista = ["pedra","papel","tesoura"]

print("Bem vindo a mais uma partida de Jokenpô!")

while True:
    jogador = str(input("Digite: pedra, papel ou tesoura: "))
    computador = choice(lista)

    if jogador == "pedra" and computador == "pedra":
        print(f"Jogador({jogador}) x Computador({computador}). Empate, bora outra.")
    elif jogador == "papel" and computador == "papel":
        print(f"Jogador({jogador}) x Computador({computador}). Empate, bora outra.")
    elif jogador == "tesoura" and computador == "tesoura":
        print(f"Jogador({jogador}) x Computador({computador}). Empate, bora outra.")
    elif jogador == "pedra" and computador == "tesoura":
        print(f"Jogador({jogador}) x Computador({computador}). Ganhou! Miseravél.")
    elif jogador == "papel" and computador == "pedra":
        print(f"Jogador({jogador}) x Computador({computador}). Ganhou! Miseravél.")
    elif jogador == "tesoura" and computador == "papel":
        print(f"Jogador({jogador}) x Computador({computador}). Ganhou! Miseravél.")
    elif jogador == "pedra" and computador == "papel":
        print(f"Jogador({jogador}) x Computador({computador}). Ganhei! Chupa essa manga.")
    elif jogador == "papel" and computador == "tesoura":
        print(f"Jogador({jogador}) x Computador({computador}). Ganhei! Chupa essa manga.")
    elif jogador == "tesoura" and computador == "pedra":
        print(f"Jogador({jogador}) x Computador({computador}). Ganhei! Chupa essa manga.")

    jogar_novamente = str(input("Deseja jogar novamente? (s/n): "))
    if jogar_novamente.lower() != "s":
        break
print("Obrigado pelo jogo!")

