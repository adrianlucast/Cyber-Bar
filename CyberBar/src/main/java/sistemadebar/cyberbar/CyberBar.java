package sistemadebar.cyberbar;

import java.util.Scanner;

public class CyberBar {

    public static Scanner ll = new Scanner(System.in);

    public static void main(String[] args) {
        char valor;

        do {
            System.out.println("------------------------------------------------");
            System.out.print("             Bem-vindo ao Cyber Bar             ");
            System.out.println("\n------------------------------------------------");
            System.out.println("Por favor, digite qual a função: ");
            System.out.println("1- Contas a pagar");
            System.out.println("2- Contas a receber");
            System.out.println("3- Login");
            System.out.println("4- Produtos");
            System.out.println("5- Vendas");
            System.out.println("6- Averiguar estoque");
            System.out.println("7- Cadastro Cliente");
            System.out.println("0- Sair");
            System.out.println("------------------------------------------------");
            System.out.print("Função: ");

            valor = ll.next().charAt(0);
            switch (valor) {
                case '1':
                    System.out.println("Você escolheu 1-contas a pagar!");
                    //ContasAPagar conta = new ContasAPagar();
                    System.out.println("Você tem um total de contas a pagar de: x Reais"); // Substituir x pela váriavel saldo
                    if (esperar() == '0') {
                        valor = '0';
                    }
                    break;

                case '2':
                    System.out.println("Você escolheu 2-contas a receber!");
                    //ContasAReceber contaReceber = new ContaAReceber();
                    System.out.println("Você tem um total de contas a receber de: x Contas"); // Substituir x pela váriavel Contas  
                    if (esperar() == '0') {
                        valor = '0';
                    }
                    break;

                case '3':
                    System.out.println("Você escolheu 3-Login!");
                    //Cardapio cardapio = new Cardapio();
                    if (esperar() == '0') {
                        valor = '0';
                    }
                    break;

                case '4':
                    System.out.println("Você escolheu 4-Produtos!");
                    //Produtos produto = new Produtos();
                    if (esperar() == '0') {
                        valor = '0';
                    }
                    break;

                case '5':
                    System.out.println("Você escolheu 5-Vendas!");
                    //
                    if (esperar() == '0') {
                        valor = '0';
                    }
                    break;

                case '6':
                    System.out.println("Você escolheu 6-Averiguar estoque!");
                    //ControlarEstoque estoque = new Estoque();
                    System.out.println("Seu estoque contém: \n"); // Substituir x pela váriavel Contas
                    if (esperar() == '0') {
                        valor = '0';
                    }
                    break;
                case '7':
                    System.out.println("Você escolheu 7- Cadastrar Cliente!");
                    //CadastrarCliente cliente = new CadastrarCliente();
                    if (esperar() == '0') {
                        valor = '0';
                    }

                case '0':
                    System.out.println("------------------------------------------------");
                    System.out.println("OBRIGADO POR UTILIZAR O CYBERBAR!");
                    System.out.println(" ");
                    break;

                default:
                    System.out.println("Opção invalida, escolha novamente.");
                    if (esperar() == '0') {
                        valor = '0';
                    }
                    break;
            }
        } while (valor != '0');
    }

    public static char esperar() {
        String esperar;
        char retorno = '.';
        System.out.print("Continuar (y/n): ");
        esperar = ll.next();
        if ("y".equals(esperar)) {
        } else {
            System.out.println("Saindo...");
            return '0';
        }
        return retorno;
    }
}
