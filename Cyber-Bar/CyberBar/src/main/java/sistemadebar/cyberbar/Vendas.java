/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadebar.cyberbar;

/**
 *@Desenvolvedor: Gabriella Cristini Galvão
 */
public class Vendas extends Estoque{
   protected double dblValorTotal;
   
   public void VendaTotal(Produtos produtos){
        System.out.println("Informe o novo Codigo do produto");
            intIdProduto = ler.nextInt();
        System.out.println("Informe a quantidade comprada do produto");
        int quantidade= ler.nextInt();
        System.out.println("Informe o Preço do produto");
            dblValorVendaProduto = ler.nextDouble();
            dblValorTotal = dblValorVendaProduto*quantidade;
       if (this.intQuantidadeProduto >= quantidade) {
            this.intQuantidadeProduto -= quantidade;
        } else {
                System.out.println("Não há estoque suficiente disponível");
            }
        }
    public void AdicionarProdutosVenda(Produtos produto, int quantidade){
        System.out.println("Informe a Marca do Produto");
            strMarcaProduto = ler.next();
        System.out.println("Informe a Descrição do Produto");
            strDescricaoProduto = ler.next();
        System.out.println("Informe a quantidade de Produto");
    }
   }