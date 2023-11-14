// Lists, LinkedLists e ListIterator
package LinkedList;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
	public static void main(String[] args) {
		String[] colors = { "black", "yellow", "green", "blue", "violet", "silver" };
		List<String> list1 = new LinkedList<>();

		for (String color : colors)
			list1.add(color);

		// adiciona elementos colors2 a list2
		String[] colors2 = { "gold", "brown", "blue", "gray", "silver" };
		List<String> list2 = new LinkedList<>();

		for (String color : colors2)
			list2.add(color);

		list1.addAll(list2); // concatena as listas
		list2 = null; // libera recursos
		printList(list1); // imprime elementos list1

		convertToUppercaseStrings(list1); // converte em string de letras maiusculas
		printList(list1); // impriome elementos list1

		System.out.printf("%nDeleting elements 4 to 6...");
		removeItems(list1, 4, 7); // remove itens 4 a 6 da lista
		printList(list1); // imprime elementos list1
		printReversedList(list1); // imprime lista na ordem inversa
	}

	// Gera saida do conteudo de list
	private static void printList(List<String> list) {
		System.out.printf("%nList:%n");

		for (String color : list)
			System.out.printf("%s ", color);

		System.out.println();
	}

	// localiza objetos string e converte em letras maiusculas
	private static void convertToUppercaseStrings(List<String> list) {
		ListIterator<String> iterator = list.listIterator();

		while (iterator.hasNext()) {
			String color = iterator.next(); // obtém o tim
			iterator.set(color.toUpperCase()); // converte em letras maiusculas
		}
	}

	// obtém sublista e utiliza método clear para excluir itens da sublista
	private static void removeItems(List<String> list, int start, int end) {
		list.subList(start, end).clear(); // remove os itens
	}

	// imprime lista invertida
	private static void printReversedList(List<String> list) {
		ListIterator<String> iterator = list.listIterator(list.size());

		System.out.printf("%nReversed list:%n");

		// imprime lista na ordem inversa
		while (iterator.hasPrevious()) {
			System.out.printf("%s ", iterator.previous());
		}
	}
}
