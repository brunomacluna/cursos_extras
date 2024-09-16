from datetime import date # importa especificamente a data de hoje
ano_atual = date.today().year
maior = 0
menor = 0
for i in range(1, 8):
    ano = int(input(f"{i}º pessoa, digite em que ano você nasceu: "))
    if (ano_atual - ano) < 21:
        menor += 1
    else:
        maior += 1
print(f"Temos {menor} menores de idade e {maior} maiores de idade.")
