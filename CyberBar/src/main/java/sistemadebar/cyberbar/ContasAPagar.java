/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadebar.cyberbar;
import java.util.Date;


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
    
}
