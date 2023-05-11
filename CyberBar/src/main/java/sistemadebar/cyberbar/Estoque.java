package sistemadebar.cyberbar;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @Analista: Vinicius Sempkoski
 * @desenvolvedor: Gabriella Cristini
 */
public class Estoque {
    public String strNomeProduto;
    private int intCodigoProduto;
    public double douPrecoProduto;
    public String strFornecedorProduto;
    public Date dateDataEntradaProduto;
    public String strDataValidadeProduto;
    public int intQuantidadeProduto;
    public int intQuantidadeMaximaProduto;
    public String strStatusProduto;
    public String strCategoriaProduto;

    Scanner ler = new Scanner(System.in);
    Date dateData = new Date();
    
    public Estoque() { 
    }
    
    public Estoque(String strNomeProduto1, int intCodigoProduto1, double douPrecoProduto1, String StringFornecedorProduto1, String dateDataValidadeProduto1, int intQuantidadeProduto1, int intQuantidadeMaximaProduto1, String strStatusProduto1, String strCategoriaProduto1) {
        strNomeProduto = strNomeProduto1;
        intCodigoProduto = intCodigoProduto1;
        douPrecoProduto = douPrecoProduto1;
        strFornecedorProduto = StringFornecedorProduto1;
        strDataValidadeProduto = dateDataValidadeProduto1;
        intQuantidadeProduto = intQuantidadeProduto1;
        intQuantidadeMaximaProduto = intQuantidadeMaximaProduto1;
        strStatusProduto = strStatusProduto1;
        strCategoriaProduto = strCategoriaProduto1;
    }
    
    public void AdicionarProduto() {
        System.out.println("Informe o Nome do produto");
        strNomeProduto = ler.next();
        System.out.println("Informe o Codigo do produto");
        intCodigoProduto = ler.nextInt();
        System.out.println("Informe o Preço do pruduto");
        douPrecoProduto = ler.nextDouble();
        System.out.println("Informe o Fornecedor");
        strFornecedorProduto = ler.next();
        System.out.println("Informe a Data de Validade do Produto");
        strDataValidadeProduto = ler.next();
        System.out.println("Informe a Quantidade do Produto");
        intQuantidadeProduto = ler.nextInt();
        System.out.println("Informe a Quantidade Maxima de Armazenagem do Produto");
        intQuantidadeMaximaProduto = ler.nextInt();
        System.out.println("Informe a Categoria do Produto");
        strCategoriaProduto = ler.next();
        System.out.println("Status do Produto");
        strStatusProduto = ler.next();
        System.out.println(" Data de Entrega");
        dateDataEntradaProduto = dateData;
    }
    
    public void RemoverProduto(int quantidade) {
        if (this.strStatusProduto.equalsIgnoreCase("disponivel")) {
            if (this.intQuantidadeProduto >= quantidade) {
                this.intQuantidadeProduto -= quantidade;
            } else {
                System.out.println("Não há estoque suficiente disponível");
            }
        } else {
            System.out.println("O produto encontra-se indisponivel para remoção.");
        }
    }

    public void AtualizarProduto() {
        System.out.println("Informe o novo Nome do produto");
        strNomeProduto = ler.next();
        System.out.println("Informe o novo Codigo do produto");
        intCodigoProduto = ler.nextInt();
        System.out.println("Informe o novo Preço do pruduto");
        douPrecoProduto = ler.nextDouble();
        System.out.println("Informe o novo Fornecedor");
        strFornecedorProduto = ler.next();
        System.out.println("Informe a nova Data de Validade do Produto");
        strDataValidadeProduto = ler.next();
        System.out.println("Informe a nova Quantidade do Produto");
        int qtdToAdd = ler.nextInt();
        
        if (intQuantidadeProduto + qtdToAdd <= intQuantidadeMaximaProduto) { 
            intQuantidadeProduto += qtdToAdd;
        } else {
            System.out.println("Não é possível adicionar essa quantidade de produto, pois excede a quantidade máxima permitida.");
        }
        
        System.out.println("Informe a nova Categoria do Produto");
        strCategoriaProduto = ler.next();
        System.out.println("Novo Status do Produto");
        strStatusProduto = ler.next();
    }

    public void ExibirProduto() {
        if (strStatusProduto.equalsIgnoreCase("disponível")) {
            int intExibir;
            intExibir = intCodigoProduto;
            if (intExibir == intCodigoProduto) {
                System.out.println("Nome Produto: " + strNomeProduto + " Preço do Produto: " + douPrecoProduto + " Fornecedor: "
                        + strFornecedorProduto + " Validade do Produto: " + strDataValidadeProduto + " Quantidade: " + intQuantidadeProduto + " Categoria: "
                        + strCategoriaProduto + " Data de Entrega: " + dateDataEntradaProduto);
            }
        } else {
            System.out.println("Produto Indisponivel");
        }
    }

    public void setCodProduto(int CodProd) {
        this.intCodigoProduto = CodProd;
    }
    
    public int getCodProduto() {
        return intCodigoProduto;
    }

}