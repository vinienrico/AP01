import java.util.Scanner;
public class AP01_exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o valor da altura do triângulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        System.out.printf("A área do triângulo é: %.2f%n", area);

        scanner.close();
    }
}

