package Account;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		//cria dois objetos Account
		Account account1 = new Account("Matheus");
		Account account2 = new Account("Débora");
		
		//exibe o valor inicial de nome para cada Account
		System.out.printf("Conta 1 tem o nome :%s%n ", account1.getName());
		System.out.printf("Conta 2 tem o nome: %s%n ", account2.getName());
		
		//cria um objeto Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		//cria um objeto Account e o atribui a myAccount
		//Account myAccount = new Account();
		
		//solicita e lê o nome
		//System.out.println("Por favor insira seu nome:");
		
		String theName = input.nextLine(); //lê o nome do usuario
		
		//myAccount.setName(theName); //insere theName em myAccount (insere o nome digitado em myAccount)
		
		System.out.println(); //gera saidade uma linha em branco
		
		//exibe o nome armazenado no objeto myAccount
		//System.out.printf("Nome é: %n%s%n", myAccount.getName());
	}
}
