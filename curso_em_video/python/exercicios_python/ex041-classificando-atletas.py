from datetime import date
ano_atual = date.today().year
nascimento = int(input("Digite o ano que você nasceu: "))
idade = ano_atual - nascimento
if idade <= 9:
    print(f"Você tem {idade} anos e está na categoria Mirim.")
elif idade <= 14:
    print(f"Você tem {idade} anos e está na categoria Infantil.")
elif idade <= 19:
    print(f"Você tem {idade} anos e está na categoria Junior.")
elif idade <= 25:
    print(f"Você tem {idade} anos e está na categoria Sênior.")
else:
    print(f"Você tem {idade} anos e está na categoria Master.")
