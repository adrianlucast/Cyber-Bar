/**
 *
 * @author adrian
 */

package sistemadebar.CyberBar2;

import java.util.Scanner;

public class CadastroProduto extends Cadastro{  
    public String strProdMarca;
    public String strProdFornecedor;
    public double dblProdValorCusto;
    public double dblProdValorVenda;
    public String strProdDataCadastro;
    public String strProdDataAtualizacao;
    
    public CadastroProduto(int pIdCadastro, String pDescricao, double pQuantidade,String pMarca, String pFornec, double pProdValCusto, double pProdValVenda, String pProdDataCadastro, String pProdDataAtt) {
        super(pIdCadastro, pDescricao, pQuantidade);
        this.dblProdValorCusto = pProdValCusto;
        this.dblProdValorVenda = pProdValVenda;
        this.strProdMarca = pMarca;
        this.strProdDataAtualizacao = pProdDataAtt;
        this.strProdFornecedor = pFornec;
        this.strProdDataCadastro = pProdDataCadastro; 
    
    }       

    public void setstrProdMarca(String pProdMarca){
        this.strProdMarca = pProdMarca;
    }
    public void setstrProdFornecedor(String pFornec){
        this.strProdFornecedor = pFornec;
    }
    public void setdblProdValorCusto(double pProValorCusto){
        this.dblProdValorCusto = pProValorCusto;
    }
    public void setdblProdValorVenda(double pProdValVenda){
        this.dblProdValorVenda = pProdValVenda;
    }
    public void setstrProdDataCadastro(String pProdDataCadastr){
        this.strProdDataCadastro = pProdDataCadastr;
    }
    public void setstrProdDataAtualizacaoe(String pProdDataAtt){
        this.strProdDataAtualizacao = pProdDataAtt;
    }
    
    
    
    Scanner ler = new Scanner(System.in);
    public void CadastroProduto(){
    System.out.println("------------------------------\n");
    System.out.println("Area Para Cadastro Produtos :");
    System.out.println("------------------------------\n");
    
     System.out.println("Informe a Id");
    double Id = ler.nextDouble();
    
    System.out.println("Informe o Nome");
    String Nome = ler.nextLine();
    
    System.out.println("Informe a Quantidade");
    String Quantidade = ler.nextLine();
    
     System.out.println("Informe a Marca");
    String pMarca = ler.nextLine();
    
     System.out.println("Informe o Fornecedor");
    String pFornec = ler.nextLine();
    
    System.out.println("Informe o Valor do Custo");
    double pValorCusto = ler.nextDouble();
    
    System.out.println("Informe o Valor de Venda");
    double pValorVenda = ler.nextDouble();
    
    System.out.println("Informe a Data de Cadastro");
    String pProdDataAtual  = ler.nextLine();
    
    

    }
}
    
    

