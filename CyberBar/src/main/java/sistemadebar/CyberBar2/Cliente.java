/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadebar.CyberBar2;

/**
 *
 * @author felip
 */
public class Cliente extends Pessoa{

    
    private int intId;
    public Cliente(String pCPF, String pNome, String pSobrenome, int pId) {
        super (pCPF, pNome, pSobrenome); 
        this.intId = pId;
    }

    public void setIntId(int pId){
        this.intId = pId;
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
