frase = str(input("Digite uma frase: ")).strip() # retira espaços no começo e final da string
frase_invertida = frase[::-1]
frase = frase.upper() # tudo maiusculo
frase_sem_espaco = frase.replace(" ", "") # com esses argumentos, retira os espaços entre as strings
frase_invertida_sem_espaço = frase_sem_espaco[::-1] # [::-1] é o slice, está invertendo a string

if frase_sem_espaco == frase_invertida_sem_espaço:
    print(frase_sem_espaco)
    print(frase_invertida_sem_espaço)
    print("É um palíndromo.")
else:
    print(frase_sem_espaco)
    print(frase_invertida_sem_espaço)
    print("Não é um palíndromo.")











