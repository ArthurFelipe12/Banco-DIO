import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        String nomecliente;
        String agencia;
        int numero;
        double saldo;

        System.out.println("Por favor, digite seu Nome: ");
        nomecliente = scan.nextLine();

        System.out.println("Por favor, digite sua Agência: ");
        agencia = scan.next();

        System.out.println("Por favor, digite o número da Agência: ");
        numero = scan.nextInt();

        System.out.println("Por favor, digite o seu Saldo: ");
        saldo = scan.nextDouble();
    
        System.out.println("Olá " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque. ");
    }
}
