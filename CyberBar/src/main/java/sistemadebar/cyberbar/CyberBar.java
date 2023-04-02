package sistemadebar.cyberbar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CyberBar {

    public static Scanner ll = new Scanner(System.in);

    public static void main(String[] args) {
        char valor;
        boolean finalizadoLogin, finalizadoVenda = false;

        do {
            System.out.println("------------------------------------------------");
            System.out.print("             Bem-vindo ao Cyber Bar             ");
            System.out.println("\n------------------------------------------------");
            System.out.println("Por favor, digite qual a função: ");
            System.out.println("1- Contas a pagar");
            System.out.println("2- Contas a receber");
            System.out.println("3- Login");
            System.out.println("4- Gerenciar Vendas");
            System.out.println("5- Produtos");
            System.out.println("6- Averiguar estoque");
            System.out.println("7- Cadastro Cliente");
            System.out.println("0- Sair");
            System.out.println("------------------------------------------------");
            System.out.print("Função: ");

            valor = ll.next().charAt(0);
            switch (valor) {
                case '1':
                    System.out.println("Você escolheu 1- Contas a Pagar!");
ContasAPagar contasAPagar = new ContasAPagar();

                    Scanner scan = new Scanner(System.in);

                    boolean sair = false;
                    while (!sair) {
                        System.out.println("------------------------");
                        System.out.println("1 - Adicionar conta");
                        System.out.println("2 - Pagar conta");
                        System.out.println("3 - Listar contas");
                        System.out.println("4 - Procurar por conta");
                        System.out.println("5 - Adicionar saldo");
                        System.out.println("6 - Ver saldo");
                        System.out.println("0 - Sair");
                        System.out.println("------------------------\n");

                        System.out.print("Opção: ");
                        int opcao = scan.nextInt();

                        switch (opcao) {
                            case 1 -> {
                                Scanner scn = new Scanner(System.in);
                                System.out.print("Nome da conta: ");
                                String nome = scn.nextLine();
                                System.out.print("Empresa da conta: ");
                                String empresa = scn.nextLine();
                                System.out.print("Valor da conta: ");
                                double Valor = scn.nextDouble();
                                contasAPagar.adicionarConta(nome, empresa, valor);
                                System.out.println("Conta adicionada com sucesso!\n");
                            }
                            case 2 -> {
                                Scanner sc = new Scanner(System.in);
                                System.out.print("ID da conta a pagar: ");
                                int idPagar = sc.nextInt();
                                contasAPagar.pagarConta(idPagar);
                            }
                            case 3 -> {

                                contasAPagar.listarContas();
                                System.out.println();
                            }
                            case 4 -> {
                                Scanner scne = new Scanner(System.in);
                                System.out.print("ID da conta a procurar: ");
                                int idProcurar = scne.nextInt();
                                contasAPagar.procurarPorConta(idProcurar);
                                System.out.println();
                            }
                            case 5 -> {
                                Scanner scnr = new Scanner(System.in);
                                System.out.print("Valor a adicionar: ");
                                double saldoAdicionado = scnr.nextDouble();
                                contasAPagar.adicionarSaldo(saldoAdicionado);
                            }
                            case 6 -> {
                                System.out.println("Saldo atual: R$" + contasAPagar.getSaldo() + "\n");

                            }
                            case 0 -> {
                                sair = true;
                                break;
                            }
                            default ->
                                System.out.println("Opção inválida!\n");
                        }
                    }
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
                    String e;
                    LoginCadastro l = new LoginCadastro();
                    finalizadoLogin = false;
                    while (finalizadoLogin == false){
                        System.out.println("\nVocê escolheu 3-Login!");
                        System.out.println("Você deseja:\n[1] - REGISTRAR\n[2] - LOGAR(\n[3] - LISTAR CONTA(S)");
                        try{
                            int escolha = ll.nextInt();
                            switch (escolha){
                                case 1:
                                    l.Registrar();
                                    System.out.println("Você deseja continuar rodando o LOGIN? (y/n)");
                                    e = ll.nextLine();
                                    if(e.equalsIgnoreCase("Y")){
                                        }else{
                                            finalizadoLogin = true;
                                        }
                                    break;
                                case 2:
                                    l.Login();
                                    System.out.println("Você deseja continuar rodando o LOGIN? (y/n)");
                                    e = ll.nextLine();
                                    if(e.equalsIgnoreCase("Y")){
                                        }else{
                                            finalizadoLogin = true;
                                        }
                                    break;
                                case 3:
                                    l.vizualizarContas();
                                    System.out.println("Você deseja continuar rodando o LOGIN? (y/n)");
                                    e = ll.nextLine();
                                    if(e.equalsIgnoreCase("Y")){
                                        }else{
                                            finalizadoLogin = true;
                                        }
                                    break;
                                default:
                                    System.out.println("Opção não encontrada!");
                            }
                        }catch(InputMismatchException exception){
                            System.out.println("Informe um número válido!");
                        }   
                    }
                        if (esperar() == '0') {
                            valor = '0';
                            finalizadoLogin = true;
                        }
                    break;

                case '4':
                    String e1;
                    Vendas v = new Vendas();
                    finalizadoVenda = false;
                    Scanner antiBug = new Scanner(System.in);
                    while (finalizadoVenda == false){
                        System.out.println("\nVocê escolheu 4-Gerenciar Vendas!");
                        System.out.println("Você deseja:\n[1] - REGISTRAR VENDA\n[2] - BAIXAR PARCELA(S) \n[3] - LISTAR VENDA(S)\n[4] - CANCELAR VENDA(S)");
                        try{
                            int escolha1 = ll.nextInt();
                            switch (escolha1){
                                case 1:
                                    v.RegistrarVenda();
                                    System.out.println("Você deseja continuar rodando o Gerenciamento de vendas? (y/n)");
                                    e1 = antiBug.nextLine();
                                    if(e1.equalsIgnoreCase("Y")){
                                        }else{
                                            finalizadoVenda = true;
                                        }
                                    break;
                                case 2:
                                    v.BaixaParcela();
                                    System.out.println("Você deseja continuar rodando o Gerenciamento de vendas? (y/n)");
                                    e1 = antiBug.nextLine();
                                    if(e1.equalsIgnoreCase("Y")){
                                        }else{
                                            finalizadoVenda = true;
                                        }
                                    break;
                                case 3:
                                    v.Venda();
                                    System.out.println("Você deseja continuar rodando o Gerenciamento de vendas? (y/n)");
                                    e1 = antiBug.nextLine();
                                    if(e1.equalsIgnoreCase("Y")){
                                        }else{
                                            finalizadoVenda = true;
                                        }
                                    break;
                                case 4:
                                    v.CancelaVenda();
                                    System.out.println("Você deseja continuar rodando o Gerenciamento de vendas? (y/n)");
                                    e1 = antiBug.nextLine();
                                    if(e1.equalsIgnoreCase("Y")){
                                        }else{
                                            finalizadoVenda = true;
                                        }
                                    break;
                                default:
                                    System.out.println("Opção não encontrada!");
                            }
                        }catch(InputMismatchException exception){
                            System.out.println("ERRO: Informe um número válido!");
                        }   
                    }
                        if (esperar() == '0') {
                            valor = '0';
                            finalizadoVenda = true;
                        }
                    break;

                case '5':
                    System.out.println("Você escolheu 5-Produtos!");
                    Produto pp = new Produto();
                    System.out.println("Digite o que deseja fazer:\n 1- para adicionar produto\n 2- para atualizar o estoque");//inicia sistema estoque
                    int numCod = ll.nextInt();
                switch (numCod) {
                    case 1://caso add produto
                        pp.Produto();
                        break;
                    case 2://caso atualizar qnt de produto no estoque
                        pp.prodAtualizarEstoque();
                        break;
                    default://caso invalido
                        System.out.println("Valor invalido");
                        break;
                }
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
        System.out.print("Continuar usando o sistema (y/n): ");
        esperar = ll.next();
        if ("y".equals(esperar)) {
        } else {
            System.out.println("Saindo...");
            return '0';
        }
        return retorno;
    }
}
