from datetime import date # Importa a data atual da máquina
ano = int(input("Que ano você quer analisar? Coloque zero para data atual: "))
if ano == 0:
    ano = date.today().year
if ano % 4 == 0 and ano % 100 != 0 or ano % 400 == 0:
    print(f"O ano de {ano} é bissesto.")
else:
    print(f"O ano de {ano} não é bissesto.")

