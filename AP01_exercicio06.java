import java.util.Scanner;

public class AP01_exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = scanner.nextDouble();

        double delta = (b*b) - (4*a*c);
        System.out.print("Delta:" + delta);

        if (delta<0) {
            System.out.println("A equação não possui raízes reais");
        } else {
        double x1 = (-b+Math.sqrt(delta)) / (2*a);
        double x2 = (-b-Math.sqrt(delta)) / (2*a);
        System.out.printf("As raízes das equações são: x1= %.2f e x2= %.2f%n", x1, x2);
        }
        scanner.close();
    }
}