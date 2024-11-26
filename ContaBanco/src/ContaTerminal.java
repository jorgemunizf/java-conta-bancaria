
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        /* TODO:
         * - Conhecer e importar a classe Scanner
         * - Exibir as mensagens para o nosso usuário
         * - Obter pelo scanner os valores digitados no terminal
         * - Exibir a mensagem conta criada
         */
        // Entradas do usuário
        Scanner scanner = new Scanner(System.in);

        //Solicitar dados do usuário
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        String numeroConta = scanner.nextLine();248 - 8

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        double saldo = 0;

        // Exibição da mensagem final com os dados fornecidos
        System.out.println("Olá " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numeroConta
                + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fecha o scanner para liberar o recurso
        scanner.close();
    }
}
