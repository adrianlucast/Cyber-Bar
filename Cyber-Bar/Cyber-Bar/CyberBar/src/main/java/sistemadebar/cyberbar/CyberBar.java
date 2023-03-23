package sistemadebar.cyberbar;
import java.util.Scanner;

public class CyberBar {

    public static void main(String[] args) { 
        System.out.println("Bem-vindo ao Cyber Bar, Por favor, digite qual a função: \n1-Contas a pagar\n2-Contas a receber\n3-Cardápio\n4-Pedidos\n5-Pagar conta\n6-Averiguar estoque");
        Scanner ll = new Scanner (System.in);
        char valor= ll.next().charAt(0);
        switch (valor){
                case '1': 
                    System.out.println("Você escolheu contas a pagar!: !");
                    //ContasAPagar conta = new ContasAPagar();
                    System.out.println("Você tem um total de contas a pagar de: x Reais"); // Substituir x pela váriavel saldo

                    
                break;
                
                case '2':
                    System.out.println("Você escolheu contas a receber!: !");
                    //ContasAReceber contaReceber = new ContaAReceber();
                    System.out.println("Você tem um total de contas a receber de: x Contas"); // Substituir x pela váriavel Contas

                    
                break;    
                       
                case '3':
                   System.out.println("Cardápio!: !");
                   //Cardapio cardapio = new Cardapio();
                
                break;
                case '4':
                    System.out.println("Pedidos!: !");
                    // Pedidos pedido = new Pedidos();
                    
                break;
                case '5':
                    System.out.println("Pagar Conta!: !");
                    //
                    System.out.println("Parabéns a sua conta foi paga com sucesso");

                break;
                case '6':
                    System.out.println("Averiguar estoque!");
                    //ControlarEstoque estoque = new Estoque();
                    System.out.println("Seu estoque contém: \n"); // Substituir x pela váriavel Contas

                break;
        }
    }
}
