def contagem(s):
    if len(s) == 0:
        return 0
    return len(s[0]) + contagem(s[1:])

txt = ['hoje', [['é', 'dia', 'de', 'prova']], 'eu', [['vou', 'me', 'sair']], ['bem']]

print(contagem(txt))
