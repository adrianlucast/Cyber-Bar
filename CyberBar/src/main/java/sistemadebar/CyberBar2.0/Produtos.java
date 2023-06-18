package sistemadebar.cyberbar;

/**
 * @Desenvolvedor: Gabriella Cristini Galvão;
 */
public class Produtos extends Fornecedor {
    protected String strMarcaProduto;
    protected String strDescricaoProduto;
    protected String strStatusProduto;
    protected String strDataCadastroProduto;
    protected double dblValorVendaProduto;
    protected int intQuantidadeProduto;
    protected int intQuantidadeMaxProduto;
    protected int intIdProduto;

    public String getStrMarcaProduto() {
        return strMarcaProduto;
    }

    public void setStrMarcaProduto(String strMarcaProduto) {
        this.strMarcaProduto = strMarcaProduto;
    }

    public String getStrDescricaoProduto() {
        return strDescricaoProduto;
    }

    public void setStrDescricaoProduto(String strDescricaoProduto) {
        this.strDescricaoProduto = strDescricaoProduto;
    }

    public String getStrStatusProduto() {
        return strStatusProduto;
    }

    public void setStrStatusProduto(String strStatusProduto) {
        this.strStatusProduto = strStatusProduto;
    }

    public String getStrDataCadastroProduto() {
        return strDataCadastroProduto;
    }

    public void setStrDataCadastroProduto(String strDataCadastroProduto) {
        this.strDataCadastroProduto = strDataCadastroProduto;
    }

    public double getDblValorVendaProduto() {
        return dblValorVendaProduto;
    }

    public void setDblValorVendaProduto(double dblValorVendaProduto) {
        this.dblValorVendaProduto = dblValorVendaProduto;
    }

    public int getIntQuantidadeProduto() {
        return intQuantidadeProduto;
    }

    public void setIntQuantidadeProduto(int intQuantidadeProduto) {
        this.intQuantidadeProduto = intQuantidadeProduto;
    }

    public int getIntQuantidadeMaxProduto() {
        return intQuantidadeMaxProduto;
    }

    public void setIntQuantidadeMaxProduto(int intQuantidadeMaxProduto) {
        this.intQuantidadeMaxProduto = intQuantidadeMaxProduto;
    }

    public int getIntIdProduto() {
        return intIdProduto;
    }

    public void setIntIdProduto(int intIdProduto) {
        this.intIdProduto = intIdProduto;
    }

}
