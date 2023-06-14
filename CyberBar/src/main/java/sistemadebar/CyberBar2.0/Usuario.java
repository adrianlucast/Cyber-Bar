/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadebar.cyberbar;

/**
 *
 * @author felip
 */
public class Usuario extends Pessoa {
    private String strNomeUsuario;
    private String strSenha;
    
    private int intMatricula;
    
    public Usuario(String pCPF, String pNome, String pSobrenome,int pMatr) {
        super (pCPF, pNome, pSobrenome); 
        this.intMatricula = pMatr;
    }
    public int getId(){
        return intMatricula;
    }
    
    
}
