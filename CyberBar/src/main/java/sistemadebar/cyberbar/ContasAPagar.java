package com.mycompany.cyberbaar;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lucas Pessoli
 */
public class ContasAPagar {
    private double saldo;
    private int idConta;
    private ArrayList<Conta> contas;
    public Date DataDaConta;
    public Date vencimentoDaConta;
    public String formaPagamento;
    public String nomeConta;
    public String empresaConta;
    public double valorConta;
    public int quantConta;
    public double valorEmContasPagasMes;
    public double totalAPagar;
    public int parcela;
    
    public ContasAPagar(){
        contas = new ArrayList<Conta>();
    }
    
//RASCUNHO        public void adicionarConta(String nomeConta, String empresaConta, double valorConta){
    
    public void adicionarConta(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe o nome/descrição da sua conta: ");
        String nomee = scn.nextLine();
        System.out.println("Informe o nome da empresa da qual sua conta se origina: ");
        String empresaa = scn.nextLine();
        System.out.println("Informe o valor da sua conta: ");
        Double valor = scn.nextDouble();
        if (nomee == null){
            System.out.println("Você precisa informar o nome/descricao da sua conta.");
        }else if(empresaa == null){
            System.out.println("Você precisa informar o nome da empresa da qual a conta se origina.");
        }else{
            contas.add(new Conta(nomee, empresaa, valor));
        }
    }
    
    public void PagarConta(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe o número da conta que você deseja pagar: ");
        int contaSelecionada = scn.nextInt();
        if (saldo >= contas.get(idConta).getValorConta()){
            saldo = (saldo - contas.get(contaSelecionada).getValorConta());
            System.out.println("Parabéns, você pagou a conta: "+ contas.get(contaSelecionada).getNomeConta()+ " da empresa: "+ contas.get(contaSelecionada).getEmpresaConta()+ " do valor: "+ contas.get(contaSelecionada).getValorConta() + "com sucesso! Seu novo saldo: " + saldo);
            contas.remove(contaSelecionada);
        }else{
            System.out.println("Você não tem dinheiro o suficiente!");
        }
    }
    
    public void listarContas(){
        for (int i = 0; i <contas.size();i++){
            Conta conta = contas.get(i);
            System.out.println("Conta número: "+i+" - Nome da conta: " + conta.getNomeConta() + "\nEmpresa originadora da conta: " + conta.getEmpresaConta() + "\nvalor da conta: " + conta.getValorConta()+"\n");
        }
    }
    
    public void ProcurarPorConta(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Você deseja procurar sua conta por:\n1 - Código\n2 - Nome\n");
        System.out.println("Informe o código da sua conta: ");
        int escolhaC = scn.nextInt();
        Conta conta = contas.get(escolhaC);
        System.out.println("Conta número: "+escolhaC+" - Nome da conta: " + conta.getNomeConta() + "\nEmpresa originadora da conta: " + conta.getEmpresaConta() + "\nvalor da conta: " + conta.getValorConta()+"\n");
    }
    
    public void AdicionarSaldo(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Escolha a  sua forma de pagamento:\n1 - PIX\n2 - Cartão de crédito/débito\n3 - Boleto Bancário\n4 - Recarga\n");
        String choice = scn.nextLine();
        try{
            switch (choice){
                case "1" -> System.out.println("Você escolheu o Pagamento PIX!");
                case "2" -> System.out.println("Você escolheu pagar por cartão de crédito/débito");
                case "3" -> System.out.println("Você escolheu pagar por boleto bancário");
                case "4" -> System.out.println("Você escolheu pagar por recarga");
                default -> System.out.println("Você precisa escolher um número válido listado acima!");
        }    
        }catch(Exception e){
            System.out.println("Um erro inesperado aconteceu, tente novamente.");
        }
            System.out.println("Informe a quantia do depósito: ");
            double quantia = scn.nextDouble();
            if (quantia > 0){
                setSaldo(quantia);
            }else{
                System.out.println("Você precisa informar um valor maior que 0");
            }
    }    
    
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setIdConta(int idConta){
        this.idConta = idConta;
    }
    
    public int getIdConta(){
        return this.idConta;
    }
    
    private class Conta{
        private String nomeConta;
        private String empresaConta;
        private double valorConta;
        private int idConta;
        
        public Conta(String nomeConta, String empresaConta, double valorConta){
            this.nomeConta = nomeConta;
            this.empresaConta = empresaConta;
            this.valorConta = valorConta;
        }
        
        public String getNomeConta(){
            return nomeConta;
        }

        public int getIdConta() {
            return idConta;
        }

        public void setIdConta(int idConta) {
            this.idConta = idConta;
        }
        
        public double getValorConta(){
            return valorConta;
        }
        
        public String getEmpresaConta(){
            return empresaConta;
        }
        
    }
    
}
