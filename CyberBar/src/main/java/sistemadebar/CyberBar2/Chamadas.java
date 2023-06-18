/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadebar.CyberBar2;

import java.util.Scanner;


public class Chamadas {
    public void contas(){
        String escolha = "";
        Scanner ler = new Scanner(System.in);
        ContasAPagar pagar = new ContasAPagar();
        ContasaReceber receber = new ContasaReceber();
        for(int i = 0;i<5;i++){
        System.out.println("Qual opção voce deseja\n(1)Pagar Fornecedor\n(2)Pagar Funcionario\n(3)Receber do Fornecedor\n(4)Receber do Cliente\n(5)Sair");
        escolha = ler.nextLine();
        switch (escolha) {
                            case "1":
                                System.out.println("Pagar Fornecedor");
                                pagar.pagarFornecedor();
                            break;
                            case "2":
                                System.out.println("Pagar Funcionario");
                                pagar.pagarFuncionarios();
                            break;
                            case "3":
                                System.out.println("Receber Funcionario");
                                receber.receberFornecedor();
                            break;
                            case "4":
                                System.out.println("Conta a Pagar");
                                receber.receberCliente();
                            break;
                            case "5":
                                System.out.println("Sair");
                                i=55;
                            break;
            }
        }
      
            }
        }
    }
}
