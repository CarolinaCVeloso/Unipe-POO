import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Aula3 {


    public static void ex6(){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        float num1 = input.nextFloat();
        input.nextLine();
        System.out.println("Digite o segundo número: ");
        float num2 = input.nextFloat();
        float soma = num1 + num2;
        float subtracao = num1 - num2;
        System.out.println("A soma dos números é igual a " + soma);
        System.out.println("A subtração dos números é igual a " + subtracao);
    }
    public static void ex5() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Peso: ");
        double peso = input.nextDouble();
        input.nextLine();
        System.out.println("altura: ");
        double altura = input.nextDouble();
        System.out.println("Peso: " + peso + " | Altura: " + altura);

    }

    public static void ex4() {
        float salarioMinimo = 1414;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do salário: ");
        float salario = input.nextFloat();
        System.out.println("A diferença entre o seu salário e o salário mínimo é: " + (salario-salarioMinimo));
        input.close();

    }

    public static void ex3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = input.nextInt();
        input.nextLine();
        System.out.println("Digite agora um nome: ");
        String nome = input.nextLine();
        System.out.println("O número digitado foi: " + num + " e o nome foi: " + nome);
        input.close();
    }

    public static void ex2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o seu ano de Nascimento? ");
        int anoNasc = input.nextInt();
        LocalDate date = LocalDate.now();
        int anoAtual = date.getYear();
        System.out.println("Sua idade é: " + (anoAtual - anoNasc));
        input.close();
    }

    public static void ex1() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu Nome? ");
        String nome = entrada.nextLine();
        System.out.println("Boa noite " + nome + "!");
        entrada.close();
    }
}

