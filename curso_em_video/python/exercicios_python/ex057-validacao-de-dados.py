while True:
    pessoa = str(input("Digite seu sexo: [M/F] ")).strip() # corta espaços vazios na frente e atrás da string
    if pessoa in "Mm": # se eu usar o "in" posso colocar as opções maiusculo e minusculo
        print(f"Obrigado, dados confirmados.")
        break
    elif pessoa in "Ff":
        print("Obrigado, dados confirmados.")
        break
    elif pessoa != "Ff" or pessoa != "Mm":
        print("Dados incorretos, tente novamente.")