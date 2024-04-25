public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação dos dados do usuário
        System.out.print("Por favor, digite o número da Agência: ");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo da conta: ");
        double saldoConta = scanner.nextDouble();

        // Exibição da mensagem final
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + numeroAgencia + ", conta " + nomeCliente + " e seu saldo é R$" + saldoConta + ".");
        System.out.println("Seu saldo já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}
