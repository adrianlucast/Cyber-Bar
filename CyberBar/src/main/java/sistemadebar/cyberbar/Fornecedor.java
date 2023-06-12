/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadebar.cyberbar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Fornecedor {
    protected String strFornecedor;
    protected String strDataEntrega;
    protected int    intIdFornecedor;
    protected static int proximoID =1;
    
Scanner scan = new Scanner(System.in);

    public void CadastrarFornecedor(){
        this.intIdFornecedor = proximoID;
        proximoID++;
        System.out.println("Informe o Fornecedor do Produto");
            strFornecedor = scan.next();
        System.out.println("Informe a Data de Entrega");
            strDataEntrega = scan.next();
    }
        
    public void ExibirFornecedor() {
                System.out.println("Fornecedor do Produto: " + strFornecedor +" Data de Entrega: "+strDataEntrega+" ID do Fornecedor: "+intIdFornecedor);
            }

    
    public String getStrFornecedor() {
        return strFornecedor;
    }

    public void setStrFornecedor(String strFornecedor) {
        this.strFornecedor = strFornecedor;
    }

    public String getStrDataEntrega() {
        return strDataEntrega;
    }

    public void setStrDataEntrega(String strDataEntrega) {
        this.strDataEntrega = strDataEntrega;
    }

    public int getIntIdFornecedor() {
        return intIdFornecedor;
    }

    public void setIntIdFornecedor(int intIdFornecedor) {
        this.intIdFornecedor = intIdFornecedor;
    }
}