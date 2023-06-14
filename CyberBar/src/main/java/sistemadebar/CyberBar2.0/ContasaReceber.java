
package sistemadebar.cyberbar;
import java.util.*;

public class ContasaReceber extends Conta {
    Scanner ler = new Scanner(System.in);
    private String cliente;
    Chamadas chama = new Chamadas();
    public String strNomeCliente;
    public String strEnderecoCliente;
    public String strTelefoneCliente;
    

    public void receberFornecedor() {
        System.out.println(" Cadastro de recebimento de fornecedor");
        System.out.print("Qual prduto sera feito o estorno: ");
        String descricao = ler.nextLine();

        System.out.print("Valor do estorno: ");
        double valor = ler.nextDouble();
        ler.nextLine();

        System.out.print("Data de Vencimento (DD/MM/AAAA): ");
        String dataVencimentoStr = ler.nextLine();
        
        System.out.print("Qual o fornecedor: ");
        cliente = ler.nextLine();
        chama.contas();
    }
    public void receberCliente(){
        System.out.println("Cadastro de recebimento do cliente:");
        System.out.println("Qual o nome do cliente:");
        strNomeCliente = ler.nextLine();
        System.out.println("Qual o seu endereço:");
        strEnderecoCliente = ler.nextLine();
        System.out.println("Qual seu telefone de contato:");
        strTelefoneCliente = ler.nextLine();
        chama.contas();
    }
    
    public void mostrar(){
        System.out.println("Nome:"+strNomeCliente);
        System.out.println("Endereço"+strEndereco);
        System.out.println("Telefone:"+strTelefone);
    }
    public String getCliente() {
        return cliente;
    }
}
