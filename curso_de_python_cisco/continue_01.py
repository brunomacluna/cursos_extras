user_word = input("Digite uma palavra: ")
user_word = user_word.upper()

word_without_vowels = ""

vogais = ["A", "E", "I", "O", "U"]

for letra in user_word:
    if letra in vogais:
        continue
    else:
        word_without_vowels += letra
print(word_without_vowels)        
