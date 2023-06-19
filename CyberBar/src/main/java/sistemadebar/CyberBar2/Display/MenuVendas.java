package sistemadebar.CyberBar2.Display;

import sistemadebar.CyberBar2.Vendas;
import java.util.Scanner;

/**
 *
 * @author Gabriella Cristini Galvão
 */
public class MenuVendas extends Vendas {
    Scanner ler = new Scanner(System.in);

    public void menuVendas() {
        String escolha;
        System.out.println(
                "Escolha qual opçao deseja execultar no estoque: \n(1)Adicionar Produtos da Venda \n(2)Cancelar Venda \n(3)VendaTotal() \n(4)Exibir Vendas \n(0)Sair");
        escolha = ler.nextLine();

        switch (escolha) {
            case "1":
                AdicionarProdutosVenda();
                break;
            case "2":
                CancelaVenda();
                break;
            case "3":
                VendaTotal();
                break;
            case "4":
                ExibirVenda();
                break;
            case "0":
                System.out.println("--- Obrigado por utilizar o sistema! ---");
                return;
            default:
                System.out.println("Opção Não Encontrada!");
        }
    }
}