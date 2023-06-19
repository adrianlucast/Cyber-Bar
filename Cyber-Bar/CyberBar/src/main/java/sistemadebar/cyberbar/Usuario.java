/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.cyber.barv2;

/**
 *
 * @author felip
 */
public class Usuario extends Pessoa {

    private int intMatricula;
    public void definePessoa(String defCPF, String defNome, String defSobrenome, int defIdade, int defMatr) {
        super.definePessoa(defCPF, defNome, defSobrenome, defIdade); 
        this.intMatricula = defMatr;
    }
    public int getId(){
        return intMatricula;
    }
    
}
