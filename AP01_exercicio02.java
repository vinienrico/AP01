import java.util.Scanner;

public class AP01_exercicio02 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("Temperatura em fahrenheit é: %.2fF%n", fahrenheit);

        scanner.close();
    }
}