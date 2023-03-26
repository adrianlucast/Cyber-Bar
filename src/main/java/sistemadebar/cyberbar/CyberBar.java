package sistemadebar.cyberbar;
import java.util.Scanner;

public class CyberBar {
    public static Scanner ll = new Scanner (System.in);

    public static void main(String[] args) { 
        char valor;
        
        do{
            System.out.println("Bem-vindo ao Cyber Bar, Por favor, digite qual a função: \n1-Contas a pagar\n2-Contas a receber\n3-Cardápio\n4-Pedidos\n5-Pagar conta\n6-Averiguar estoque\n0-Sair");
            System.out.print("Função: ");
           
            valor = ll.next().charAt(0);
            switch (valor){
                case '1': 
                    System.out.println("Você escolheu contas a pagar!");
                    //ContasAPagar conta = new ContasAPagar();
                    System.out.println("Você tem um total de contas a pagar de: x Reais"); // Substituir x pela váriavel saldo
                    if (esperar() == '0'){
                        valor = '0';
                    }
                break;
                
                case '2':
                    System.out.println("Você escolheu contas a receber!");
                    //ContasAReceber contaReceber = new ContaAReceber();
                    System.out.println("Você tem um total de contas a receber de: x Contas"); // Substituir x pela váriavel Contas  
                    if (esperar() == '0'){
                        valor = '0';
                    }
                break;    
                        
                case '3':
                    System.out.println("Cardápio!");
                    //Cardapio cardapio = new Cardapio();
                    if (esperar() == '0'){
                        valor = '0';
                    }
                break;
                
                case '4':
                    System.out.println("Pedidos!");
                    // Pedidos pedido = new Pedidos();
                    if (esperar() == '0'){
                        valor = '0';
                    }
                break;
                
                case '5':
                    System.out.println("Pagar Conta!");
                    //
                    System.out.println("Parabéns a sua conta foi paga com sucesso");
                    if (esperar() == '0'){
                        valor = '0';
                    }
                break;
                
                case '6':
                    System.out.println("Averiguar estoque!");
                    //ControlarEstoque estoque = new Estoque();
                    System.out.println("Seu estoque contém: \n"); // Substituir x pela váriavel Contas
                    if (esperar() == '0'){
                        valor = '0';
                    }
                
                case '0': 
                    System.out.println("Saindo...");
                break;
                
                default : System.out.println("Opção invalida, escolha novamente.");
                    if (esperar() == '0'){
                        valor = '0';
                    }
                break;
            }
        } while (valor != '0');
    }
    
    public static char esperar(){
        String esperar;
        char retorno = '.';
        System.out.print("Continuar (y/n): ");
            esperar = ll.next();
            if ("y".equals(esperar)){
            } else {
                System.out.println("Saindo...");
                return '0';
            }
        return retorno;
    }
}
