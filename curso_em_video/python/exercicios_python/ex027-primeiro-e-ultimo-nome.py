nome = str(input("Digite seu nome completo: ")).strip() # strip elimina os espaços vazios desnecessários
separa = nome.split() # split separa a string em palavras e numera começando pelo 0
print(f"Seu 1º nome é {separa[0]}")
print(f"Seu último nome é {separa[len(separa)-1]}")