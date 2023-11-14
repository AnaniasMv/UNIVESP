package Account;

public class Account {
	private String name; //variavel de instancia
	
	//o construtor inicializa name com nome do parametro
	public Account(String name) { //o nome do construtor é nome da classe
	this.name = name;
	}
		
	
	//método para definir o nome do obj
	public void setName(String name) {
		this.name = name; //armazena o nome
	}
	
	//método para recuperar o nome do obj
	public String getName() {
		return name; //retorna o valor do nome para o chamador
	}
}