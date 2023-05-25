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
            System.out.println("Por Favor, Digite Qual a Função: ");
            System.out.println("1- Contas a Pagar");
            System.out.println("2- Contas a Receber");
            System.out.println("3- Login");
            System.out.println("4- Gerenciar Vendas");
            System.out.println("5- Produtos");
            System.out.println("6- Averiguar Estoque");
            System.out.println("7- Cadastro Cliente");
            System.out.println("0- Sair");
            System.out.println("------------------------------------------------");
            System.out.print("Função: ");

            opcaoMenu = scanner.next().charAt(0);
            scanner.nextLine();
            switch (opcaoMenu) {
                case '1':
                    System.out.println("Você Escolheu: \n"+ "1- Contas a Pagar!");
                    ContasAPagar contasAPagar = new ContasAPagar();

                    boolean sair = false;
                    while (!sair) {
                        System.out.println("------------------------");
                        System.out.println("1- Adicionar conta");
                        System.out.println("2- Pagar conta");
                        System.out.println("3- Listar contas");
                        System.out.println("4- Procurar por conta");
                        System.out.println("5- Adicionar saldo");
                        System.out.println("6- Ver saldo");
                        System.out.println("0- Sair");
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
                                contasAPagar.listarConta();
                                System.out.println();
                                break;

                            case "4":
                                System.out.print("ID da Conta a Procurar: ");
                                int idProcurar = scanner.nextInt();
                                
                                contasAPagar.procurarConta(idProcurar);
                                System.out.println();
                                break;

                            case "5":
                                System.out.print("Valor a Adicionar: ");
                                double saldoAdicionar = scanner.nextDouble();
                                
                                contasAPagar.adicionarSaldo(saldoAdicionar);
                                break;

                            case "6":
                                System.out.println("Saldo Atual: R$" + contasAPagar.getSaldo() + "\n");
                                break;
                               
                            case "0":
                                sair = true;
                                break;
                                
                            default:
                                System.out.println("Opção Inválida!\n");
                                break;
                        }
                    }
                    if (continuarExecucao() == '0') {
                        opcaoMenu = '0';
                    }
                    break;

                case '2':
                    System.out.println("Você Escolheu: \n2- Contas a Receber!");
                    ContasaReceber contaReceber = new ContasaReceber();
                    boolean finalizadoContaR = false;
                    
                    while (finalizadoContaR == false){
                        contaReceber.GerarConta();
                        System.out.println("Deseja Continuar Usando o MENU Contas a Receber? (y/n)");
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
                        System.out.println("\nVocê escolheu: \n"+"3- Login!");
                        System.out.println("------------------------");
                        System.out.println("1- Registrar");
                        System.out.println("2- Logar");
                        System.out.println("3- Listar Contas");
                        System.out.println("------------------------\n");
                        
                        try {
                            String escolha = scanner.nextLine();
                            switch (escolha) {
                                case "1":
                                    login.Registrar();
                                    System.out.println("Você Deseja Continuar Usando o MENU Login? (y/n)");
                                    continuarLogin = scanner.next();
                                    
                                    if (continuarLogin.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoLogin = true;
                                    }
                                    break;
                                    
                                case "2":
                                    login.Login();
                                    System.out.println("Você Deseja Continuar Usando o MENU Login? (y/n)");
                                    continuarLogin = scanner.next();
                                    if (continuarLogin.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoLogin = true;
                                    }
                                    break;
                                    
                                case "3":
                                    login.vizualizarContas();
                                    System.out.println("Você Deseja Continuar Usando o MENU Login? (y/n)");
                                    continuarLogin = scanner.next();
                                    if (continuarLogin.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoLogin = true;
                                    }
                                    break;
                                    
                                default:
                                    System.out.println("Opção Não Encontrada!");
                            }
                            
                        } catch (InputMismatchException exception) {
                            System.out.println("Informe um Número Válido!");
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
                        System.out.println("\nVocê escolheu \n4- Gerenciar Vendas!");
                        System.out.println("------------------------");
                        System.out.println("1- Registrar Vendas");
                        System.out.println("2- Dar Baixa em Parcela(s)");
                        System.out.println("3- Listar Venda(s)");
                        System.out.println("4- Cancelar Venda(s)");
                        System.out.println("------------------------\n");
                        try {
                            String escolha1 = scanner.nextLine();
                            switch (escolha1) {
                                case "1":
                                    v.RegistrarVenda();
                                    System.out.println("Você Deseja Continuar Usando o Gerenciamento de Vendas? (y/n)");
                                    e1 = antiBug.nextLine();
                                    if (e1.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoVenda = true;
                                    }
                                    break;
                                    
                                case "2":
                                    v.BaixaParcela();
                                    System.out.println("Você Deseja Continuar Usando o Gerenciamento de Vendas? (y/n)");
                                    e1 = antiBug.nextLine();
                                    if (e1.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoVenda = true;
                                    }
                                    break;
                                    
                                case "3":
                                    v.Venda();
                                    System.out.println("Você Deseja Continuar Usando o Gerenciamento de Vendas? (y/n)");
                                    e1 = antiBug.nextLine();
                                    if (e1.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoVenda = true;
                                    }
                                    break;
                                    
                                case "4":
                                    v.CancelaVenda();
                                    System.out.println("Você Deseja Continuar Usando o Gerenciamento de Vendas? (y/n)");
                                    e1 = antiBug.nextLine();
                                    if (e1.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoVenda = true;
                                    }
                                    break;
                                default:
                                    System.out.println("Opção Não Encontrada!");
                            }
                        } catch (InputMismatchException exception) {
                            System.out.println("ERRO: Informe um Número Válido!");
                        }
                    }
                    if (continuarExecucao() == '0') {
                        opcaoMenu = '0';
                        finalizadoVenda = true;
                    }
                    break;

                case '5':
                    System.out.println("Você escolheu \n5- Produtos!");
                    Produto pp = new Produto();
                        System.out.println("------------------------");
                        System.out.println("1- Adicionar produto");
                        System.out.println("2- Atualizar o estoque");
                        System.out.println("------------------------\n");
                    int numCod = scanner.nextInt();
                    switch (numCod) {
                        case 1:
                            pp.Produto();
                            break;
                        case 2:
                            pp.prodAtualizarEstoque();
                            break;
                        default:
                            System.out.println("Valor Invalido");
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
                        System.out.println("Você escolheu \n6- Averiguar Estoque!");
                        System.out.println("------------------------");
                        System.out.println("1- Adicionar Produto Ao Estoque");
                        System.out.println("2- Atualizar O Produto ");
                        System.out.println("3- Listar Produto ");
                        System.out.println("4- Excluir Produto ");
                        System.out.println("------------------------\n");

                        try {
                            String escolha3 = scanner.nextLine();
                            switch (escolha3) {
                                case "1":
                                    estoque1.AdicionarProduto();
                                    System.out.println("Você Deseja Continuar Rodando o Averiguar Estoque? (y/n)");
                                    e2 = ant.nextLine();
                                    if (e2.equalsIgnoreCase("Y")) {
                                    } else {
                                        fecharEstoque = true;
                                    }
                                    break;
                                    
                                case "2":
                                    Scanner ler = new Scanner(System.in);
                                    estoque1.AtualizarProduto();
                                    System.out.println("Você Deseja Continuar Rodando o Averiguar Estoque? (y/n)");
                                    e2 = ant.nextLine();
                                    
                                    if (e2.equalsIgnoreCase("Y")) {
                                    } else {
                                        fecharEstoque = true;
                                    }
                                    break;
                                    
                                case "3":
                                    estoque1.ExibirProduto();
                                    System.out.println("Você Deseja Continuar Rodando o Averiguar Estoque? (y/n)");
                                    e2 = ant.nextLine();
                                    
                                    if (e2.equalsIgnoreCase("Y")) {
                                    } else {
                                        fecharEstoque = true;
                                    }
                                    break;
                                    
                                case "4":
                                    System.out.println("Informe a Quantidade de Produtos a Serem Removidos:");
                                    int quantidade = ant.nextInt();
                                    estoque1.RemoverProduto(quantidade);
                                    System.out.println("Você Deseja Continuar Rodando o Averiguar Estoque? (y/n)");
                                    e2 = ant.nextLine();
                                    
                                    if (e2.equalsIgnoreCase("Y")) {
                                    } else {
                                        fecharEstoque = true;
                                    }
                                    break;
                                    
                                default:
                                    System.out.println("Opção Não Encontrada!");
                            }
                        } catch (InputMismatchException exception) {
                            System.out.println("ERRO: Informe Um Número Válido!");
                        }
                    }
                    if (continuarExecucao() == '0') {
                        opcaoMenu = '0';
                    }
                    break;
                case '7':
                    System.out.println("Você escolheu \n7- Cadastrar Cliente!");
                    ArrayList<ClienteCadastro> clientes = new ArrayList<ClienteCadastro>(); 
                    ClienteCadastro cClientes[] = new ClienteCadastro[clientes.size()]; 
                    String opc;
                    
                    do {
                        System.out.println("------------------------");
                        System.out.println("1- Cadastrar Novo Cliente");
                        System.out.println("2- Editar Cliente");
                        System.out.println("3- Mostrar Cadastro de Cliente ");
                        System.out.println("4- Excluir Cliente ");
                        System.out.println("0- Sair ");                        
                        System.out.println("------------------------\n");

                        opc = scanner.nextLine();

                        int idxCliente = 0; 
                        int idCl; 
                        switch (opc) {
                            case "1" : 
                                idxCliente++; 

                                ClienteCadastro cliente = new ClienteCadastro();
                                cClientes[idxCliente] = cliente;
                                clientes.add((idxCliente-1),cClientes[idxCliente]); 

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
                                System.out.println("Opção Inválida, Tente Novamente.");
                                
                                break;
                        }
                    } while (!"0".equals(opc));
                    
                    if (continuarExecucao() == '0') {
                        opcaoMenu = '0';
                    }
                    break;

                case '0':
                    System.out.println("------------------------------------------------");
                    System.out.println("Obrigado Por Utilizar o CyberBAR!");
                    System.out.println("------------------------------------------------");
                    break;

                default:
                    System.out.println("Opção Invalida, Escolha Novamente.");
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
        System.out.print("Continuar Usando o Sistema (y/n): ");
        esperar = scanner.nextLine();
        if ("y".equals(esperar)) {
        } else {
            System.out.println("Saindo...");
            return '0';
        }
        return retorno;
    }
}
