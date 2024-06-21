a  = input("Digite algo: ")
print("O tipo primitivo é: ",type(a)) # qual é o tipo
print("Só tem espaços? ", a.isspace()) # isspace verifica se há somente espaços em branco
print("É númerico? ", a.isnumeric()) # isnumeric verifica se é númerico
print("É alfabético? ", a.isalpha()) # isalpha verifica se é alfabetico
print("É alfanúmerico? ", a.isalnum()) # isalnum verifica se é alfanumerico
print("Só tem letras maiúsculas? ", a.isupper()) # upper se só tem maiusculas
print("Só tem letras minúsculas? ", a.islower()) # lower se só tem minusculas
print("É imprimivél? ", a.isprintable()) # isprintable se pode imprimir
print("Está capitalizada? ", a.istitle()) # istitle verifica se contem letra maiuscula no começo e minusculas nas restantes