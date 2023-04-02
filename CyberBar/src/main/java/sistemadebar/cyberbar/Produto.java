package sistemadebar.cyberbar;
import java.util.Date;
import java.util.Scanner;
/**
 * analista: Alan Henrique Ribeiro;
 * Desenvolvedor:  Felipe Talini
 */
public class Produto {
    Scanner sc = new Scanner(System.in);
    static private Date dd = new Date();
    static private int contador = 0;
    private int prodId;
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
        return prodId;
    }
    
    /**
     * @return the ProdValorCusto
     */
    public Double getProdValorCusto() {
        return prodValorCusto;
    }

    /**
     * @param prodValorCusto the ProdValorCusto to set
     */
    public void setProdValorCusto(Double ProdValorCusto) {
        this.prodValorCusto = ProdValorCusto;
    }

    /**
     * @return the ProdValorVenda
     */
    public Double getProdValorVenda() {
        return prodValorVenda;
    }

    /**
     * @param ProdValorVenda the ProdValorVenda to set
     */
    public void setProdValorVenda(Double ProdValorVenda) {
        this.prodValorVenda = ProdValorVenda;
    }

    /**
     * @param ProdDataCadastro the ProdDataCadastro to set
     */
    public void setProdDataCadastro(String ProdDataCadastro) {
        this.prodDataCadastro = ProdDataCadastro;
    }

    /**
     * @param ProdDataAtualizacao the ProdDataAtualizacao to set
     */
    public void setProdDataAtualizacao(String ProdDataAtualizacao) {
        this.prodDataAtualizacao = ProdDataAtualizacao;
    }

    /**
     * @return the contador
     */
    public static int getContador() {
        return contador;
    }
 // fim dos geters e seters   
    public void Produto(){//adiciona um produto novo(ao banco caso ele existisse
        contador ++;
        this.prodId = contador;
        System.out.println("Digite o tipo do produto: ");
        prodDescricao = sc.next();
        System.out.println("Digite a marca");
        prodMarca = sc.next();
        System.out.println("Digite a categoria do produto:\n unitario; \n pacote; \n palet");
        prodEmbalagem = sc.next();
        System.out.println("Didigite a quantidade do produto a ser estocado: ");
        prodEstoque = sc.nextDouble();
        this.prodDataCadastro = "Data cadastro : "+dd;
      
    }
    
    public void prodAtualizarEstoque(){//funcao onde pelo id selecionado(semifuncional pela falta do banco) atualiza a qnt no banco de um produto
         System.out.println("Digite o Id do produto: ");
         int verificaId = sc.nextInt();
         if(verificaId == prodId){
        if(prodEstoque == 0){
            prodSituacao = true;
        }
        if(prodSituacao == true){
            System.out.println("Aviso!! Estoque vazio");
            System.out.println("Digite o valor a inserir: ");
            this.prodEstoque += sc.nextDouble();
             prodDataAtualizacao = "Data update: "+dd;
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
          prodDataAtualizacao = "Data update: "+dd;
        }}else{
             System.out.println("Id invalido");
         } 
    }
    
}
