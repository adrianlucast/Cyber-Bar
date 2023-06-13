/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.cyber.barv2;

/**
 *
 * @author felip
 */
public class Cliente extends Pessoa{

    private int intId;
    public void definePessoa(String defCPF, String defNome, String defSobrenome, int defIdade,int defId ) {
        super.definePessoa(defCPF, defNome, defSobrenome, defIdade); 
        this.intId = defId;
    }
    public int getId(){
       return intId; 
    }
}
