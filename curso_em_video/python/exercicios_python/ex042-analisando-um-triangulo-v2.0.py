a = float(input("Digite o primeiro segmento: "))
b = float(input("Digite o segundo segmento: "))
c = float(input("Digite o terceiro segmento: "))
if a + b > c and a + c > b and b + c > a:
    print("Pode-se formar um triâgulo ", end="")
    if a == b and b == c:
        print("Equilátero.")
    elif a != b and b != c and c != a:
        print("Escaleno.")
    else:
        print("Isósceles.")
else:
    print("Não se pode formar um triângulo.")
    


    
  