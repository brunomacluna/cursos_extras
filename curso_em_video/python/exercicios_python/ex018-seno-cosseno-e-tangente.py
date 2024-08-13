from math import radians, sin, cos, tan # math é matematica, aqui só importou as funções para seno, coseno e tangente
angulo = float(input("Qual é o ângulo? "))
seno = sin(radians(angulo))
cosseno = cos(radians(angulo))
tangente = tan(radians(angulo))
print(f"O seno é {seno:.2f}, o cosseno é {cosseno:.2f} e a tangente é {tangente:.2f}.")