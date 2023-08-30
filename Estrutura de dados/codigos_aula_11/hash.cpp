#include <iostream>
#include "hash.h"

using namespace std;

int Hash::FuncaoHash(Aluno aluno)
{
    return (aluno.obterRa() % max_posicoes);
}

Hash::Hash(int tam_vetor, int max)
{
    quant_itens = 0;
    max_itens = max;
    max_posicoes = tam_vetor;
    estrutura = new Aluno[tam_vetor];
}

Hash::~Hash()
{

}

bool Hash::estaCheio()
{

}

int Hash::obterTamanhoAtual()
{

}

void Hash::inserir(Aluno aluno)
{

}

void Hash::deletar(Aluno aluno)
{}

void Hash::buscar(Aluno& aluno, bool& busca)
{

}

void Hash::imprimir()
{

}