package sistemadebar.cyberbar.Display;

import java.util.Scanner;
import sistemadebar.cyberbar.Estoque;
import sistemadebar.cyberbar.Fornecedor;

/**
 *
 * @author Gabriella Cristini Galvão
 */
public class MenuEstoque extends Estoque {
    Scanner ler = new Scanner(System.in);

    public void menuEstoque() {
        String escolha;
        System.out.println(
                "Escolha qual opçao deseja execultar no estoque: \n(1)Cadastro de Produtos \n(2)Atualizar Produto \n(3)Excluir Produtos \n(4)Exibir Produtos \n(0)Sair");
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
}