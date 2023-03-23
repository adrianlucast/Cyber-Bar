/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadebar.cyberbar;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author aluno
 */
public class ContasAPagar {
    private double saldo;
    private int idConta;
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
    
    Scanner scn = new Scanner(System.in);
    
    public void setValorConta(double valorConta){
        this.valorConta = valorConta;
    }
    
    public double getValorConta(){
        return this.valorConta;
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
    
    public void AdicionaSaldo(){
        System.out.println("Digite a quantia que você quer adicionar de saldo: ");
        int saldoadd = scn.nextInt();
        System.out.println("Qual forma de pagamento você escolherá\n 1 - PIX\n 2 - Cartão de crédito/débito \n 3 - Boleto bancário\n 4 - Recarga");
        char metodoEscolha = scn.next().charAt(0);
        switch (metodoEscolha){
            case '1':
                System.out.println("Você escolheu:  PIX!");
                String escolhaPix = "PIX";
                break;
            case '2':
                System.out.println("Você escolheu: Cartão de crédito/débito!");
                String escolhaCartao = "Cartão de crédito/débito";
                break;
            case '3':
                System.out.println("Você escolheu: Boleto Bancário!");
                String escolhaBoleto = "Boleto bancário";
                break;
            case '4':
                System.out.println("Você escolheu: Recarga!");
                String escolhaRecarga = "Recarga";
                break;
        }
        System.out.println("Você escolheu: ");
        
    }
    
    public void Pagar(int idConta, String nomeConta, double valorConta){
        this.saldo = (getSaldo() - valorConta);
        System.out.println("Conta:"+nomeConta+" foi paga com sucesso! "+"\nNovo saldo: " + saldo);
    }
    
}
