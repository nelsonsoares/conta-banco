import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numero;
        String agencia, nomeDoCliente;
        Float saldo;

        System.out.println("Por favor, digite o número da Agência !");
        numero = scanner.nextInt();

        System.out.println("Por favor informe a agência");
        agencia = scanner.next();

        System.out.println("Por favor digite seu Nome");
        nomeDoCliente = scanner.next();

        System.out.println("Informe o saldo inicial");
        saldo = scanner.nextFloat();

        System.out.println("\n");

        System.out.println("Olá " + nomeDoCliente + " obrigado por criar uma conta em nosso banco!\nSua agência é: " + agencia + "\nConta: " + numero + "\nSaldo: " +  "R$ " + saldo + "\nJá está disponível para saque!");

        System.out.println("\n");
    }
}
