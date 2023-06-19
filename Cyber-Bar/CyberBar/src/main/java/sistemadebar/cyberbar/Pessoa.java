/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.cyber.barv2;

/**
 *
 * @author felip
 */
public class Pessoa {
    protected String strCpf;
    protected String strNome;
    protected String strSobrenome;
    protected int intIdade;
    
    public void definePessoa(String defCPF, String defNome, String defSobrenome, int defIdade){
     this.strCpf = defCPF;
     this.strNome = defNome;
     this.strSobrenome = defSobrenome;
     this.intIdade = defIdade;
    }
}
