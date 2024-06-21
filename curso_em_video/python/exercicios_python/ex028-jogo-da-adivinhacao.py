from random import randint # importa somente a função randint que é para números inteiros
from time import sleep # importa somente a função sleep que é para esperar um tempo, dar um efeito
numero_escolhido = randint(0, 5) # entre parenteses ficam as opções desejadas
print("\033[1;33;41m=-=\033[m" * 13) # firula de enfeite
print("\033[1;31;43mEstou pensando em um número, ha ha ha \033[m")
print("\033[1;33;41m=-=\033[m" * 13)
sleep(3) # posso usar para dar um suspense
chute = int(input("\033[1;33mQual o seu palpite: \033[m"))
print("\033[7mPROCESSANDO...\033[m")
sleep(3)
print(f"\033[1;32mO número que eu pensei foi {numero_escolhido}.\033[m")
if chute == numero_escolhido:
    print("\033[1;30;44mAcertou miseravel !!!\033[m")
else:
    print("\033[1;30;44mVocê perdeu! ha ha ha ha\033[m")