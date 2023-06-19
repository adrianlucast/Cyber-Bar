package sistemadebar.cyberbar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @Desenvolvedor: Gabriella Cristini Galvão
 */
public class Vendas {
    Scanner ler = new Scanner(System.in);
    protected double dblValorTotal;
    protected String strDescricaoVenda;
    protected String strMarcaProduto;
    protected String StrcpfCliente;
    protected String StrformaPagamento;
    protected int intIdVenda;
    protected int intQuantidade;
    protected int intparcela;
    protected double dblValorVendaProduto;
    protected List<Vendas> listavendas = new ArrayList<>();
    Date DatedateVenda = new Date();

    public void vendas(int intIdVenda, String StrcpfCliente, String StrformaPagamento,
            String strDescricaoVenda, String strMarcaProduto, int intparcela, double dblValorVendaProduto) {
        this.intIdVenda = intIdVenda;
        this.StrcpfCliente = StrcpfCliente;
        this.StrformaPagamento = StrformaPagamento;
        this.strDescricaoVenda = strDescricaoVenda;
        this.strMarcaProduto = strMarcaProduto;
        this.dblValorVendaProduto = dblValorVendaProduto;
    }

    public void VendaTotal() {
        System.out.println("Informe a quantidade comprada do produto");
        intQuantidade = ler.nextInt();
        System.out.println("Informe o Preço do produto");
        dblValorVendaProduto = ler.nextDouble();
        dblValorTotal = dblValorVendaProduto * intQuantidade;
    }

    public void AdicionarProdutosVenda() {
        System.out.println("Digite o CPF do Cliente: ");
        StrcpfCliente = ler.next();
        System.out.println("ID da Venda: ");
        intIdVenda = ler.nextInt();
        System.out.println("Descrição da Venda: ");
        strDescricaoVenda = ler.next();
        System.out.println("Valor do Produto: ");
        dblValorVendaProduto = ler.nextDouble();
        System.out.println("Forma de Pagamento Utilizada: ");
        StrformaPagamento = ler.next();
        System.out.println("Data da Venda: " + DatedateVenda);
        listavendas.add(this);
    }

    public void CancelaVenda() {
        System.out.println("Informe o ID da Conta a ser Deletada: ");
        int id = ler.nextInt();
        for (Vendas venda : listavendas) {
            if (venda.getIntIdVenda() == id) {
                listavendas.remove(venda);
                System.out.println("Cancelamento da Venda Concluida com Sucesso!");
                return;
            } else {
                System.out.println("Venda não Encontrada Verifique se o Id Informado está Correto");
            }
        }
    }

    public void ExibirVenda() {
        System.out.println("Estas são suas Vendas!: ");
        for (Vendas venda : listavendas) {
            System.out.println(venda);
        }
    }

    public double getDblValorTotal() {
        return this.dblValorTotal;
    }

    public void setDblValorTotal(double dblValorTotal) {
        this.dblValorTotal = dblValorTotal;
    }

    public Scanner getLer() {
        return this.ler;
    }

    public void setLer(Scanner ler) {
        this.ler = ler;
    }

    public String getStrDescricaoVenda() {
        return this.strDescricaoVenda;
    }

    public void setStrDescricaoVenda(String strDescricaoVenda) {
        this.strDescricaoVenda = strDescricaoVenda;
    }

    public String getStrMarcaProduto() {
        return this.strMarcaProduto;
    }

    public void setStrMarcaProduto(String strMarcaProduto) {
        this.strMarcaProduto = strMarcaProduto;
    }

    public String getStrcpfCliente() {
        return this.StrcpfCliente;
    }

    public void setStrcpfCliente(String StrcpfCliente) {
        this.StrcpfCliente = StrcpfCliente;
    }

    public String getStrformaPagamento() {
        return this.StrformaPagamento;
    }

    public void setStrformaPagamento(String StrformaPagamento) {
        this.StrformaPagamento = StrformaPagamento;
    }

    public Date getDatedateVenda() {
        return this.DatedateVenda;
    }

    public void setDatedateVenda(Date DatedateVenda) {
        this.DatedateVenda = DatedateVenda;
    }

    public int getIntIdVenda() {
        return this.intIdVenda;
    }

    public void setIntIdVenda(int intIdVenda) {
        this.intIdVenda = intIdVenda;
    }

    public int getIntQuantidade() {
        return this.intQuantidade;
    }

    public void setIntQuantidade(int intQuantidade) {
        this.intQuantidade = intQuantidade;
    }

    public double getDblValorVendaProduto() {
        return this.dblValorVendaProduto;
    }

    public void setDblValorVendaProduto(double dblValorVendaProduto) {
        this.dblValorVendaProduto = dblValorVendaProduto;
    }
}