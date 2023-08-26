class Animal:
    'representa um animal'
    def __init__(self, especie, linguagem):
        self.especie = especie
        self.linguagem = linguagem

    def setEspecie(self, especie):
        'define a espécie do animal'
        self.esp = especie

    def setLinguagem(self, linguagem):
        'define a linguagem do animal'
        self.ling = linguagem

    def falar(self):
        ' exibe uma sentença pelo animal'
        print(f'Eu sou um {self.especie} e sei {self.linguagem}')

snoopy = Animal('cão', 'latir')
snoopy.falar()