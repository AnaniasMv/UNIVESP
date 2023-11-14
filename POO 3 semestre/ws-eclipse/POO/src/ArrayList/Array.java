package ArrayList;

import java.util.ArrayList; //importando a classe ArrayList do pacote java.util.

public class Array {

	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList();

		int i;

		for (i = 10; i <= 70; i = i + 10) {
			x.add(i);
		}

		mostrar(x);
		x.remove(1); // removendo o segundo item da lista "x"
		x.add(0, 55);
		mostrarII(x);
	}

	public static void mostrar(ArrayList<Integer> lista) { //Metodo 1 para exibir os itens da lista
		int i, n = lista.size(); //tamanho da lista

		for (i = 0; i < n; i++) {
			System.out.printf("%d: %d\n", i, lista.get(i));
		}
	}

	public static void mostrarII(ArrayList<Integer> lista) { //Método 2 para exibir os itens da lista (mais sofisticado)
		System.out.print("\n{");
		for (Integer item : lista) { //for each
			System.out.printf(" %d", item);
		}
		System.out.println(" }");
	}

}