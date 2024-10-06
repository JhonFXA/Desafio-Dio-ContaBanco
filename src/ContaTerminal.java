import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o nome da agencia");
        agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o saldo do cliente");
        saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
