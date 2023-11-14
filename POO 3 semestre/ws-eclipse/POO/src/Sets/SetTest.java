// HashSet utiliado para remover valores duplicados do array de strings
package Sets;

import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.Arrays;

public class SetTest {
	public static void main(String[] args) {
		//cria e exibe uma List<String>
		String[] colors = {"red", "white","blue","green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
		List<String> list = Arrays.asList(colors);
		System.out.printf("List: %s%n", list);
		
		// elimina duplicatas, então imprime os valores unicos
		printNonDuplicates(list);
	}
	
	// cria um Set de uma coleção para eliminar duplicatas
	private static void printNonDuplicates(Collection<String> values) {
		// cria um HashSet
		Set<String> set = new HashSet<>(values);
		
		System.out.printf("%nNonDulicates Are: ");
		
		for (String value : set)
			System.out.printf("%s ", value);
		System.out.println();
	}

}
