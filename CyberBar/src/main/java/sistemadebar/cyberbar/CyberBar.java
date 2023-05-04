package sistemadebar.cyberbar;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Date;

public class CyberBar {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char opcaoMenu;
        Date data = new Date();
        System.out.println("data: "+data);
        
        do {
            boolean finalizadoLogin, finalizadoVenda = false;
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

            opcaoMenu = scanner.next().charAt(0);
            switch (opcaoMenu) {
                case '1':
                    System.out.println("Você escolheu 1- Contas a Pagar!");
                    ContasAPagar contasAPagar = new ContasAPagar();

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
                        String opcao = scanner.nextLine();

                        switch (opcao) {
                            case "1":
                                System.out.print("Nome da conta: ");
                                String nomeConta = scanner.nextLine();
                                
                                System.out.print("Empresa da conta: ");
                                String empresaConta = scanner.nextLine();
                                
                                System.out.print("Valor da conta: ");
                                double valorConta = scanner.nextDouble();
                                
                                contasAPagar.adicionarConta(nomeConta, empresaConta, valorConta);
                                System.out.println("Conta adicionada com sucesso!\n");
                                break;

                            case "2":
                                System.out.print("ID da conta a pagar: ");
                                int idPagar = scanner.nextInt();
                                
                                contasAPagar.pagarConta(idPagar);
                                break;

                            case "3":
                                contasAPagar.listarContas();
                                System.out.println();
                                break;

                            case "4":
                                System.out.print("ID da conta a procurar: ");
                                int idProcurar = scanner.nextInt();
                                
                                contasAPagar.procurarPorConta(idProcurar);
                                System.out.println();
                                break;

                            case "5":
                                System.out.print("Valor a adicionar: ");
                                double saldoAdicionar = scanner.nextDouble();
                                
                                contasAPagar.adicionarSaldo(saldoAdicionar);
                                break;

                            case "6":
                                System.out.println("Saldo atual: R$" + contasAPagar.getSaldo() + "\n");
                                break;
                               
                            case "0":
                                sair = true;
                                break;
                                
                            default:
                                System.out.println("Opção inválida!\n");
                                break;
                        }
                    }
                    if (continuarExecucao() == '0') {
                        opcaoMenu = '0';
                    }
                    break;

                case '2':
                    System.out.println("Você escolheu 2-contas a receber!");
                    ContasaReceber contaReceber = new ContasaReceber();
                    boolean finalizadoContaR = false;
                    
                    while (finalizadoContaR == false){
                        contaReceber.GerarConta();
                        System.out.println("Deseja continuar usando o ContasAReceber? (y/n)");
                        String rss = scanner.next();
                        if(rss.equalsIgnoreCase("y")){
                            
                        }else{
                            finalizadoContaR = true;
                        }
                }
                    if (continuarExecucao() == '0') {
                        opcaoMenu = '0';
                    }

                    break;


                case '3':
                    String continuarLogin;
                    LoginCadastro login = new LoginCadastro();
                    finalizadoLogin = false;
                    
                    while (finalizadoLogin == false) {
                        System.out.println("\nVocê escolheu 3-Login!");
                        System.out.println("Você deseja:\n[1] - REGISTRAR\n[2] - LOGAR(\n[3] - LISTAR CONTA(S)");
                        
                        try {
                            String escolha = scanner.nextLine();
                            switch (escolha) {
                                case "1":
                                    login.Registrar();
                                    System.out.println("Você deseja continuar rodando o LOGIN? (y/n)");
                                    continuarLogin = scanner.next();
                                    
                                    if (continuarLogin.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoLogin = true;
                                    }
                                    break;
                                    
                                case "2":
                                    login.Login();
                                    System.out.println("Você deseja continuar rodando o LOGIN? (y/n)");
                                    continuarLogin = scanner.next();
                                    if (continuarLogin.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoLogin = true;
                                    }
                                    break;
                                    
                                case "3":
                                    login.vizualizarContas();
                                    System.out.println("Você deseja continuar rodando o LOGIN? (y/n)");
                                    continuarLogin = scanner.next();
                                    if (continuarLogin.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoLogin = true;
                                    }
                                    break;
                                    
                                default:
                                    System.out.println("Opção não encontrada!");
                            }
                            
                        } catch (InputMismatchException exception) {
                            System.out.println("Informe um número válido!");
                        }
                    }
                    if (continuarExecucao() == '0') {
                        opcaoMenu = '0';
                        finalizadoLogin = true;
                    }
                    break;



                case '4':
                    String e1;
                    Vendas v = new Vendas();
                    finalizadoVenda = false;
                    Scanner antiBug = new Scanner(System.in);
                    while (finalizadoVenda == false) {
                        System.out.println("\nVocê escolheu 4-Gerenciar Vendas!");
                        System.out.println("Você deseja:\n[1] - REGISTRAR VENDA\n[2] - BAIXAR PARCELA(S) \n[3] - LISTAR VENDA(S)\n[4] - CANCELAR VENDA(S)");
                        try {
                            String escolha1 = scanner.nextLine();
                            switch (escolha1) {
                                case "1":
                                    v.RegistrarVenda();
                                    System.out.println("Você deseja continuar rodando o Gerenciamento de vendas? (y/n)");
                                    e1 = antiBug.nextLine();
                                    if (e1.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoVenda = true;
                                    }
                                    break;
                                    
                                case "2":
                                    v.BaixaParcela();
                                    System.out.println("Você deseja continuar rodando o Gerenciamento de vendas? (y/n)");
                                    e1 = antiBug.nextLine();
                                    if (e1.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoVenda = true;
                                    }
                                    break;
                                    
                                case "3":
                                    v.Venda();
                                    System.out.println("Você deseja continuar rodando o Gerenciamento de vendas? (y/n)");
                                    e1 = antiBug.nextLine();
                                    if (e1.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoVenda = true;
                                    }
                                    break;
                                    
                                case "4":
                                    v.CancelaVenda();
                                    System.out.println("Você deseja continuar rodando o Gerenciamento de vendas? (y/n)");
                                    e1 = antiBug.nextLine();
                                    if (e1.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoVenda = true;
                                    }
                                    break;
                                default:
                                    System.out.println("Opção não encontrada!");
                            }
                        } catch (InputMismatchException exception) {
                            System.out.println("ERRO: Informe um número válido!");
                        }
                    }
                    if (continuarExecucao() == '0') {
                        opcaoMenu = '0';
                        finalizadoVenda = true;
                    }
                    break;

                case '5':
                    System.out.println("Você escolheu 5-Produtos!");
                    Produto pp = new Produto();
                    System.out.println("Digite o que deseja fazer:\n 1- para adicionar produto\n 2- para atualizar o estoque");//inicia sistema estoque
                    int numCod = scanner.nextInt();
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
                    
                    if (continuarExecucao() == '0') {
                        opcaoMenu = '0';
                    }
                    break;

                case '6':
                    String e2;
                    Estoque estoque1 = new Estoque();
                    boolean fecharEstoque = false;
                    Scanner ant = new Scanner(System.in);
                    while (fecharEstoque == false) {
                        System.out.println("Você escolheu 6-Averiguar estoque!");
                        System.out.println("Escolha qual função você deseja execultar:");
                        System.out.println("1 - ADICIONAR PRODUTO AO ESTOQUE\n"
                                + "2 - ATUALIZAR PRODUTO\n"
                                + "3 - LISTAR PRODUTO\n"
                                + "4 - EXCLUIR PRODUTO");

                        try {
                            String escolha3 = scanner.nextLine();
                            switch (escolha3) {
                                case "1":
                                    estoque1.AdicionarProduto();
                                    System.out.println("Você deseja continuar rodando o Averiguar Estoque? (y/n)");
                                    e2 = ant.nextLine();
                                    if (e2.equalsIgnoreCase("Y")) {
                                    } else {
                                        fecharEstoque = true;
                                    }
                                    break;
                                    
                                case "2":
                                    Scanner ler = new Scanner(System.in);
                                    estoque1.AtualizarProduto();
                                    System.out.println("Você deseja continuar rodando o Averiguar Estoque? (y/n)");
                                    e2 = ant.nextLine();
                                    
                                    if (e2.equalsIgnoreCase("Y")) {
                                    } else {
                                        fecharEstoque = true;
                                    }
                                    break;
                                    
                                case "3":
                                    estoque1.ExibirProduto();
                                    System.out.println("Você deseja continuar rodando o Averiguar Estoque? (y/n)");
                                    e2 = ant.nextLine();
                                    
                                    if (e2.equalsIgnoreCase("Y")) {
                                    } else {
                                        fecharEstoque = true;
                                    }
                                    break;
                                    
                                case "4":
                                    System.out.println("Informe a quantidade de produtos a serem removidos:");
                                    int quantidade = ant.nextInt();
                                    estoque1.RemoverProduto(quantidade);
                                    System.out.println("Você deseja continuar rodando o Averiguar Estoque? (y/n)");
                                    e2 = ant.nextLine();
                                    
                                    if (e2.equalsIgnoreCase("Y")) {
                                    } else {
                                        fecharEstoque = true;
                                    }
                                    break;
                                    
                                default:
                                    System.out.println("Opção não encontrada!");
                            }
                        } catch (InputMismatchException exception) {
                            System.out.println("ERRO: Informe um número válido!");
                        }
                    }
                    if (continuarExecucao() == '0') {
                        opcaoMenu = '0';
                    }
                    break;
                case '7':
                    System.out.println("Você escolheu 7- Cadastrar Cliente!");
                    ArrayList<ClienteCadastro> clientes = new ArrayList<ClienteCadastro>(); // arrayList onde ficam salvos os clientes
                    ClienteCadastro cClientes[] = new ClienteCadastro[clientes.size()]; // Inicialização de um array para organizar os clientes
                    String opc;
                    
                    do {
                        // menu da classe
                        System.out.println("1 - CADASTRAR NOVO CLIENTE\n"
                                          +"2 - EDITAR CLIENTE\n"
                                          +"3 - MOSTRAR CADASTRO DE CLIENTE\n"
                                          +"4 - EXCLUIR CLIENTE\n"
                                          +"0 - SAIR");

                        opc = scanner.nextLine();

                        int idxCliente = 0; // op 1
                        int idCl; // op 2, op 3 e op 4
                        switch (opc) {
                            case "1" : 
                                idxCliente++; // é o Indice do Cliente

                                cClientes[idxCliente].adicionarCliente(); // função para cadastrar novo cliente
                                clientes.add((idxCliente-1),cClientes[idxCliente]); // salvando no array list pra ser encontrado depois

                                break;

                            case "2" :
                                System.out.print("Informe o ID do Cliente: ");
                                idCl = scanner.nextInt();
                                scanner.nextLine();

                                cClientes[idCl].editarCliente();
                                clientes.add (idCl, cClientes[idCl]);

                                break;

                            case "3" : 
                                System.out.print("Informe o ID do Cliente: ");
                                idCl = scanner.nextInt();
                                scanner.nextLine();

                                cClientes[idCl].exibirCliente();

                                break;

                            case "4" : 
                                System.out.print("Informe o ID do Cliente: ");
                                idCl = scanner.nextInt();
                                scanner.nextLine();

                                cClientes[idCl].removerCliente();

                                break;

                            case "0" :
                                System.out.println("Saindo...");
                                opc = "0";
                                
                                break;
                                
                            default : 
                                System.out.println("Opção Inválida, tente novamente.");
                                
                                break;
                        }
                    } while (!"0".equals(opc));
                    
                    if (continuarExecucao() == '0') {
                        opcaoMenu = '0';
                    }
                    break;

                case '0':
                    System.out.println("------------------------------------------------");
                    System.out.println("OBRIGADO POR UTILIZAR O CYBERBAR!");
                    System.out.println(" ");
                    break;

                default:
                    System.out.println("Opção invalida, escolha novamente.");
                    if (continuarExecucao() == '0') {
                        opcaoMenu = '0';
                    }
                    break;
            }
        } while (opcaoMenu != '0');
    }

    public static char continuarExecucao() {
        String esperar;
        char retorno = '.';
        System.out.print("Continuar usando o sistema (y/n): ");
        esperar = scanner.nextLine();
        if ("y".equals(esperar)) {
        } else {
            System.out.println("Saindo...");
            return '0';
        }
        return retorno;
    }
}
