/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadebar.CyberBar2;

/**
 *
 * @author aluno
 */
public class Cadastro {
    protected int intId;
    protected String strNome;
    protected double dblQuantidade;
    
    public Cadastro(int pId,String pNome,double pQuantidade){
        this.intId = pId;
        this.dblQuantidade = pQuantidade;
        this.strNome = pNome;
    }
}
