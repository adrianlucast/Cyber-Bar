package sistemadebar.cyberbar;
import java.util.Date;
import java.util.Scanner;
/**
 * analista: Alan Henrique Ribeiro;
 * Desenvolvedor:  Felipe Talini
 */
public class Produto {
    Scanner sc = new Scanner(System.in);
    static private Date dtaDd = new Date();
    static private int intContador = 0;
    private int intProdId;
    public String prodDescricao;
    public String prodMarca;
    public String prodEmbalagem;
    public double prodEstoque;
    private double prodValorCusto;
    private double prodValorVenda;
    public boolean prodSituacao = false;
    private String prodDataCadastro;
    private String prodDataAtualizacao;
//geters e seters para uso em outras classe caso venham a ter necessidade
    /**
     * @return the ProdId
     */
    public int getProdId() {
        return intProdId;
    }
    
    /**
     * @return the ProdValorCusto
     */
    public Double getProdValorCusto() {
        return prodValorCusto;
    }

    /**
     * @param pProdValorCusto the ProdValorCusto to set
     */
    public void setProdValorCusto(Double pProdValorCusto) {
        this.prodValorCusto = pProdValorCusto;
    }

    /**
     * @return the ProdValorVenda
     */
    public Double getProdValorVenda() {
        return prodValorVenda;
    }

    /**
     * @param pProdValorVenda the ProdValorVenda to set
     */
    public void setProdValorVenda(Double pProdValorVenda) {
        this.prodValorVenda = pProdValorVenda;
    }

    /**
     * @param pProdDataCadastro the ProdDataCadastro to set
     */
    public void setProdDataCadastro(String pProdDataCadastro) {
        this.prodDataCadastro = pProdDataCadastro;
    }

    /**
     * @param pProdDataAtualizacao the ProdDataAtualizacao to set
     */
    public void setProdDataAtualizacao(String pProdDataAtualizacao) {
        this.prodDataAtualizacao = pProdDataAtualizacao;
    }

    /**
     * @return the intContador
     */
    public static int getContador() {
        return intContador;
    }
 // fim dos geters e seters   
    public void Produto(){//adiciona um produto novo(ao banco caso ele existisse
        intContador ++;
        this.intProdId = intContador;
        System.out.println("Digite o tipo do produto: ");
        prodDescricao = sc.next();
        System.out.println("Digite a marca");
        prodMarca = sc.next();
        System.out.println("Digite a categoria do produto:\n unitario; \n pacote; \n palet");
        prodEmbalagem = sc.next();
        System.out.println("Didigite a quantidade do produto a ser estocado: ");
        prodEstoque = sc.nextDouble();
        this.prodDataCadastro = "Data cadastro : "+dtaDd;
      
    }
    
    public void prodAtualizarEstoque(){//funcao onde pelo id selecionado(semifuncional pela falta do banco) atualiza a qnt no banco de um produto
         System.out.println("Digite o Id do produto: ");
         int verificaId = sc.nextInt();
         if(verificaId == intProdId){
        if(prodEstoque == 0){
            prodSituacao = true;
        }
        if(prodSituacao == true){
            System.out.println("Aviso!! Estoque vazio");
            System.out.println("Digite o valor a inserir: ");
            this.prodEstoque += sc.nextDouble();
             prodDataAtualizacao = "Data update: "+dtaDd;
        }else{
            //regiao para retirada de prod do estoque ou inserção
            System.out.println("Digite a operaçao:\n + para soma\n - para subtração");
           char escolha = sc.next().charAt(1);
          switch(escolha){
              case '+':
                  System.out.println("Digite o valor a inserir: ");
            this.prodEstoque += sc.nextDouble();
            break;
              case '-':
                  System.out.println("Digite o valor a reduzir: ");
            this.prodEstoque -= sc.nextDouble();
              default:
                  System.out.println("Operaçao invalida");
          }
          prodDataAtualizacao = "Data update: "+dtaDd;
        }}else{
             System.out.println("Id invalido");
         } 
    }
    
}
