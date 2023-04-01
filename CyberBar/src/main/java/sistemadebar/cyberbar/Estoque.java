package sistemadebar.cyberbar;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @Analista: Vinicius Sempkoski
 * @desenvolvedor: Gabriella Cristini
 */
public class Estoque {

    public String nomProd;
    private int codProd;
    public double precoProd;
    public String fornecedorProd;
    public Date dtEntrada;
    public String dtValidade;
    public int qtdProd;
    public int qtdMaxima;
    public String sttsProd;
    public String categoriaProd;

    Scanner ler = new Scanner(System.in);
    Date data = new Date();
    private int qtdProduto;

    public Estoque(String nomeProd, int codeProd, double precoProdu, String forneceProd, String dtValidad, int qtdProdu, int qtdMaxim, String sttsProdu, String categoriaProdu) {
        nomProd = nomeProd;
        codProd = codeProd;
        precoProd = precoProdu;
        fornecedorProd = forneceProd;
        dtValidade = dtValidad;
        qtdProd = qtdProdu;
        qtdMaxima = qtdMaxim;
        sttsProd = sttsProdu;
        categoriaProd = categoriaProdu;
    }

    public void AdicionarProduto() {
        System.out.println("Informe o Nome do produto");
        nomProd = ler.next();
        System.out.println("Informe o Codigo do produto");
        codProd = ler.nextInt();
        System.out.println("Informe o Preço do pruduto");
        precoProd = ler.nextDouble();
        System.out.println("Informe o Fornecedor");
        fornecedorProd = ler.next();
        System.out.println("Informe a Data de Validade do Produto");
        dtValidade = ler.next();
        System.out.println("Informe a Quantidade do Produto");
        qtdProd = ler.nextInt();
        System.out.println("Informe a Categoria do Produto");
        categoriaProd = ler.next();
        System.out.println("Status do Produto");
        sttsProd = ler.next();
        System.out.println(" Data de Entrega");
        dtEntrada = data;

    }

    public void RemoverProduto(int quantidade) {
        if (this.qtdProduto >= quantidade) {
             this.qtdProduto -= quantidade;
         } else {
             System.out.println("Não há estoque suficiente disponível");
         }
    }

    public void AtualizarProduto(String nomeProd, int codeProd, double precoProdu, String forneceProd, String dtValidad, int qtdProdu, int qtdMaxim, String sttsProdu, String categoriaProdu) {
        nomProd = nomeProd;
        codProd = codeProd;
        precoProd = precoProdu;
        fornecedorProd = forneceProd;
        dtValidade = dtValidad;
        qtdProd = qtdProdu;
        qtdMaxima = qtdMaxim;
        sttsProd = sttsProdu;
        categoriaProd = categoriaProdu;
    }

    public void ExibirProduto() {
        int exibir;
        exibir = codProd;
        if (exibir == codProd) {
            System.out.println("Nome Produto: " + nomProd + " Preço do Produto: " + precoProd + " Fornecedor: "
                    + fornecedorProd + " Validade do Produto: " + dtValidade + " Quantidade: " + qtdProd + " Categoria: "
                    + categoriaProd +" Status do Produto: "+sttsProd+ " Data de Entrega: " + dtEntrada);
        }
    }

    public void setCodProduto(int CodProd) {
        this.codProd = CodProd;
    }

    public int getCodProduto() {
        return codProd;
    }
}
