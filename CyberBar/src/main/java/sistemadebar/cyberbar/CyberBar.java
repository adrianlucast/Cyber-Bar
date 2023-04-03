package sistemadebar.cyberbar;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Date;

public class CyberBar {

    public static Scanner ll = new Scanner(System.in);

    public static void main(String[] args) {
        char Valor;
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

            Valor = ll.next().charAt(0);
            switch (Valor) {
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
                            case 1:
                                Scanner scn = new Scanner(System.in);
                                System.out.print("Nome da conta: ");
                                String nome = scn.nextLine();
                                System.out.print("Empresa da conta: ");
                                String empresa = scn.nextLine();
                                System.out.print("Valor da conta: ");
                                double valor = scn.nextDouble();
                                contasAPagar.adicionarConta(nome, empresa, valor);
                                System.out.println("Conta adicionada com sucesso!\n");
                                break;

                            case 2:
                                Scanner sc = new Scanner(System.in);
                                System.out.print("ID da conta a pagar: ");
                                int idPagar = sc.nextInt();
                                contasAPagar.pagarConta(idPagar);
                                break;

                            case 3:
                                contasAPagar.listarContas();
                                System.out.println();
                                break;

                            case 4:
                                Scanner scne = new Scanner(System.in);
                                System.out.print("ID da conta a procurar: ");
                                int idProcurar = scne.nextInt();
                                contasAPagar.procurarPorConta(idProcurar);
                                System.out.println();
                                break;

                            case 5:
                                Scanner scnr = new Scanner(System.in);
                                System.out.print("Valor a adicionar: ");
                                double saldoAdicionado = scnr.nextDouble();
                                contasAPagar.adicionarSaldo(saldoAdicionado);
                                break;

                            case 6:
                                System.out.println("Saldo atual: R$" + contasAPagar.getSaldo() + "\n");
                                break;
                            case 0:
                                sair = true;
                                break;
                            default:
                                System.out.println("Opção inválida!\n");
                                break;
                        }
                    }
                    if (esperar() == '0') {
                        Valor = '0';
                    }
                    break;

                case '2':
                    System.out.println("Você escolheu 2-contas a receber!");
                    //ContasAReceber contaReceber = new ContaAReceber();
                    System.out.println("Você tem um total de contas a receber de: x Contas"); // Substituir x pela váriavel Contas  
                    if (esperar() == '0') {
                        Valor = '0';
                    }
                    break;

                case '3':
                    String e;
                    LoginCadastro l = new LoginCadastro();
                    finalizadoLogin = false;
                    while (finalizadoLogin == false) {
                        System.out.println("\nVocê escolheu 3-Login!");
                        System.out.println("Você deseja:\n[1] - REGISTRAR\n[2] - LOGAR(\n[3] - LISTAR CONTA(S)");
                        try {
                            int escolha = ll.nextInt();
                            switch (escolha) {
                                case 1:
                                    l.Registrar();
                                    System.out.println("Você deseja continuar rodando o LOGIN? (y/n)");
                                    e = ll.next();
                                    if (e.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoLogin = true;
                                    }
                                    break;
                                case 2:
                                    l.Login();
                                    System.out.println("Você deseja continuar rodando o LOGIN? (y/n)");
                                    e = ll.next();
                                    if (e.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoLogin = true;
                                    }
                                    break;
                                case 3:
                                    l.vizualizarContas();
                                    System.out.println("Você deseja continuar rodando o LOGIN? (y/n)");
                                    e = ll.next();
                                    if (e.equalsIgnoreCase("Y")) {
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
                    if (esperar() == '0') {
                        Valor = '0';
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
                            int escolha1 = ll.nextInt();
                            switch (escolha1) {
                                case 1:
                                    v.RegistrarVenda();
                                    System.out.println("Você deseja continuar rodando o Gerenciamento de vendas? (y/n)");
                                    e1 = antiBug.nextLine();
                                    if (e1.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoVenda = true;
                                    }
                                    break;
                                case 2:
                                    v.BaixaParcela();
                                    System.out.println("Você deseja continuar rodando o Gerenciamento de vendas? (y/n)");
                                    e1 = antiBug.nextLine();
                                    if (e1.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoVenda = true;
                                    }
                                    break;
                                case 3:
                                    v.Venda();
                                    System.out.println("Você deseja continuar rodando o Gerenciamento de vendas? (y/n)");
                                    e1 = antiBug.nextLine();
                                    if (e1.equalsIgnoreCase("Y")) {
                                    } else {
                                        finalizadoVenda = true;
                                    }
                                    break;
                                case 4:
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
                    if (esperar() == '0') {
                        Valor = '0';
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
                        Valor = '0';
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
                            int escolha3 = ll.nextInt();
                            switch (escolha3) {
                                case 1:
                                    estoque1.AdicionarProduto();
                                    System.out.println("Você deseja continuar rodando o Averiguar Estoque? (y/n)");
                                    e2 = ant.nextLine();
                                    if (e2.equalsIgnoreCase("Y")) {
                                    } else {
                                        fecharEstoque = true;
                                    }
                                    break;
                                case 2:
                                    Scanner ler = new Scanner(System.in);
                                    estoque1.AtualizarProduto();
                                    System.out.println("Você deseja continuar rodando o Averiguar Estoque? (y/n)");
                                    e2 = ant.nextLine();
                                    if (e2.equalsIgnoreCase("Y")) {
                                    } else {
                                        fecharEstoque = true;
                                    }
                                    break;
                                case 3:
                                    estoque1.ExibirProduto();
                                    System.out.println("Você deseja continuar rodando o Averiguar Estoque? (y/n)");
                                    e2 = ant.nextLine();
                                    if (e2.equalsIgnoreCase("Y")) {
                                    } else {
                                        fecharEstoque = true;
                                    }
                                    break;
                                case 4:
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
                    if (esperar() == '0') {
                        Valor = '0';
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

                        opc = ll.nextLine();

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
                                idCl = ll.nextInt();
                                ll.nextLine();

                                cClientes[idCl].editarCliente();
                                clientes.add (idCl, cClientes[idCl]);

                                break;

                            case "3" : 
                                System.out.print("Informe o ID do Cliente: ");
                                idCl = ll.nextInt();
                                ll.nextLine();

                                cClientes[idCl].exibirCliente();

                                break;

                            case "4" : 
                                System.out.print("Informe o ID do Cliente: ");
                                idCl = ll.nextInt();
                                ll.nextLine();

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
                    
                    if (esperar() == '0') {
                        Valor = '0';
                    }
                    break;

                case '0':
                    System.out.println("------------------------------------------------");
                    System.out.println("OBRIGADO POR UTILIZAR O CYBERBAR!");
                    System.out.println(" ");
                    break;

                default:
                    System.out.println("Opção invalida, escolha novamente.");
                    if (esperar() == '0') {
                        Valor = '0';
                    }
                    break;
            }
        } while (Valor != '0');
    }

    public static char esperar() {
        String esperar;
        char retorno = '.';
        System.out.print("Continuar usando o sistema (y/n): ");
        esperar = ll.nextLine();
        if ("y".equals(esperar)) {
        } else {
            System.out.println("Saindo...");
            return '0';
        }
        return retorno;
    }
}
