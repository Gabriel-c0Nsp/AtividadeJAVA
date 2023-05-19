import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner valores = new Scanner(System.in);

        System.out.println(
                "Digite um número e ele será convertido de metros por segundo (m/s), para quilômetros por hora (km/h)");
        double mS = valores.nextDouble();

        double formula = 3.6;
        double conversao = mS * formula;

        System.out.println("a conversão desse número para km/h será: " + conversao + ", ou seja " + conversao + "km/h");

        valores.close();

    }
}
