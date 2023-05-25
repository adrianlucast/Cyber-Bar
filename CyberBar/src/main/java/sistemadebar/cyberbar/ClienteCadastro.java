/**
 * Classe: ClienteCadastro -> Para cadastro de Clientes
 * Analista: Adrian Lucas Toderke
 * Desenvolvedor: Alan Henrique Ribeiro
 */
package sistemadebar.cyberbar;
import java.util.Scanner;
import java.util.Date;

public class ClienteCadastro {

    public static Scanner sc = new Scanner (System.in);
    static Date dateDataNascimento = new Date ();
    static int intContadorID = 0;
    boolean boolAtivo = true;
    
    public int intIdCliente;
    public String strNomeCliente;
    public String strTelefoneCliente;
    public String strPrefCliente;
    public Date dateDataNascCliente;
    
    private String strCpfCliente;
    private String strEnderecoCliente;
    private String strCepCliente;
    private String strRgCliente;
    
    public ClienteCadastro () {
        System.out.println("\nCadastro de Cliente");
        intContadorID++;
        this.intIdCliente = intContadorID;
        
        System.out.print("\nNome....: ");
        this.strNomeCliente = sc.nextLine();
        System.out.print("\nCPF.....: ");
        this.strCpfCliente = sc.nextLine();
        System.out.print("\nRG......: ");
        this.strRgCliente = sc.nextLine();
        System.out.print("\nTelefone: ");
        this.strTelefoneCliente = sc.nextLine();
        System.out.print("\nCEP.....: ");
        this.strCepCliente = sc.nextLine();
        System.out.print("\nEndereço:");
        this.strEnderecoCliente = sc.nextLine();
        
        System.out.println("\nCliente Cadastrado com Sucesso!");        
    }
    
    public void editarCliente () {
        if (this.boolAtivo == false) {
            System.out.println("Cliente Inativo");
        } else {
            System.out.println("\nEditar Cliente");
            
            System.out.print("\nNome....: ");
            this.strNomeCliente = sc.nextLine();
            System.out.print("\nCPF.....: ");
            this.strCpfCliente = sc.nextLine();
            System.out.print("\nRG......: ");
            this.strRgCliente = sc.nextLine();
            System.out.print("\nTelefone: ");
            this.strTelefoneCliente = sc.nextLine();
            System.out.print("\nCEP.....: ");
            this.strCepCliente = sc.nextLine();
            System.out.print("\nEndereço:");
            this.strEnderecoCliente = sc.nextLine();

            System.out.println("\nCadastro Alterado com sucesso!");
        }     
    }
    
    public void exibirCliente () {
        if (this.boolAtivo == false) {
            System.out.println("Cliente Inativo");
        } else {
            System.out.println("\nExibir Cliente");

            System.out.print("\nNome....: "+this.strNomeCliente);
            System.out.print("\nCPF.....: "+this.strCpfCliente);
            System.out.print("\nRG......: "+this.strRgCliente);
            System.out.print("\nTelefone: "+this.strTelefoneCliente);
            System.out.print("\nCEP.....: "+this.strCepCliente);
            System.out.print("\nEndereço:"+this.strEnderecoCliente);
        }
    }
    
    public void removerCliente () {
        String confirma;
        
        System.out.print("Confirma a remoção do Cliente?\n" +" (s/n): ");
        confirma = sc.nextLine();
        
        switch (confirma) {
            case "S", "s", "Sim" : this.boolAtivo = false; break;
            case "N", "n", "Nao" : System.out.println("Operação Cancelada"); break;
            default : System.out.println("Opção Inválida."+"Cancelando Operação!");
        }
    }

    ClienteCadastro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
