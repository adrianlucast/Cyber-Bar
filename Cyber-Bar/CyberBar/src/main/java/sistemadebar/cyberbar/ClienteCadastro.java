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
    static Date dataNasc = new Date ();
    static int CONTADORID = 0;
    String data;
    boolean ativo = true;
    
    // atributos publicos
    public int idCliente;
    public String nomeCliente;
    public String telefoneCliente;
    public String prefCliente;
    public Date datanascCliente;
    
    // atributos privados
    private String cpfCliente;
    private String enderecoCliente;
    private String cepCliente;
    private String rgCliente;
    
    public void adicionarCliente () {
        System.out.println("\nCADASTRO DE CLIENTES");
        CONTADORID++;
        this.idCliente = CONTADORID;
        
        // inserção dos dados pelo cadastro de clientes
        System.out.print("\nNome....: ");
        this.nomeCliente = sc.nextLine();
        System.out.print("\nCPF.....: ");
        this.cpfCliente = sc.nextLine();
        System.out.print("\nRG......: ");
        this.rgCliente = sc.nextLine();
        System.out.print("\nTelefone: ");
        this.telefoneCliente = sc.nextLine();
        System.out.print("\nCEP.....: ");
        this.cepCliente = sc.nextLine();
        System.out.print("\nEndereço:");
        this.enderecoCliente = sc.nextLine();
        
        System.out.println("\nCliente Cadastrado com Sucesso!");        
    }
    
    public void editarCliente () {
        if (this.ativo == false) {
            System.out.println("Cliente Inativo");
        } else {
            System.out.println("\nEDITAR CLIENTE");
            
            // alteração dos dados pela edição de clientes
            System.out.print("\nNome....: ");
            this.nomeCliente = sc.nextLine();
            System.out.print("\nCPF.....: ");
            this.cpfCliente = sc.nextLine();
            System.out.print("\nRG......: ");
            this.rgCliente = sc.nextLine();
            System.out.print("\nTelefone: ");
            this.telefoneCliente = sc.nextLine();
            System.out.print("\nCEP.....: ");
            this.cepCliente = sc.nextLine();
            System.out.print("\nEndereço:");
            this.enderecoCliente = sc.nextLine();

            System.out.println("\nCadastro Alterado com sucesso!");
        }     
    }
    
    public void exibirCliente () {
        if (this.ativo == false) {
            System.out.println("Cliente Inativo");
        } else {
            System.out.println("\nEXIBIR CLIENTE");

            // exibição dos dados
            System.out.print("\nNome....: "+this.nomeCliente);
            System.out.print("\nCPF.....: "+this.cpfCliente);
            System.out.print("\nRG......: "+this.rgCliente);
            System.out.print("\nTelefone: "+this.telefoneCliente);
            System.out.print("\nCEP.....: "+this.cepCliente);
            System.out.print("\nEndereço:"+this.enderecoCliente);
        }
    }
    
    public void removerCliente () {
        // validação
        String confirma;
        
        System.out.print("Confirma a remoção do Cliente?\n"
                        +"R: ");
        confirma = sc.nextLine();
        
        switch (confirma) {
            case "S", "s", "Sim" : this.ativo = false; break;
            case "N", "n", "Nao" : System.out.println("Operação cancelada"); break;
            default : System.out.println("Opção Inválida."
                                        +"Cancelando operação!");
        }
    }
}
