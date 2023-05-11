package sistemadebar.cyberbar;

import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * 
 * @Análista: Alan Henrique Ribeiro
 * @Desenvolvedor: Lucas Pessoli
 */
public class Vendas {
    private int intIdVenda;
    public int intProximoId = 1;
    private String strDescricaoVenda;
    private ArrayList<Compra> compras;
    private String strNomeProduto;
    private int intParcela;
    private int intParcelasRestantes;
    public String strFormaPagamento;
    public double dblValorTotal;
    public Date dateDiaVenda;
    
    public Vendas(){
        compras = new ArrayList<Compra>();
    }
       
    public void RegistrarVenda(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Qual método de pagamento você deseja usar?\n[1] - PIX\n[2] - Cartão de crédito\n[3] - Boleto Bancário\n[4] - Recarga");
        try{
            int escolhaC = scn.nextInt();
            scn.nextLine();
            switch (escolhaC){
                case 1:
                    strFormaPagamento = "PIX";
                    System.out.println("Você escolheu a forma de pagamento: " + strFormaPagamento);
                    break;
                case 2:
                    strFormaPagamento = "Cartão de crédito";
                    System.out.println("Você escolheu a forma de pagamento: " + strFormaPagamento);
                    break;
                case 3:
                    strFormaPagamento = "Boleto bancário";
                    System.out.println("Você escolheu a forma de pagamento: " + strFormaPagamento);
                    break;
                case 4:
                    strFormaPagamento = "Recarga";
                    System.out.println("Você escolheu a forma de pagamento: " + strFormaPagamento);
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
            }
        }catch(InputMismatchException exception){
            System.out.println("Insira um número válido.");
            System.exit(0);
        }
        System.out.println(strFormaPagamento);
        System.out.println("#Informe o nome do cliente: ");
        String nomeDoCliente = scn.nextLine();
        System.out.println("#Insira o CPF do cliente (vazio para não emitir cpf na nota)");
        String cpfDoCliente = scn.nextLine();
        if(cpfDoCliente.equals("")|| cpfDoCliente.equals(null) || cpfDoCliente.equals(" ")){
            cpfDoCliente = "Não exibido por prefêrencia do cliente.";
        }
        System.out.println("#Informe a descrição da venda: ");
        String descVenda = scn.nextLine();
        System.out.println("#Nome do(s) produto(s) comprado(s): ");
        String nomeDoProduto = scn.nextLine();
        System.out.println("*Valor do produto comprado: ");
        int valorProduto = scn.nextInt();
        System.out.println("*Parcelar em: (limite: 12 parcelas, caso for á vista deixar vazio) ");
        int parcela = scn.nextInt();
        if (parcela > 12 ){
            parcela = 12;
        }
        Date data = new Date();
        Date datt = data;
        String dataVenda = datt.toString();
        compras.add(new Compra(intProximoId, cpfDoCliente,nomeDoCliente, descVenda, nomeDoProduto,parcela,valorProduto, strFormaPagamento, dataVenda));
        System.out.println("Conta registrada com sucesso! ID da conta: " + intProximoId);
        intProximoId++;
    }
    
    public void Venda(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Você deseja:\n[1] - Exibir todas as vendas já realizadas\n[2] - Buscar uma venda por ID");
        try{
            int escolhaC = scn.nextInt();
            switch(escolhaC){
                case 1:
                    for(Compra compra : compras){
                    System.out.println("\n...EMITINDO NOTA FISCAL...");
                    System.out.println("ID DA COMPRA: " + compra.getIdCompra());
                    System.out.println("CPF: " + compra.getCpfCliente());
                    System.out.println("Nome do cliente: " + compra.getNomeProduto());
                    System.out.println("Descrição da venda: " + compra.getDescricaoVenda());
                    System.out.println("Nome do(s) produto(s):" + compra.getNomeProduto());
                    System.out.println("Valor do produto: " + compra.getValorProduto());
                    System.out.println("Parcelas restantes do produto: " + compra.getParcela());
                    System.out.println("Forma de pagamento utilizada: " + compra.getFormaPagamento());
                    System.out.println("Data da venda: " + compra.getDateVenda());
            }
                    break;
                case 2:
                    System.out.println("Informe o ID da sua venda:");
                    int idd = scn.nextInt();
                    for(Compra compra : compras){
                        if(compra.getIdCompra()== idd){
                            System.out.println("...EMITINDO NOTA FISCAL...");
                            System.out.println("ID DA COMPRA: " + compra.getIdCompra());
                            System.out.println("CPF: " + compra.getCpfCliente());
                            System.out.println("Nome do cliente: " + compra.getNomeProduto());
                            System.out.println("Descrição da venda: " + compra.getDescricaoVenda());
                            System.out.println("Nome do(s) produto(s):" + compra.getNomeProduto());
                            System.out.println("Valor do produto: " + compra.getValorProduto());
                            System.out.println("Parcelas restantes do produto: " + compra.getParcela());
                            System.out.println("Forma de pagamento utilizada: " + compra.getFormaPagamento());
                            System.out.println("Data da venda: " + compra.getDateVenda());
                        }
                    }
            }
        }catch(InputMismatchException exception){
            System.out.println("Informe um número válido.");
            System.exit(0);
    }
        }
    
