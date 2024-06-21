# ALTERNATIVA 1
# import math
# co = float(input("Digite o cateto oposto: "))
# ca = float(input("Digite o cateto adjacente: "))
# hipoQuadrado = math.pow(co, 2) + math.pow(ca, 2)
# hipo = math.sqrt(hipoQuadrado)
# print(f"Se o cateto oposto for {co} e o cateto adjancete for {ca}. \nA hipotenusa será {hipo:.2f}.")
# ====> ALTERNATIVA 2 - hipo = (co ** 2 + ca ** 2) ** (1/2) ===> elimino uma variavél


from math import hypot # função para calculo da hipotenusa
co = float(input("Digite o cateto oposto: "))
ca = float(input("Digite o cateto adjacente: "))
hipo = hypot(co, ca)
print(f"Se o cateto oposto for {co} e o cateto adjancete for {ca}. \nA hipotenusa será {hipo:.2f}.")