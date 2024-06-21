nome = str(input("Digite seu nome completo: ")).strip() # strip elimina os espaços vazios desnecessários
sobrenome = "Silva"
sobre_nome = sobrenome.lower() # lower coloca toda a string em minusculo
if sobre_nome in nome:
    print("Temos o sobrenome Silva mais uma vez!")
else:
    print("É raro não ter, mas nesse caso não tem.")    

#nome = str(input("Digite seu Cavaleiro do Zodiaco preferido: "))
#print("É o Seya? {}".format("seya" in nome.lower()))