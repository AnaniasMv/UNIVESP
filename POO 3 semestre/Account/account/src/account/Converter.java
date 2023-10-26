package account;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        // Crie um objeto Scanner para obter entrada do usuário
        Scanner input = new Scanner(System.in);

        // Solicite ao usuário que digite a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();

        // Converta a temperatura para Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Exiba o resultado
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        // Feche o Scanner
        input.close();
    }
}
