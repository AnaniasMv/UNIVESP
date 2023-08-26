class Funcionario:
    def __init__(self, nome, data_de_admissao, salario):
        self.nome = nome
        self. data_de_admissao = data_de_admissao
        self.salario = salario

    def __str__(self):
        return f"{self.nome} ({self.data_de_admissao}): R${self.salario:.2f}"


class Gerente(Funcionario):
    def __init__(self, nome, data_de_admissao, salario, bonus):
        super().__init__(nome, data_de_admissao, salario)
        self.bonus = bonus

    def __str__(self):
        return f"{super().__str__()} + R${self.bonus:.2f} de bônus"


joao = Funcionario("João", "01/01/2022", 5000)
maria = Gerente("Maria", "01/01/2022", 6000, 1000)

print(joao)  # Exibe: João (01/01/2022): R$5000.00
print(maria)  # Exibe: Maria (01/01/2022): R$6000.00 + R$1000.00 de bônus
