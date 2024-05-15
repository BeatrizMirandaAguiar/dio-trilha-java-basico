import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da agência: ");
        conta.agencia = scanner.next();
        System.out.print("Por favor, digite o número da conta: ");
        conta.numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Por favor, digite o nome do titular da conta: ");
        conta.nomeCliente = scanner.nextLine();
        System.out.print("Por favor, digite o saldo da conta: ");
        conta.saldo = scanner.nextFloat();

        System.out.println("\nOlá "+conta.nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+conta.agencia+", conta "+conta.numeroConta+" e seu saldo "+conta.saldo+" já está disponível para saque.\n");
        scanner.close();
    }
}
