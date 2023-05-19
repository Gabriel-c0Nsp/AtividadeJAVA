import java.util.Scanner;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner venda = new Scanner(System.in);

        System.out.println("Qual o valor da venda?");
        double valor = venda.nextDouble();
        double desconto = (10.0 / 100.0) * valor;
        double parcela = valor / 3.0;
        double comissaoP = 5.0 / 100.0 * valor;
        double vAp = valor - desconto;
        double comissaoV = 5.0 / 100.0 * vAp;
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("O desconto será de 10%, então, o valor a pagar será de $" + vAp);

        System.out.println("O valor foi parcelado? Digite 's' para sim, e 'n' para não");

        String opcao = venda.next();

        boolean parcelado = opcao.equalsIgnoreCase("s");
        boolean a_vista = opcao.equalsIgnoreCase("n");

        if (parcelado) {
            System.out.println("O valor total da conta parcelada em 3x sem juros será de $" + df.format(parcela)
                    + ". Então a comissão para o vendedor será de $" + comissaoP);
        } else if (a_vista) {
            System.out.println("Então a comissão será de $" + comissaoV);
        } else {
            System.out.println("Digite apenas s ou n!");
        }

        venda.close();
    }
}