    public void CancelaVenda(){
        Scanner scn = new Scanner(System.in);
        Scanner antibug2 = new Scanner(System.in);
        System.out.println("Informe o ID da conta a ser deletada: ");
        int id = scn.nextInt();
        boolean encontrado = false;
            for(Compra compra : compras){
                if (compra.getIdCompra() == id){
                    encontrado = true;
                    System.out.println("Conta encontrada! Informações abaixo:");
                    System.out.println("ID DA COMPRA: " + compra.getIdCompra());
                    System.out.println("CPF: " + compra.getCpfCliente());
                    System.out.println("Nome do cliente: " + compra.getNomeProduto());
                    System.out.println("Descrição da venda: " + compra.getDescricaoVenda());
                    System.out.println("Nome do(s) produto(s):" + compra.getNomeProduto());
                    System.out.println("Valor do produto: " + compra.getValorProduto());
                    System.out.println("Parcelas restantes do produto: " + compra.getParcela());
                    System.out.println("Forma de pagamento utilizada: " + compra.getFormaPagamento());
                    System.out.println("Data da venda: " + compra.getDateVenda());
                    System.out.println("===========================");
                    System.out.println("Para ter certeza que quer cancelar a venda, digite Y, para cancelar digite N ...");
                    String res = antibug2.nextLine();
                    if(res.equalsIgnoreCase("Y")){
                        int i = compras.indexOf(compra);
                        compras.remove(i);
                        System.out.println("Conta cancelada/removida do sistema.");
                    }else if(res.equalsIgnoreCase("N")){
                        System.out.println("Saindo.....");
                    }
                    break;
                }
            }
            if(!encontrado){
                System.out.println("Conta não encontrada!");
            }
    }
    
    public void BaixaParcela(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe o ID da compra/venda para baixar a parcela: ");
        int id = scn.nextInt();
        boolean encontrado = false;
            for(Compra compra : compras){
                if (compra.getIdCompra() == id){
                    encontrado = true;
                    System.out.println("Conta encontrada! Informações abaixo:");
                    System.out.println("CPF: " + compra.getCpfCliente());
                    System.out.println("Nome do cliente: " + compra.getNomeProduto());
                    System.out.println("Descrição da venda: " + compra.getDescricaoVenda());
                    System.out.println("Nome do(s) produto(s):" + compra.getNomeProduto());
                    System.out.println("Valor do produto: " + compra.getValorProduto());
                    System.out.println("Parcelas restantes do produto: " + compra.getParcela());
                    System.out.println("Informe Quantas parcelas você deseja baixar: ");
                    int res = scn.nextInt();
                    if(res < 0 ){
                        res = 0;
                    }
                    if(res <= compra.getParcela()){
                        int parcelaSalva = compra.getParcela();
                        compra.setParcela(compra.getParcela() - res);
                        if(compra.getParcela() <=0){
                            System.out.println("Todas as parcelas foram baixadas! Saindo por um total de: " + ((compra.getValorProduto() / res) * res) + "");
                        }else{
                            System.out.println("Parcela(s) baixada(s)! Parcelas atuais: " + compra.getParcela() + ", você terá que pagar: " + ((compra.getValorProduto() / parcelaSalva) * res));
                        }
                    break;
                }
            }
            if(!encontrado){
                System.out.println("Conta não encontrada!");
            }
        }
    }
    
    
private class Compra{
    private int idCompra;
    private String cpfCliente;
    private String nomeDoCliente;
    private String descricaoVenda;
    private String nomeProduto;
    private int parcela;
    private double valorProduto;
    private String formaPagamento;
    private String dateVenda;

        public Compra(int idCompra, String cpfCliente,String nomeCliente, String descricaoVenda, String nomeProduto,int parcela,double valorProduto, String formaPagamento, String dateVenda) {
            this.idCompra = idCompra;
            this.cpfCliente = cpfCliente;
            this.nomeDoCliente = nomeCliente;
            this.descricaoVenda = descricaoVenda;
            this.nomeProduto = nomeProduto;
            this.parcela = parcela;
            this.valorProduto = valorProduto;
            this.formaPagamento = formaPagamento;
            this.dateVenda = dateVenda;
        }

        public int getParcela() {
            return parcela;
        }

        public void setParcela(int parcela) {
            this.parcela = parcela;
        }

        public double getValorProduto() {
            return valorProduto;
        }

        public void setValorProduto(double valorProduto) {
            this.valorProduto = valorProduto;
        }

        public String getNomeDoCliente() {
            return nomeDoCliente;
        }

        public void setNomeDoCliente(String nomeDoCliente) {
            this.nomeDoCliente = nomeDoCliente;
        }

        public int getIdCompra() {
            return idCompra;
        }

        public void setIdCompra(int idCompra) {
            this.idCompra = idCompra;
        }

        public String getCpfCliente() {
            return cpfCliente;
        }

        public void setCpfCliente(String cpfCliente) {
            this.cpfCliente = cpfCliente;
        }

        public String getDescricaoVenda() {
            return descricaoVenda;
        }

        public void setDescricaoVenda(String descricaoVenda) {
            this.descricaoVenda = descricaoVenda;
        }

        public String getNomeProduto() {
            return nomeProduto;
        }

        public void setNomeProduto(String nomeProduto) {
            this.nomeProduto = nomeProduto;
        }

        public String getFormaPagamento() {
            return formaPagamento;
        }

        public void setFormaPagamento(String formaPagamento) {
            this.formaPagamento = formaPagamento;
        }

        public String getDateVenda() {
            return dateVenda;
        }

        public void setDateVenda(String dateVenda) {
            this.dateVenda = dateVenda;
        }
    

}
}
