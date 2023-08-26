class Fila:
    def __init__(self):
        self.dados = []

    def insere(self, x):
        self.dados.append(x)

    def retira(self):
        return self.dados.pop(0)


f = Fila()
f.insere(10)
f.insere(20)
print(f.retira())
