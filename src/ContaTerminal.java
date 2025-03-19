import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Digite o número de sua agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
    
    }
}