nome = str(input("Digite seu nome completo: ")).strip()
print("Veja seu nome em letras maiúsculas: ", nome.upper())
print("Veja seu nome em letras minúsculas: ",nome.lower())
nome_sem_espacos = nome.replace(" ", "") # ou => nome_sem_espacos = len(nome) - nome.count(" ")
total_letras = len(nome_sem_espacos) # len conta os caracteres 
print(f"Há um total de {total_letras} letras.")
primeiro_nome = nome.split()[0]
letras_primeiro = len(primeiro_nome)
print(f"O 1º nome tem {letras_primeiro} letras.")
