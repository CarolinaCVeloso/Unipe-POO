import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Aula6 {

    public static void ex1() {
        Locale.setDefault(Locale.US);
        float nota1, nota2, nota3, media;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2 = input.nextFloat();
        System.out.println("Digite a terceira nota: ");
        nota3 = input.nextFloat();
        media = (nota1 + nota2 + nota3) / 3;
        if (media >= 7) {
            System.out.println("Aprovado. Media final: " + media);
        } else if (media >= 5 && media < 7) {
            System.out.println("Vai para a final. Media final: " + media);
        } else {
            System.out.println("Reprovado. Media final: " + media);
        }
    }

    public static void ex2() {
        Locale.setDefault(Locale.US);
        float num;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = input.nextFloat();
        if (num > 0) {
            System.out.println("O número é maior que zero");
        } else {
            System.out.println("O número é menor ou igual a zero.");
        }
    }

    public static void ex3() {
        Locale.setDefault(Locale.US);
        float num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = input.nextFloat();
        System.out.println("Digite o segundo número: ");
        num2 = input.nextFloat();
        if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior que o número " + num2);
        } else if(num1 < num2) {
            System.out.println("O número " + num2 + " é maior que o número " + num1);
        } else {
            System.out.println("Os números são iguais.");
        }
    }

    public static void ex4() {
        Locale.setDefault(Locale.US);
        String nomeCompleto, nome, sobrenome;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        nomeCompleto = input.nextLine();
        nome = nomeCompleto.substring(0, nomeCompleto.indexOf(" "));
        sobrenome = nomeCompleto.substring(nomeCompleto.lastIndexOf(" ") + 1);
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
    }

    public static void ex5(){
        Locale.setDefault(Locale.US);
        int op;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        op = input.nextInt();
        switch (op){
            case 1:
                System.out.println("Verão");
                break;
            case 2:
                System.out.println("Outono");
                break;
            case 3:
                System.out.println("Inverno");
                break;
            case 4:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public static void ex6() {
        int op;
        double num1,num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número da opção: ");
        op = input.nextInt();
        System.out.println("Digite o primeiro número: ");
        num1 = input.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = input.nextDouble();
        switch (op){
            case 1:
                System.out.println("Adição: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtração: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplicação: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Divisão: " + (num1 / num2));
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}

