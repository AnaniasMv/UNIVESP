package Animals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListaAnimais {
	public static void main(String[] args) {
		String[] Animals = { "Leão", "Cobra", "Gato", "Sapo", "Cachorro" };
		List<String> listaDeAnimais = new LinkedList<>();

		// Adicionando os 3 primeiros aniamis a lista
		listaDeAnimais.add("Leão");
		listaDeAnimais.add("Sapo");
		listaDeAnimais.add("Cachorro");

		// Exibindo resultado
		System.out.println("Adicionado os 3 elementos a lista: ");
		for (String animal : listaDeAnimais) {
			System.out.println(animal);
		}
		System.out.println(); // separa os prints

		// Adiciona gato na primeira posição da lista
		System.out.println("Adicionando gato na primeira posição da lista...");
		((LinkedList<String>) listaDeAnimais).addFirst("Gato");
		for (String animal : listaDeAnimais) {
			System.out.println(animal);
		}
		System.out.println();

		// Adicionando cobra a lista
		listaDeAnimais.add("Cobra");
		System.out.println("Lista de animais com cobra adicionada: ");
		for (String animal : listaDeAnimais) {
			System.out.println(animal);
		}
		System.out.println();

		System.out.println("Lista ordenada em ordem crescente: ");
		Collections.sort(listaDeAnimais);
		for (String animal : listaDeAnimais) {
			System.out.println(animal);
		}
	}
}

// segunda opçao de implementacao da mesma coisa
/*
import java.util.*;

public class ListaAnimais {

	public static void main(String[] args) {

		List<String> lista = new LinkedList<String>();
		lista.add("Leão");
		lista.add("Sapo");
		lista.add("Cachoro");
		System.out.println(lista);
		lista.add(1, "Gato");
		System.out.println(lista);
		lista.add(3, "Cobra");
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);

	}

}
 */

