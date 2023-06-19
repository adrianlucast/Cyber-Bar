package sistemadebar.CyberBar2.Display;

import sistemadebar.CyberBar2.Controller.CadastroProduto;

/**
 *
 * @author Alan H
 */
public class MenuCadastro extends Menu{
    CadastroProduto cadastroProduto;

    public void menuCadastro(){
        this.cadastroProduto = new CadastroProduto();
    }
}
