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

    public Estoque() {
        //Construtor vazio
    }

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
        System.out.println("Informe a Quantidade Maxima de Armazenagem do Produto");
        qtdMaxima = ler.nextInt();
        System.out.println("Informe a Categoria do Produto");
        categoriaProd = ler.next();
        System.out.println("Status do Produto");
        sttsProd = ler.next();
        System.out.println(" Data de Entrega");
        dtEntrada = data;

    }

    public void RemoverProduto(int quantidade) {
        if (this.sttsProd.equals("disponivel")) { // verifica se o status está disponível
            if (this.qtdProd >= quantidade) {
                this.qtdProd -= quantidade;
            } else {
                System.out.println("Não há estoque suficiente disponível");
            }
        } else {
            System.out.println("O produto encontra-se indisponivel para remoção.");
        }
    }

    public void AtualizarProduto() {
        System.out.println("Informe o novo Nome do produto");
        nomProd = ler.next();
        System.out.println("Informe o novo Codigo do produto");
        codProd = ler.nextInt();
        System.out.println("Informe o novo Preço do pruduto");
        precoProd = ler.nextDouble();
        System.out.println("Informe o novo Fornecedor");
        fornecedorProd = ler.next();
        System.out.println("Informe a nova Data de Validade do Produto");
        dtValidade = ler.next();
        System.out.println("Informe a nova Quantidade do Produto");
        int qtdToAdd = ler.nextInt();
        if (qtdProd + qtdToAdd <= qtdMaxima) { //verifica se a quantidade que está sendo adicionada não excede a quantidade máxima permitida
            qtdProd += qtdToAdd;
        } else {
            System.out.println("Não é possível adicionar essa quantidade de produto, pois excede a quantidade máxima permitida.");
        }
        System.out.println("Informe a nova Categoria do Produto");
        categoriaProd = ler.next();
        System.out.println("Novo Status do Produto");
        sttsProd = ler.next();
    }

    public void ExibirProduto() {
        if (sttsProd.equalsIgnoreCase("disponível")) {
            int exibir;
            exibir = codProd;
            if (exibir == codProd) {
                System.out.println("Nome Produto: " + nomProd + " Preço do Produto: " + precoProd + " Fornecedor: "
                        + fornecedorProd + " Validade do Produto: " + dtValidade + " Quantidade: " + qtdProd + " Categoria: "
                        + categoriaProd + " Data de Entrega: " + dtEntrada);
            }
        } else {
            System.out.println("Produto Indisponivel");
        }
    }

    public void setCodProduto(int CodProd) {
        this.codProd = CodProd;
    }

    public int getCodProduto() {
        return codProd;
    }

}
