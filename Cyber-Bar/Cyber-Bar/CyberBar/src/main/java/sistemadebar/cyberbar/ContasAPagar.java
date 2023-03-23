/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadebar.cyberbar;
import java.util.Date;
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
    
    //Fazer debitar saldo, remover a conta da lista e fazer validação
    public void PagarConta(int in){
        contas.remove(in);
    }
    
    public void listarContas(){
        for (int i = 0; i <contas.size();i++){
            Conta conta = contas.get(i);
            System.out.println("Conta número: "+i+" - Nome da conta: " + conta.getNomeConta() + "\nEmpresa originadora da conta: " + conta.getEmpresaConta() + "\nvalor da conta: " + conta.getValorConta()+"\n");
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
    
    public ContasAPagar(int idConta, double valorConta, String nomeConta){
        this.idConta = idConta;
        this.valorConta = valorConta;
        this.nomeConta = nomeConta;
    }
    
    public void Pagar(String nomeConta, int idConta, double valorConta){
        this.saldo = (getSaldo() - valorConta);
        System.out.println("Novo saldo: " + saldo);
        System.out.println("");
    }
    
    private class Conta{
        private int idConta;
        private String nomeConta;
        private Date DataDaConta;
        private Date vencimentoDaConta;
        private String empresaConta;
        private double valorConta;
        private int quantConta;
        
        public Conta(String nomeConta, String empresaConta, double valorConta){
            this.nomeConta = nomeConta;
            this.empresaConta = empresaConta;
            this.valorConta = valorConta;
        }
        
        public String getNomeConta(){
            return nomeConta;
        }
        
        public double getValorConta(){
            return valorConta;
        }
        
        public String getEmpresaConta(){
            return empresaConta;
        }
    }
    
}
