package sistemadebar.cyberbar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Desenvolvedor: Gabriella Cristini Galvão
 */
public class Estoque extends Produtos {
    Scanner ler = new Scanner(System.in);
    protected List<Estoque> listaestoque = new ArrayList<>();

    protected void cadastrarProduto() {
        System.out.println("Informe a Marca do Produto");
        strMarcaProduto = ler.next();
        System.out.println("Informe a Descrição do Produto");
        strDescricaoProduto = ler.next();
        strStatusProduto = "Disponivel";
        System.out.println("Informe a Data de Cadastro do Produto(DD/MM/AAAA)");
        strDataCadastroProduto = ler.next();
        System.out.println("Informe o novo Preço do produto");
        dblValorVendaProduto = ler.nextDouble();
        System.out.println("Informe a quantidade do produto");
        intQuantidadeProduto = ler.nextInt();
        System.out.println("Informe a quantidade maxima permitida do produto");
        intQuantidadeMaxProduto = ler.nextInt();
        System.out.println("Informe o novo Codigo do produto");
        intIdProduto = ler.nextInt();
        listaestoque.add(this);
    }

    protected void AtualizarProduto() {
        System.out.println("Informe a nova Quantidade do Produto");
        int qtdToAdd = ler.nextInt();
        if (intQuantidadeProduto + qtdToAdd <= intQuantidadeMaxProduto) {
            intQuantidadeProduto += qtdToAdd;
        } else {
            System.out.println(
                    "Não é possível adicionar essa quantidade de produto, pois excede a quantidade máxima permitida.");
        }
        System.out.println("Informe a Marca do Produto");
        strMarcaProduto = ler.next();
        System.out.println("Informe a Descrição do Produto");
        strDescricaoProduto = ler.next();
        strStatusProduto = "Disponivel";
        System.out.println("Informe a Data de Cadastro do Produto(DD/MM/AAAA)");
        strDataCadastroProduto = ler.next();
        System.out.println("Informe o novo Preço do produto");
        dblValorVendaProduto = ler.nextDouble();
        System.out.println("Informe o novo Codigo do produto");
        intIdProduto = ler.nextInt();
    }

    protected void RemoverProduto() {
        System.out.println("Informe a quantidade para ser removida");
        int quantidade = ler.nextInt();
        for (Estoque produto : listaestoque) {
            if (this.strStatusProduto.equalsIgnoreCase("disponivel")) {
                if (this.intQuantidadeProduto >= quantidade) {
                    listaestoque.remove(produto);
                } else {
                    System.out.println("Não há estoque suficiente disponível");
                }
            } else {
                System.out.println("O produto encontra-se indisponivel para remoção.");
            }
        }
    }

    protected void ExibirProduto() {
        if (strStatusProduto.equalsIgnoreCase("disponível")) {
            int intExibir;
            intExibir = intIdProduto;
            if (intExibir == intIdProduto) {
                System.out.println("Descrição do Produto: " + strDescricaoProduto + " Marca do Produto: "
                        + strMarcaProduto + " Data de Cadastro do Produto: " + strDataCadastroProduto
                        + " Quantidade Disponivel de Produto: " + intQuantidadeProduto + " Valor do Produto: R$"
                        + dblValorVendaProduto);
            }
        } else {
            System.out.println("Produto Indisponivel");
            System.out.println("Quer atualizar o produto agora:(0)Sim(1)Não");
            String escolha;
            escolha = ler.nextLine();
            if (escolha == "0") {
                cadastrarProduto();
            } else {
                System.out.println("---Obrigado Por Utilizar---");
            }
        }
    }
}