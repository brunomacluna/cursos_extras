from time import sleep
n = int(input("Digite um número: "))
c = 0
print("CALCULANDO!")
sleep(1)
print(11 * "=")
for c in range(0, 10):
    t = n * c
    print(f"{n} x {c} = {t}")
    sleep(1)
    print(11 * "=")
    