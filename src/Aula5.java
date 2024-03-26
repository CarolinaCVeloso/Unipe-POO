import java.util.Locale;
import java.util.Scanner;

public class Aula5 {
    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//        ex4();
        ex5();
    }

    public static void ex1() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = input.nextInt();
        if(num>0){
            System.out.println("Positivo");
        }else if(num<0){
            System.out.println("Negativo");
        }else{
            System.out.println("Zero");
        }
    }

    public static void ex2(){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a média do aluno: ");
        int media = input.nextInt();
        if(media>=7){
            System.out.println("Passou por média");
        }
        else if (media>=5 && media<7){
            System.out.println("Vai para prova final");
        }
       else{
            System.out.println("Reprovou");
        }
    }

    public static void ex3(){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um nome ");
        String nome = input.next();

        if(nome.equals("Seiya")){
            System.out.println("Pégasus");
        } else if (nome.equals("Hyoga")) {
            System.out.println("Cisne");
        } else if (nome.equals("Shiryu")) {
            System.out.println("Dragão");
        } else if (nome.equals("Shun")) {
            System.out.println("Andrômeda");
        } else if (nome.equals("Ikki")) {
            System.out.println("Fênix");
        } else {
            System.out.println("Cavaleiro desconhecido");
        }
    }

    public static void ex4(){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("Par");
        }else{
            System.out.println("Ímpar");
        }
    }
    public static void ex5(){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        String nome1,nome2,nome3,maior;
        System.out.println("Digite um nome");
        nome1 = input.nextLine();
        System.out.println("Digite um nome");
        nome2 = input.nextLine();
        System.out.println("Digite um nome");
        nome3 = input.nextLine();

        if (nome1.compareTo(nome2) > 0) {
            maior = nome1;
        } else {
            maior = nome2;

        }
        if (maior.compareTo(nome3) > 0) {
            maior = maior;
        } else {
            maior = nome3;
        }
    }
}
