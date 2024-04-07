import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numero;
        String agency, nomeDoClient;
        float saldo;

        System.out.println("Por favor, digite o número da Agência !");
        numero = scanner.nextInt();

        System.out.println("Por favor informe a agência");
        agency = scanner.next();

        System.out.println("Por favor digite seu Nome");
        nomeDoClient = scanner.next();

        System.out.println("Informe o saldo inicial");
        saldo = scanner.nextFloat();

        System.out.println("\n");

        System.out.println("Olá " + nomeDoClient + " obrigado por criar uma conta em nosso banco!\nSua agência é: " + agency + "\nConta: " + numero + "\nSaldo: " +  "R$ " + saldo + "\nJá está disponível para saque!");
    }
}
