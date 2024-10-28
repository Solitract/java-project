import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Pedro";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int escolha =0;

        System.out.println("**********************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************************");

        System.out.println("\nOperações");

        String menu = """
                1 - Consultar valor
                2 - Transferir valor 
                3 - Receber Valor 
                4 - Sair
                
                """;

        Scanner dados = new Scanner(System.in);

        while (escolha !=4) {
            System.out.println(menu);
            escolha = dados.nextInt();

            if (escolha == 1) {
                System.out.println("\no Saldo atualizado é " + saldo);
            }else if (escolha ==2) {
                System.out.println("Qual o valor que deseja tranferir?");
                double valor = dados.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferencia");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (escolha == 3) {
                System.out.println("Valor recebido: ");
                double valor = dados.nextDouble();
                saldo +=valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (escolha !=4) {
                System.out.println("Opção inválida");
            }
        }
    }
}