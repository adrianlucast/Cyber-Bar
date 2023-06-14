package sistemadebar.cyberbar;
import java.util.Scanner;


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
            System.out.println("(0)Contas\n(1)\n(2)\n(3)\n(4\n(5)\n(6)Sair");
            System.out.println("------------------------------------------------");
            menu = ler.next();
            
            switch (menu) {
                case "0":
                    System.out.println("Voce escolheu ");
                    chamadas.contas();
                    i=99;
                    break;
                case "1":
                    System.out.println("Voce escolheu !");
                    break;
                case "2":
                    System.out.println("Voce escolheu ");
                    break;
                case "3":
                    System.out.println("Voce escolheu ");
                    i=99;
                    break;
                case "4":
                    System.out.println("Voce escolheu ");
                    i=99;
                    break;
                case "5":
                    System.out.println("Voce escolheu ");
                    i=99;
                    break;
                case "6":
                    System.out.println("Sair");
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
