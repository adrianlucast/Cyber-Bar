package sistemadebar.CyberBar2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @Análista: Gabriela Cristini
 * @Desenvolvedor: Lucas Pessoli
 */
public class LoginCadastro {
    private String strUser;
    private String strEmail;
    private String strSenha;
    private int intIdCadastro;
    private int intProximoId = 1;
    ArrayList<Conta> contas;
 
    public LoginCadastro(){
        contas = new ArrayList<Conta>();
    }
    
    public void Registrar(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe seu usuario: ");
        String user = scn.nextLine();
        System.out.println("Informe seu e-mail: ");
        String email = scn.nextLine();
        System.out.println("Informe sua senha: ");
        String senha = scn.nextLine();
        contas.add(new Conta(intProximoId,user, email, senha));
        intProximoId ++;
        System.out.println("============ Registrado com sucesso! ============");
    }
    
    public void Login(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe seu usuario: ");
        String user = scn.nextLine();
        System.out.println("Informe sua senha: ");
        String senha = scn.nextLine();
        if (contas.stream().anyMatch(contas -> contas.getUser().equals(user) && contas.getSenha().equals(senha))){
            System.out.println("============ Logado com sucesso! ============");
        }else{
            System.out.println("============ Login inválido! tente novamente ============");
        }
    }
    
    public void vizualizarContas(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Escolha uma das seguintes opções:\n1 - Vizualizar todas as contas registradas\n2 - Buscar uma conta pelo ID.");
        try{
            int escolha = scn.nextInt();
            switch (escolha){
                case 1:
                for (int i = 0; i<contas.size();i++){
                    Conta conta = contas.get(i);
                    System.out.println("========================"+"\nId da conta: "+ conta.getId() + "\nUsuario da conta: " + conta.getUser() + "\nE-mail da conta: " + conta.getEmail() + "\nSenha da conta: " + conta.getSenha());
                }
                break;
                case 2:
                    System.out.println("Informe o id da conta: ");
                    int buscar = scn.nextInt();
                    boolean contaEncontrada = false;
                    for(Conta conta : contas){
                        if (conta.getId() == buscar){
                            System.out.println("Conta encontrada! segue as informações: ");
                            System.out.println("========================"+"\nId da conta: "+ conta.getId() + "\nUsuario da conta: " + conta.getUser() + "\nE-mail da conta: " + conta.getEmail() + "\nSenha da conta: " + conta.getSenha());
                            contaEncontrada = true;
                        }if(!contaEncontrada){
                            System.out.println("Conta não encontrada no sistema!");
                        }
                    }
                    break;
                default:
                    System.out.println("Erro! opção não encontrada!");
                    break;
            }
        }catch (InputMismatchException exception) {
            System.out.println("Você deve informar um NÚMERO.");
            System.exit(0);
        }
    }
    
private class Conta{
    private int id;
    private String user;
    private String email;
    private String senha;
    
    public Conta(int id, String user, String email, String senha){
        this.id = id;
        this.user = user;
        this.email = email;
        this.senha = senha;
    }

        public String getUser() {
            return user;
        }

        public void setUser(String User) {
            this.user = user;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }
    }
}
