def funcao(X):
    if X == 1:
        return 1
    else:
        return X + funcao(X - 2)

X = int(input('Valor X = '))
print('Resultado =', funcao(X))