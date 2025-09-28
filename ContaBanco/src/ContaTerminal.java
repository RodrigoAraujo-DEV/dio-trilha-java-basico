import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        int numero = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Digite a Agência:");
        String agencia = sc.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        double saldo = 100.00;

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.", nome, agencia, numero, saldo);

    }    
}
