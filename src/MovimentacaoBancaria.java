import java.util.Scanner;

public class MovimentacaoBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome;
        String tipoConta;
        int opcao = 0;
        double saldoInicial;
        double saldoRecebido;
        double tranferencia;

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
        System.out.println("Saldo inicial: R$" + saldoInicial);
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
                    System.out.println("O valor em saldo é: " + saldoInicial);
                    break;
                case 2:
                    System.out.println("Informe o valor recebido: ");
                    saldoRecebido = leitura.nextDouble();
                    saldoInicial += saldoRecebido;
                    System.out.println("O saldo atua agoa é: " + saldoInicial);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferirir: ");
                    tranferencia = leitura.nextDouble();
                    if (tranferencia > saldoInicial){
                        System.out.println("Essa operação não pode ser realizada, saldo insuficiente");
                    } else {
                        saldoInicial -= tranferencia;
                        System.out.println("O valor atual agora é " + saldoInicial);
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