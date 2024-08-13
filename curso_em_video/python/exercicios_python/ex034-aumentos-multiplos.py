from time import sleep
sal = float(input("Digite o sálario: R$"))
if sal <= 1250:
    sal = sal + (sal * 15 / 100) 
if sal > 1250:
    sal = sal + (sal * 10 / 100) 
print("Calculando...")
sleep(3) 
print(f"O sálario atual é R${sal:.2f}")