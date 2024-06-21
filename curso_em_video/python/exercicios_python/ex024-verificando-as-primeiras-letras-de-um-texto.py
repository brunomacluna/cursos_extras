cidade = str(input("Em qual cidade você nasceu? ")).strip()
cidade_min = cidade.lower() # lower coloca toda a string em minusculo
if cidade_min[0:8] == "brasilia": # [0:8] isso significa que vai pegar da 1ª letra e vai ate a 7ª, começa no zero
    print(f"Eu nasci nessa maravilhosa cidade!!!")
else:
    print(f"Eu não nasci nesta cidade.")
