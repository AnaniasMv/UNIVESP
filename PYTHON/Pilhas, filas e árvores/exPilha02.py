class Pilha:
    def __init__(self):
        self.dados = []

    def empilha(self, elemento):
        self.dados.append(elemento)

    def desempilha(self):
        if len(self.dados) > 0:
            return self.dados.pop(-1)




p = Pilha()
p.empilha(10)
p.empilha(20)
p.empilha(30)
p.empilha(40)
print(p.desempilha())
print(p.desempilha())
print(p.desempilha())
print(p.desempilha())