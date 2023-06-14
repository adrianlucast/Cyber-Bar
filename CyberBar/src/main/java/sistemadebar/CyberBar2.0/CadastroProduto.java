/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadebar.cyberbar;

import java.util.Scanner;

public class CadastroProduto extends Cadastro{  
    public String strProdMarca;
    public String strProdFornecedor;
    public double dblProdValorCusto;
    public double dblProdValorVenda;
    public String strProdDataCadastro;
    public String strProdDataAtualizacao;
    
    public void Cadastrar(int pId, String pNome, double pQuantidade,String pMarca, String pFornec, double pProdValCusto, double pProdValVenda, String pProdDataCadastro, String pProdDataAtual) {
        super.Cadastrar(pId, pNome, pQuantidade);
        this.dblProdValorCusto = pProdValCusto;
        this.dblProdValorVenda = pProdValVenda;
        this.strProdMarca = pMarca;
        this.strProdDataAtualizacao = pProdDataAtual;
        this.strProdFornecedor = pFornec;
        this.strProdDataCadastro = pProdDataCadastro; 
    
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
    
    

