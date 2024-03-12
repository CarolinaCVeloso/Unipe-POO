import java.util.Locale;
import java.util.Scanner;

public class Aula4 {

    public static void ex1() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double num1 = input.nextDouble();
        input.nextLine();
        System.out.println("Digite o segundo valor: ");
        double num2 = input.nextDouble();
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.println("Resultado: \n");
        System.out.println("Adição: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }

    public static void ex2() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Double n1, n2, n3, media;
        System.out.println("Digite a primeira nota: ");
        n1 = Double.parseDouble(input.nextLine());
        System.out.println("Digite a segunda nota: ");
        n2 = Double.parseDouble(input.nextLine());
        System.out.println("Digite a terceira nota: ");
        n3 = Double.parseDouble(input.nextLine());
        media = (n1 + n2 + n3) / 3;
        System.out.println("A média das notas é: " + media);
    }
}
