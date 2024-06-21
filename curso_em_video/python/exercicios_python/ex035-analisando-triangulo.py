a = float(input("Digite o primeiro segmento: "))
b = float(input("Digite o segundo segmento: "))
c = float(input("Digite o terceiro segmento: "))
if a + b > c and a + c > b and b + c > a:
    print("Pode-se formar um triângulo.")
else:
    print("Não se pode formar um triângulo.")