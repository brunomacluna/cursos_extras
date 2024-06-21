user_word = input("Digite uma palavra: ")
user_word = user_word.upper()

vogais = ["A", "E", "I", "O", "U"]

for letra in user_word:
    if letra in vogais:
        continue
    else:
        print(letra)
