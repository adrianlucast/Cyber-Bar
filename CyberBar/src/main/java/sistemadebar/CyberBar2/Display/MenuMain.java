package sistemadebar.CyberBar2.Display;

import java.util.Scanner;

/**
 *
 * @author Alan H
 */
public class MenuMain {
    
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args){
        MenuCadastro cadastro = new MenuCadastro();
        MenuContas   contas   = new MenuContas();
        MenuEstoque  estoque  = new MenuEstoque();
        MenuVendas   vendas   = new MenuVendas();
        
        String opcao = "";
        
        while(!"0".equals(opcao)){
            System.out.println("========= Menu =========");
            System.out.println("== Selecine uma opção ==");
            System.out.println("| [1] - Cadastros      |");
            System.out.println("| [2] - Contas         |");
            System.out.println("| [3] - Estoque        |");
            System.out.println("| [4] - Vendas         |");
            System.out.println("| [0] - Sair           |");
            System.out.println("========================");
            
            opcao = scan.nextLine();
            
            switch (opcao) {
                case "1" :
                    System.out.println("iniciando menu cadastros...");
                    cadastro.menuCadastro();
                    
                    break;
                    
                case "2" :
                    System.out.println("iniciando menu contas...");
                    contas.menuContas();
                    
                    break;
                    
                case "3" :
                    System.out.println("iniciando menu estoque...");
                    estoque.menuEstoque();
                    
                    break;
                    
                case "4" :
                    System.out.println("iniciando menu vendas...");
                    vendas.menuVendas();
                    
                    break;
                    
                default :
                    System.out.println("opcao invalida");
                    
                    break;
            }
        }
        
    }
}