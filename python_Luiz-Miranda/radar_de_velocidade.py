while True:
    velocidade_carro_str = input("Digite a velocidade do veículo: ")
    local_carro_str = input("Digite o km da estrada onde o carro esta: ")

    try:
        velocidade_carro = int(velocidade_carro_str)
        local_carro = int(local_carro_str)
        break
    except:
        print("Por favor, digite apenas números.")

RADAR_1 = 60
LOCAL_1 = 100
RADAR_RANGE = 1

carro_acima_da_velocidade = velocidade_carro > RADAR_1
carro_no_range_do_radar = local_carro >= (LOCAL_1 - RADAR_RANGE) and local_carro <= (LOCAL_1 + RADAR_RANGE)

if carro_acima_da_velocidade and carro_no_range_do_radar:
    print("Carro MULTADO no radar 1.")
else:
    print("SEM multas no radar 1.")
    
