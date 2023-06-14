/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadebar.cyberbar;

public class Pessoa {
    protected String strCpf;
    protected String strNome;
    protected String strSobrenome;
    
    public Pessoa(String pCPF, String pNome, String pSobrenome){
     this.strCpf = pCPF;
     this.strNome = pNome;
     this.strSobrenome = pSobrenome;
    }
    
    public void setStrCPF(String pCPF){
        this.strCpf = pCPF;
    }
    public void setStrNome(String pNome){
        this.strNome = pNome;
    }
    public void setStrSobrenome(String pSobrenome){
        this.strSobrenome = pSobrenome;
    }
    
    
}
