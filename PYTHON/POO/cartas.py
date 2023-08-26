class Queue:
    'uma classe de fila clássica'

    def __init__(self):
        'instancia uma lista vazia'

        self.q = []

    def isEmpty(self):
        'retorna True se a fila estiver vazia, False caso contrário'

        return (len(self.q) == 0)

    def enqueue(self, item):
        'Insere item no final da fila'

        return self.q.append(item)

    def dequeue(self):
        'remove e retorna item na frente da fila '

        return self.q.pop(0)

    def __repr__(self):
        'retorna representação de string canônica Ponto(x, y)'

        return 'Ponto({}, {})'.format(self.x, self.y)