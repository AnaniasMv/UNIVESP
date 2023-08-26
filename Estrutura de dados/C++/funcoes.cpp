#include <iostream>

using namespace std;

//variavel imutavel/ constante
#define pi 3.14; 

int somar(int x, int y){
    int soma = x+y;
    return soma;
}

int main(){
    int n1, n2;

    // Solicitar ao usuário para digitar os números
    cout << "Digite o primeiro número: ";
    cin >> n1;
    
    cout << "Digite o segundo número: ";
    cin >> n2;

    // Chamar a função somar e exibir o resultado
    cout << "Resultado: " << somar(n1, n2);
}