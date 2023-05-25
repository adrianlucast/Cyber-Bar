package sistemadebar.cyberbar;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @Analista: Vinicius Sempkoski
 * @desenvolvedor: Gabriella Cristini
 * @alteração Gabriella Cristini,Matheus Schmidt
 */
public class Estoque extends Produto  {
    
    public Estoque(int intProdId, String strProdDescricao, String strProdMarca, String strProdEmbalagem, double dblProdEstoque, String strStatusProduto, int intQuantidadeMaximaProduto, double dblProdValorCusto, double dblProdValorVenda, String strProdDataCadastro, String strProdDataAtualizacao, Date dateDataEntradaProduto, String strDataValidadeProduto, int intQuantidadeProduto) {
        super(intProdId, strProdDescricao, strProdMarca, strProdEmbalagem, dblProdEstoque, strStatusProduto, intQuantidadeMaximaProduto, dblProdValorCusto, dblProdValorVenda, strProdDataCadastro, strProdDataAtualizacao);
    }
    
    public void menu(){
        String escolha;
        System.out.println("Qual a opção que voce deseja:\n(0)Cadastro Produto\n(1)Atualizar Produto\n(2)Exibir Produto\n(3)Remover Produto");
        escolha  = ler.nextLine();
        
        if(escolha == "0"){
            CadastrarProduto();
        }else if(escolha == "1"){
            AtualizarProduto();
        }else if(escolha == "2"){
            ExibirProduto();
        }else if(escolha == "3"){
            RemoverProduto();
        }
    }
 
    public String strProdDataCadastro;
    public int dblProdEstoque;
    public String strStatusProduto;
    public String strCategoriaProduto;

    Scanner ler = new Scanner(System.in);
    Date dateData = new Date();

    public void RemoverProduto() {
         System.out.println("Informe a quantidade para ser removida");
        int quantidade= ler.nextInt();
        if (this.strStatusProduto.equalsIgnoreCase("disponivel")) {
            if (this.dblProdEstoque >= quantidade) {
                this.dblProdEstoque -= quantidade;
            } else {
                System.out.println("Não há estoque suficiente disponível");
            }
        } else {
            System.out.println("O produto encontra-se indisponivel para remoção.");
        }
    }
    
    public void CadastrarProduto() {
        System.out.println("Informe a descrição do produto");
        strProdDescricao = ler.next();
        System.out.println("Informe o novo Codigo do produto");
        intProdId = ler.nextInt();
        System.out.println("Informe o novo Preço do produto");
        dblProdValorVenda = ler.nextDouble();
        System.out.println("Informe o novo Fornecedor");
        strProdFornecedor = ler.next();
        System.out.println("Informe a nova Data de Cadastro do Produto");
        strProdDataCadastro = ler.next();
         System.out.println("Informe a quantidade do Produto: ");
        dblProdEstoque = ler.nextInt();
        System.out.println("Informe a quantidade Maxima que o estoque armazena do Produto: ");
        intQuantidadeMaximaProduto = ler.nextInt();
        System.out.println("Informe a nova Categoria do Produto");
        strCategoriaProduto = ler.next();
        System.out.println("Novo Status do Produto");
        strStatusProduto = ler.next();
    }

    public void AtualizarProduto() {
        System.out.println("Informe a descrição do produto");
        strProdDescricao = ler.next();
        System.out.println("Informe o novo Codigo do produto");
        intProdId = ler.nextInt();
        System.out.println("Informe o novo Preço do produto");
        dblProdValorVenda = ler.nextDouble();
        System.out.println("Informe o novo Fornecedor");
        strProdFornecedor = ler.next();
        System.out.println("Informe a nova Data de Cadastro do Produto");
        strProdDataCadastro = ler.next();
        System.out.println("Informe a nova Quantidade do Produto");
        int qtdToAdd = ler.nextInt();
        
        if (dblProdEstoque + qtdToAdd <= intQuantidadeMaximaProduto) { 
            dblProdEstoque += qtdToAdd;
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
            intExibir = intProdId;
            if (intExibir == intProdId) {
                System.out.println("Nome Produto: " + strProdDescricao + " Preço do Produto: " + dblProdValorVenda + " Fornecedor: "
                        + strProdFornecedor + " Validade do Produto: " + strProdDataCadastro + " Quantidade: " + dblProdEstoque + " Categoria: "
                        + strCategoriaProduto + " Data de Entrega: " + strProdDataCadastro);
            }
        } else {
            System.out.println("Produto Indisponivel");
            System.out.println("Quer atualizar o produto agora:(0)Sim(1)Não");
            String escolha;
            escolha = ler.nextLine();
            if(escolha == "0"){
                CadastrarProduto();
            }else{
                System.out.println("Aq chama o menu");
            }
        }
    }
    
    public void setCodProduto(int CodProd) {
        this.intProdId = CodProd;
    }
    
    public int getCodProduto() {
        return intProdId;
    }

}