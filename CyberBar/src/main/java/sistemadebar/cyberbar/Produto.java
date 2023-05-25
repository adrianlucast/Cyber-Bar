package sistemadebar.cyberbar;
import java.util.Date;
import java.util.Scanner;
/**
 * analista: Alan Henrique Ribeiro;
 * Desenvolvedor:  Felipe Talini
 */
public class Produto {
  
    
    Scanner sc = new Scanner(System.in);
    static private Date dateDd = new Date();
    static private int intContador = 0;
    public int intProdId;
    public String strProdDescricao;
    public String strProdMarca;
     public String strProdFornecedor;
    public double dblProdEstoque;
    public String strStatusProduto;
    public int intQuantidadeMaximaProduto;
    public double dblProdValorCusto;
    public double dblProdValorVenda;
    public String strProdDataCadastro;
    public String strProdDataAtualizacao;
//geters e seters para uso em outras classe caso venham a ter necessidade
    
    
    
   

    public Produto(int intProdId, String strProdDescricao, String strProdMarca, String strProdFornecedor, double dblProdEstoque, String strStatusProduto, int intQuantidadeMaximaProduto, double dblProdValorCusto, double dblProdValorVenda, String strProdDataCadastro, String strProdDataAtualizacao) {
        this.intProdId = intProdId;
        this.strProdDescricao = strProdDescricao;
        this.strProdMarca = strProdMarca;
        this.strProdFornecedor = strProdFornecedor;
        this.dblProdEstoque = dblProdEstoque;
        this.strStatusProduto = strStatusProduto;
        this.intQuantidadeMaximaProduto = intQuantidadeMaximaProduto;
        this.dblProdValorCusto = dblProdValorCusto;
        this.dblProdValorVenda = dblProdValorVenda;
        this.strProdDataCadastro = strProdDataCadastro;
        this.strProdDataAtualizacao = strProdDataAtualizacao;
    }

    public int getProdId() {
        return intProdId;
    }

    public Double getProdValorCusto() {
        return dblProdValorCusto;
    }

    public void setProdValorCusto(Double ProdValorCusto) {
        this.dblProdValorCusto = ProdValorCusto;
    }

    public Double getProdValorVenda() {
        return dblProdValorVenda;
    }

    public void setProdValorVenda(Double ProdValorVenda) {
        this.dblProdValorVenda = ProdValorVenda;
    }

    public void setProdDataCadastro(String ProdDataCadastro) {
        this.strProdDataCadastro = ProdDataCadastro;
    }

    public void setProdDataAtualizacao(String ProdDataAtualizacao) {
        this.strProdDataAtualizacao = ProdDataAtualizacao;
    }

    public static int getContador() {
        return intContador;
    }
}
