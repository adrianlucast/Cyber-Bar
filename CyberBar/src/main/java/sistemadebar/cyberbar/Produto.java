package sistemadebar.cyberbar;
import java.util.Date;
import java.util.Scanner;
/**
 * analista: Alan Henrique Ribeiro;
 * Desenvolvedor:  Felipe Talini
 */
public class Produto {
    Scanner sc = new Scanner(System.in);
    static private Date dateDd = new Date();
    static private int intContador = 0;
    private int intProdId;
    public String strProdDescricao;
    public String strProdMarca;
    public String strProdEmbalagem;
    public double dblProdEstoque;
    private double dblProdValorCusto;
    private double dblProdValorVenda;
    public boolean blnProdSituacao = false;
    private String strProdDataCadastro;
    private String strProdDataAtualizacao;
//geters e seters para uso em outras classe caso venham a ter necessidade
    /**
     * @return the ProdId
     */
    public int getProdId() {
        return intProdId;
    }

    public Double getProdValorCusto() {
        return dblProdValorCusto;
    }

    public void setProdValorCusto(Double ProdValorCusto) {
        this.dblProdValorCusto = ProdValorCusto;
    }

    public Double getProdValorVenda() {
        return dblProdValorVenda;
    }

    public void setProdValorVenda(Double ProdValorVenda) {
        this.dblProdValorVenda = ProdValorVenda;
    }

    public void setProdDataCadastro(String ProdDataCadastro) {
        this.strProdDataCadastro = ProdDataCadastro;
    }

    public void setProdDataAtualizacao(String ProdDataAtualizacao) {
        this.strProdDataAtualizacao = ProdDataAtualizacao;
    }

    public static int getContador() {
        return intContador;
    }
    
    public void Produto(){
        intContador ++;
        this.intProdId = intContador;
        System.out.println("Digite o tipo do produto: ");
        strProdDescricao = sc.next();
        System.out.println("Digite a marca");
        strProdMarca = sc.next();
        System.out.println("Digite a categoria do produto:\n unitario; \n pacote; \n palet");
        strProdEmbalagem = sc.next();
        System.out.println("Didigite a quantidade do produto a ser estocado: ");
        dblProdEstoque = sc.nextDouble();
        this.strProdDataCadastro = "Data cadastro : "+dateDd;
      
    }
    
    public void prodAtualizarEstoque(){
         System.out.println("Digite o Id do produto: ");
         int verificaId = sc.nextInt();
         if(verificaId == intProdId){
        if(dblProdEstoque == 0){
            blnProdSituacao = true;
        }
        if(blnProdSituacao == true){
            System.out.println("Aviso!! Estoque vazio");
            System.out.println("Digite o valor a inserir: ");
            this.dblProdEstoque += sc.nextDouble();
             strProdDataAtualizacao = "Data update: "+dateDd;
        }else{
            //regiao para retirada de prod do estoque ou inserção
            System.out.println("Digite a operaçao:\n + para soma\n - para subtração");
           char escolha = sc.next().charAt(1);
          switch(escolha){
              case '+':
                  System.out.println("Digite o valor a inserir: ");
            this.dblProdEstoque += sc.nextDouble();
            break;
            
              case '-':
                  System.out.println("Digite o valor a reduzir: ");
            this.dblProdEstoque -= sc.nextDouble();
              default:
                  System.out.println("Operaçao invalida");
          }
          strProdDataAtualizacao = "Data update: "+dateDd;
        }}else{
             System.out.println("Id invalido");
         } 
    }
    
}
