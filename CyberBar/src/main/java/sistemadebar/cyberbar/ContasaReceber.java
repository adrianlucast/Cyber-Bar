// Analista Responsável:  Felipe Talini
// Desenvolvedor: Adrian

package sistemadebar.cyberbar;
import java.util.*;

public class contReceber 
{
    Date data = new Date();
    public double valor;
    private String dataCompra= "Data Compra "+data;
    public String ContBaixa= "Data Baixa "+data;
    private int idCliente;
    public int proxid = 1;
    public boolean status;
    private int numParcela;
    public double imposto = 0.05;
    private String cliente;
    private int idConta;
    ArrayList<ContasR> conta;
    
    public contReceber(){
        conta = new ArrayList<ContasR>();
    }

//    private double valorConta;
//    private String descConta;
//    private int parcela;
//    private double imposto;
    
    
    public void GerarConta(){
        
        System.out.println("Você deseja: [1] - Vizualiazar contas, [2] - Cadastrar contas");
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
                        System.out.println("Imposto aplicado: " + imposto*100 +" reais!");
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
                    numParcela = s.nextInt();
                }else{
                    System.out.println("Prosseguindo...");
                }
                System.out.println("Taxa de imposto de: " + imposto*100 + " Reais aplicada! Totalizando:" + imposto(valor));
                conta.add(new ContasR(proxid, valor, descVenda, numParcela));
                proxid++;
                System.out.println("=======Conta cadastrada com sucesso!=======");
                }
        }

    public String getDataCompra() {
        return dataCompra;
    }


    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }


    public int getNumParcela() {
        return numParcela;
    }


    public void setNumParcela(int numParcela) {
        this.numParcela = numParcela;
    }


    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    public int getIdCliente() {
        return idCliente;
    }

    public void gerarConta() {
        System.out.println("Conta gerada com sucesso.");
    }

    public void pullCliente() {
        System.out.println("Cliente: " + this.cliente);
    }

    public void pushValor(double valor) {
        this.valor += valor;
    }

    public double imposto(double valor) {
        double calc1 = imposto*100;
        calc1 = valor+calc1;
        return (calc1);
    }

    public int getNparcel() {
        return this.numParcela;
    }

    public void setNparcel(int numParcela) {
        this.numParcela = numParcela;
    }

    public int getIdConta() {
        return idConta;
    }



    public double getValor() {
        return valor;
    }

    public double getImposto() {
        return imposto;
    }

    public String getContBaixa() {
        return ContBaixa;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
        if (status) {
            this.ContBaixa = "Data Baixa: " + new Date();
        } else {
            this.ContBaixa = "";
        }
    }
    
    
private class ContasR{
    private int idConta;
    private double valorConta;
    private String descConta;
    private int parcela;

        public ContasR(int idConta, double valorConta, String descConta, int parcela) {
            this.idConta = idConta;
            this.valorConta = valorConta;
            this.descConta = descConta;
            this.parcela = parcela;
        }

        public int getIdConta() {
            return idConta;
        }

        public int getParcela() {
            return parcela;
        }

        public void setParcela(int parcela) {
            this.parcela = parcela;
        }

        public void setIdCliente(int idConta) {
            this.idConta = idConta;
        }

        public double getValorConta() {
            return valorConta;
        }

        public void setValorConta(double valorConta) {
            this.valorConta = valorConta;
        }

        public String getDescConta() {
            return descConta;
        }

        public void setDescConta(String descConta) {
            this.descConta = descConta;
        }

}
}