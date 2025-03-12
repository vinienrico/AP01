import java.util.Scanner;

public class AP01_exercicio01 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;
        System.out.printf("Temperatura em Celsius é: %.2fC%n", celsius);
        scanner.close();
    }
}
