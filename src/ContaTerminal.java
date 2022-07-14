import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroConta;
        double saldo;
        String nomeCliente, agencia;

        System.out.println("Por favor digite o seu nome: ");
        nomeCliente = input.next();

        System.out.println("digite seu número da conta: ");
        numeroConta = input.nextInt();

        System.out.println("Digite o número da sua agência: ");
        agencia = input.next();

        System.out.println("Digite o saldo da sua conta: ");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");

    }

}
