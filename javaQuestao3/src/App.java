import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner conta = new Scanner(System.in);

        System.out.println("Digite um número");
        int num1 = conta.nextInt();

        System.out.println("Digite mais um número");
        int num2 = conta.nextInt();

        System.out.println("Digite o último número");
        int num3 = conta.nextInt();

        int soma = num1 + num2 + num3;

        System.out.println("A soma dos 3 números é " + soma);

        conta.close();
    }
} 
