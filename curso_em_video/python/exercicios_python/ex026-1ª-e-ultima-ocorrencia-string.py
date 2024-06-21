frase = str(input("No que você está pensando? ")).upper().strip() # upper deixa toda a string maiuscula
print(f"A letra A aparece {frase.count("A")} vezes na frase.") # count conta letras ou elementos
print(f"A primeira letra A apareceu na posição {frase.find("A")+1}")  
print(f"A última letra A está na posição {frase.rfind("A")+1}")