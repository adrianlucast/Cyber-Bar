package sistemadebar.CyberBar2;

import java.util.ArrayList;
import java.util.Scanner;
import sistemadebar.cyberbar.Chamadas;


public class ContasAPagar extends Conta {
    
    Scanner ler = new Scanner(System.in);
    private String fornecedor;
    Chamadas chama = new Chamadas();
    public String strNomeFuncionario;
    public String strCargoFuncionario;
    public double dblSalarioFuncionario;
    

    public void pagarFornecedor() {
        System.out.println(" Cadastro para pagamento de fornecedores: ");
        System.out.print("Qual a descrição do produto a ser pago: ");
        String descricao = ler.nextLine();

        System.out.print("Qual o valor do produto: ");
        double valor = ler.nextDouble();

        System.out.print("Data de Vencimento (DD/MM/AAAA): ");
        String dataVencimentoStr = ler.nextLine();

        System.out.print("Qual o fornecedor: ");
        fornecedor = ler.nextLine();
        chama.contas();
    }
    public void pagarFuncionarios(){
        System.out.println("Cadastro de pagamento de funcionarios:");
        System.out.println("Qual o nome do funcionario:");
        strNomeFuncionario = ler.nextLine();
        
        System.out.println("Qual o cargo:");
        strCargoFuncionario = ler.nextLine();
        
        System.out.println("Qual o salario:");
        dblSalarioFuncionario = ler.nextDouble();
        chama.contas();
    }
    
    public void mostrar(){
        System.out.println("Nome:"+strNomeFuncionario);
        System.out.println("Endereço"+strCargoFuncionario);
        System.out.println("Telefone:"+dblSalarioFuncionario);
    }
    public String getFornecedor() {
        return fornecedor;
    }
    
}
