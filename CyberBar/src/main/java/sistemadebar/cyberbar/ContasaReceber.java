// Analista Responsável:  Felipe Talini
// Desenvolvedor: Adrian

package sistemadebar.cyberbar;
import java.util.*;

public class ContasaReceber 
{
    Date data = new Date();
    public double dblValor;
    private String strDataCompra= "Data Compra "+data;
    public String strContaBaixa= "Data Baixa "+data;
    private int intIdCliente;
    public int intPorxId = 1;
    public boolean blnStatus;
    private int intNumParcela;
    public double dblImposto = 0.05;
    private String strCliente;
    private int intIdConta;
    ArrayList<ContasR> conta;
    
    public ContasaReceber(){
        conta = new ArrayList<ContasR>();
    }

    public void GerarConta(){
        
        System.out.println("------------------------");
        System.out.println("1- Vizualiazar contas");
        System.out.println("2- Cadastrar Contas");
        System.out.println("-----------------------");
        
        Scanner dsc = new Scanner(System.in);
        int ddd = dsc.nextInt();
        
        switch (ddd){
            case 1:
                if (conta.size()>0){
                    for(ContasR c : conta){
                        System.out.println("id da conta: " + c.getIdConta());
                        System.out.println("Nome/Descrição da conta: " + c.getDescConta());
                        System.out.println("Valor da conta: : " + c.getValorConta());
                        System.out.println("Parcelas da conta: " + c.getParcela());
                        System.out.println("Imposto aplicado: " + dblImposto*100 +" reais!");
                        System.out.println("\n");
                    }
                }else{
                        System.out.println("nenhuma conta encontrada no sistema!");
                }
                break;
                
            case 2:
                Scanner s = new Scanner(System.in);
                System.out.println("Informe o nome/descrição da conta!");
                String descVenda = s.nextLine();
                
                System.out.println("Informe o valor da conta: ");
                double valor = s.nextDouble();
                
                System.out.println("Você deseja parcelar a conta? (y/n)");
                String r = s.next();
                
                if (r.equalsIgnoreCase("y")){
                    System.out.println("Informe o número de parcelas: ");
                    intNumParcela = s.nextInt();
                }else{
                    System.out.println("Prosseguindo...");
                }
                
                System.out.println("Taxa de imposto de: " + dblImposto*100 + " Reais aplicada! Totalizando:" + imposto(valor));
                conta.add(new ContasR(intPorxId, valor, descVenda, intNumParcela));
                intPorxId++;
                System.out.println("=======Conta cadastrada com sucesso!=======");
                }
        }

    public String getDataCompra() {
        return strDataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.strDataCompra = dataCompra;
    }

    public int getNumParcela() {
        return intNumParcela;
    }

    public void setNumParcela(int numParcela) {
        this.intNumParcela = numParcela;
    }

    public String getCliente() {
        return strCliente;
    }

    public void setCliente(String cliente) {
        this.strCliente = cliente;
    }

    public int getIdCliente() {
        return intIdCliente;
    }

    public void gerarConta() {
        System.out.println("Conta gerada com sucesso.");
    }

    public void pullCliente() {
        System.out.println("Cliente: " + this.strCliente);
    }

    public void pushValor(double valor) {
        this.dblValor += valor;
    }

    public double imposto(double valor) {
        double calc1 = dblImposto*100;
        calc1 = valor+calc1;
        return (calc1);
    }

    public int getNparcel() {
        return this.intNumParcela;
    }

    public void setNparcel(int numParcela) {
        this.intNumParcela = numParcela;
    }

    public int getIdConta() {
        return intIdConta;
    }

    public double getValor() {
        return dblValor;
    }

    public double getImposto() {
        return dblImposto;
    }

    public String getContBaixa() {
        return strContaBaixa;
    }

    public boolean getStatus() {
        return blnStatus;
    }

    public void setStatus(boolean status) {
        this.blnStatus = status;
        if (status) {
            this.strContaBaixa = "Data Baixa: " + new Date();
        } else {          
            this.strContaBaixa = "";
        }
    }
    
private class ContasR{
    private int intIdConta;
    private double dblValorConta;
    private String strDescrConta;
    private int intParcela;

        public ContasR(int idConta, double valorConta, String descConta, int parcela) {
            this.intIdConta = idConta;
            this.dblValorConta = valorConta;
            this.strDescrConta = descConta;
            this.intParcela = parcela;
        }

        public int getIdConta() {
            return intIdConta;
        }

        public int getParcela() {
            return intParcela;
        }

        public void setParcela(int parcela) {
            this.intParcela = parcela;
        }

        public void setIdCliente(int idConta) {
            this.intIdConta = idConta;
        }

        public double getValorConta() {
            return dblValorConta;
        }

        public void setValorConta(double valorConta) {
            this.dblValorConta = valorConta;
        }

        public String getDescConta() {
            return strDescrConta;
        }

        public void setDescConta(String descConta) {
            this.strDescrConta = descConta;
        }
    }
}