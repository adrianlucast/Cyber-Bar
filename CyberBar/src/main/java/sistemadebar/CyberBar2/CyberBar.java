package sistemadebar.CyberBar2;
import java.util.Scanner;
import sistemadebar.cyberbar.Chamadas;


public class CyberBar {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String menu; 
        Chamadas chamadas = new Chamadas();
        for(int i = 0;i<3;i++){
            System.out.println("------------------------------------------------");
            System.out.print(  "             Bem-vindo ao Cyber Bar             ");
            System.out.println("\n----------------------------------------------");
            System.out.println("(0)Contas\n(1)Cadastro\n(2)Estoque\n(3)Vendas\n(4)Fornecedor\n(5)Sair");
            System.out.println("------------------------------------------------");
            menu = ler.next();
            
            switch (menu) {
                case "0":
                    System.out.println("Voce escolheu Contas ");
                    chamadas.contas();
                    i=99;
                    break;
                case "1":
                    System.out.println("Voce escolheu Cadastro !");
                    chamadas.cadastro();
                    break;
                case "2":
                    System.out.println("Voce escolheu Estoque ");
                    chamadas.estoque();
                    break;
                case "3":
                    System.out.println("Voce escolheu Vendas  ");
                    chamadas.vendas();
                    i=99;
                    break;
                case "4":
                    System.out.println("Voce escolheu Fornecedor ");
                    chamadas.fornecedor();
                    i=99;
                    break;
                case "5":
                    System.out.println("Voce escolheu Sair ");
                    i=99;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA!! TENTE NOVAMENTE\n\n====================================================");
                    i=0;
                    break;
            }
        }
    }
}
