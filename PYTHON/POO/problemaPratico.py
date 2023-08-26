'''Problema Prático 8.3

Implemente a classe Retângulo, que representa retângulos. A classe deverá
implementar estes métodos:

•setTamanho(largura, comprimento): aceita dois valores numéricos como entrada
e define o comprimento e largura do retângulo.

•perímetro(): retorna o perímetro do retângulo.

•área(): retorna a área do retângulo.
'''

class Retangulo:
    'representa retangulos'
    def __init__(self, largura, comprimento):
        """Metodo construtor"""
        self.largura = largura
        self.comprimento = comprimento

    def calculaPerimetro(self):
        """Calcula o perimetro"""
        return 2 * (self.largura + self.comprimento)

    def calculaArea(self):
        """Calcula a area"""
        return self.largura * self.comprimento

    def setTamanho(self, largura, comprimento):
        """Este metodo serve para o usuario alterar
         a largura e o comprimento do retangulo"""
        self.largura = largura
        self.comprimento = comprimento

retangulo = Retangulo(3, 4)

