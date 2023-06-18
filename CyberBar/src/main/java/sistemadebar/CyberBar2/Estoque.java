package sistemadebar.CyberBar2;

import java.util.Scanner;

/**
 * @Desenvolvedor: Gabriella Cristini Galvão
 */
public class Estoque extends Produtos {
    Scanner ler = new Scanner(System.in);

    public void menuEstoque() {
        String escolha;
        System.out.println(
                "Escolha qual opçao deseja execultar no estoque: \n(1)Cadastro de Produtos \n(2)Atualizar Produto \n(3)Excluir Produtos \n(4)Exibir Produtos");
        escolha = ler.nextLine();

        switch (escolha) {
            case "1":
                cadastrarProduto();
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.CadastrarFornecedor();
                break;
            case "2":
                AtualizarProduto();
                break;
            case "3":
                RemoverProduto();
                break;
            case "4":
                ExibirProduto();
                Fornecedor fornecedor1 = new Fornecedor();
                fornecedor1.ExibirFornecedor();
                break;
            case "0":
                System.out.println("--- Obrigado por utilizar o sistema! ---");
                return;
            default:
                System.out.println("Opção Não Encontrada!");
        }
    }

    private void cadastrarProduto() {
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
    }

    private void AtualizarProduto() {
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

    private void RemoverProduto() {
        System.out.println("Informe a quantidade para ser removida");
        int quantidade = ler.nextInt();
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

    private void ExibirProduto() {
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