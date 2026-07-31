import java.util.Scanner;

public class MovimentacaoBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome;
        String tipoConta;
        int opcao = 0;
        double saldo;
        double saldoRecebido;
        double transferencia;

        System.out.print("Digite o nome do titular da conta: ");
        nome = leitura.nextLine();

        System.out.print("Informe o tipo da conta: ");
        tipoConta = leitura.nextLine();

        System.out.print("Digite o sando da conta: R$");
        saldoInicial = leitura.nextDouble();

        System.out.println("\n******************************");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: R$" + saldo);
        System.out.println("******************************");

        String menu = """
             ** Operações **
             1 - Consultar saldo
             2 - Receber valor
             3 - Transferir valor
             4 - Sair
            """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O valor em saldo é: " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor recebido: ");
                    saldoRecebido = leitura.nextDouble();
                    saldo += saldoRecebido;
                    System.out.println("O saldo atual agora é: " + saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    transferencia = leitura.nextDouble();
                    if (transferencia > saldo) {
                        System.out.println("Essa operação não pode ser realizada, saldo insuficiente");
                    } else {
                        saldo -= transferencia;
                        System.out.println("O valor atual agora é " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar o nosso sistema. Tenha um ótimo dia");
                    break;
                default:
                    System.out.println("opção invalida");
            }
        }
    }
}
