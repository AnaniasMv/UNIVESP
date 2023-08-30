#include "aluno.h"

class Hash{
    private:
    int FuncaoHash(Aluno aluno);
    int max_itens; /*maximo de itens que podem ser colocados (nem todas as posicoes podem ser ocupadas)*/
    int max_posicoes; /*maximo de posicoes do vetor*/
    int quant_itens; /*quantos itens ja foram colocados no vetor*/
    Aluno* estrutura; /*vetor onde vai guardar a hash, elementos da classe aluno*/

    public:
    Hash(int tam_vetor, int max); /*Construtor*/
    ~Hash(); /*Destrutor*/
    bool estaCheio();
    int obterTamanhoAtual();
    void inserir(Aluno aluno);
    void deletar(Aluno aluno);
    void buscar(Aluno& aluno, bool& busca);
    void imprimir();
};