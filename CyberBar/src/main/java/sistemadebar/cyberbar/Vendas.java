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
        System.out.println("Qual Método de Pagamento Você Deseja Usar?\n1- PIX\n2- Cartão de crédito\n3- Boleto Bancário\n4- Recarga");
        try{
            int escolhaC = scn.nextInt();
            scn.nextLine();
            switch (escolhaC){
                case 1:
                    strFormaPagamento = "PIX";
                    System.out.println("Você Escolheu a Forma de Pagamento: " + strFormaPagamento);
                    break;
                case 2:
                    strFormaPagamento = "Cartão de crédito";
                    System.out.println("Você Escolheu a Forma de Pagamento: " + strFormaPagamento);
                    break;
                case 3:
                    strFormaPagamento = "Boleto bancário";
                    System.out.println("Você Escolheu a Forma de Pagamento: " + strFormaPagamento);
                    break;
                case 4:
                    strFormaPagamento = "Recarga";
                    System.out.println("Você Escolheu a Forma de Pagamento: " + strFormaPagamento);
                    break;
                default:
                    System.out.println("Escolha uma Opção Válida!");
            }
        }catch(InputMismatchException exception){
            System.out.println("Insira um Número Válido.");
            System.exit(0);
        }
        System.out.println(strFormaPagamento);
        System.out.println("Informe o Nome do Cliente: ");
        String nomeDoCliente = scn.nextLine();
        System.out.println("Insira o CPF do Cliente (Vazio Para não Emitir CPF na Nota)");
        String cpfDoCliente = scn.nextLine();
        if(cpfDoCliente.equals("")|| cpfDoCliente.equals(null) || cpfDoCliente.equals(" ")){
            cpfDoCliente = "Não Exibido por Prefêrencia do Cliente.";
        }
        System.out.println("Informe a Descrição da Venda: ");
        String descVenda = scn.nextLine();
        System.out.println("Nome do(s) Produto(s) Comprado(s): ");
        String nomeDoProduto = scn.nextLine();
        System.out.println("*Valor do Produto Comprado: ");
        int valorProduto = scn.nextInt();
        System.out.println("*Parcelar em: (Limite: 12 parcelas, Caso Optar por á Vista Deixar Vazio) ");
        int parcela = scn.nextInt();
        if (parcela > 12 ){
            parcela = 12;
        }
        Date data = new Date();
        Date datt = data;
        String dataVenda = datt.toString();
        compras.add(new Compra(intProximoId, cpfDoCliente,nomeDoCliente, descVenda, nomeDoProduto,parcela,valorProduto, strFormaPagamento, dataVenda));
        System.out.println("Conta Registrada com Sucesso! ID da Conta: " + intProximoId);
        intProximoId++;
    }
    
    public void Venda(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Você Deseja:\n1- Exibir Todas as Vendas já Realizadas\n2- Buscar uma Venda por ID");
        try{
            int escolhaC = scn.nextInt();
            switch(escolhaC){
                case 1:
                    for(Compra compra : compras){
                    System.out.println("\n...Emitindo Nota Fiscal...");
                    System.out.println("ID da Compra: " + compra.getIdCompra());
                    System.out.println("CPF: " + compra.getCpfCliente());
                    System.out.println("Nome do Cliente: " + compra.getNomeProduto());
                    System.out.println("Descrição da Venda: " + compra.getDescricaoVenda());
                    System.out.println("Nome do(s) Produto(s):" + compra.getNomeProduto());
                    System.out.println("Valor do Produto: " + compra.getValorProduto());
                    System.out.println("Parcelas Restantes do Produto: " + compra.getParcela());
                    System.out.println("Forma de Pagamento Utilizada: " + compra.getFormaPagamento());
                    System.out.println("Data da Venda: " + compra.getDateVenda());
            }
                    break;
                case 2:
                    System.out.println("Informe o ID da sua Venda:");
                    int idd = scn.nextInt();
                    for(Compra compra : compras){
                        if(compra.getIdCompra()== idd){
                            System.out.println("...Emitindo Nota Fiscal...");
                            System.out.println("ID da Compra: " + compra.getIdCompra());
                            System.out.println("CPF: " + compra.getCpfCliente());
                            System.out.println("Nome do Cliente: " + compra.getNomeProduto());
                            System.out.println("Descrição da Venda: " + compra.getDescricaoVenda());
                            System.out.println("Nome do(s) Produto(s):" + compra.getNomeProduto());
                            System.out.println("Valor do Produto: " + compra.getValorProduto());
                            System.out.println("Parcelas Restantes do Produto: " + compra.getParcela());
                            System.out.println("Forma de Pagamento Utilizada: " + compra.getFormaPagamento());
                            System.out.println("Data da Venda: " + compra.getDateVenda());
                        }
                    }
            }
        }catch(InputMismatchException exception){
            System.out.println("Informe um Número Válido.");
            System.exit(0);
    }
        }
    
    public void CancelaVenda(){
        Scanner scn = new Scanner(System.in);
        Scanner antibug2 = new Scanner(System.in);
        System.out.println("Informe o ID da Conta a ser Deletada: ");
        int id = scn.nextInt();
        boolean encontrado = false;
            for(Compra compra : compras){
                if (compra.getIdCompra() == id){
                    encontrado = true;
                    System.out.println("Conta Encontrada! Informações Abaixo:");
                    System.out.println("ID da Compra: " + compra.getIdCompra());
                    System.out.println("CPF: " + compra.getCpfCliente());
                    System.out.println("Nome do Cliente: " + compra.getNomeProduto());
                    System.out.println("Descrição da Venda: " + compra.getDescricaoVenda());
                    System.out.println("Nome do(s) Produto(s):" + compra.getNomeProduto());
                    System.out.println("Valor do Produto: " + compra.getValorProduto());
                    System.out.println("Parcelas Restantes do Produto: " + compra.getParcela());
                    System.out.println("Forma de Pagamento Utilizada: " + compra.getFormaPagamento());
                    System.out.println("Data da Venda: " + compra.getDateVenda());
                    System.out.println("===========================");
                    System.out.println("Digite Y para Cancelar a Venda, N para Voltar");
                    String res = antibug2.nextLine();
                    if(res.equalsIgnoreCase("Y")){
                        int i = compras.indexOf(compra);
                        compras.remove(i);
                        System.out.println("Conta Cancelada/Removida do Sistema.");
                    }else if(res.equalsIgnoreCase("N")){
                        System.out.println("Saindo.....");
                    }
                    break;
                }
            }
            if(!encontrado){
                System.out.println("Conta não Encontrada!");
            }
    }
    
    public void BaixaParcela(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe o ID da Compra/Venda para Baixar a Parcela: ");
        int id = scn.nextInt();
        boolean encontrado = false;
            for(Compra compra : compras){
                if (compra.getIdCompra() == id){
                    encontrado = true;
                    System.out.println("Conta Encontrada! Informações Abaixo:");
                    System.out.println("CPF: " + compra.getCpfCliente());
                    System.out.println("Nome do Cliente: " + compra.getNomeProduto());
                    System.out.println("Descrição da Venda: " + compra.getDescricaoVenda());
                    System.out.println("Nome do(s) Produto(s):" + compra.getNomeProduto());
                    System.out.println("Valor do Produto: " + compra.getValorProduto());
                    System.out.println("Parcelas Restantes do Produto: " + compra.getParcela());
                    System.out.println("Informe Quantas Parcelas você Deseja Baixar: ");
                    int res = scn.nextInt();
                    if(res < 0 ){
                        res = 0;
                    }
                    if(res <= compra.getParcela()){
                        int parcelaSalva = compra.getParcela();
                        compra.setParcela(compra.getParcela() - res);
                        if(compra.getParcela() <=0){
                            System.out.println("Todas as Parcelas foram Baixadas! Saindo por um Total de: " + ((compra.getValorProduto() / res) * res) + "");
                        }else{
                            System.out.println("Parcela(s) Baixada(s)! Parcelas Atuais: " + compra.getParcela() + ", Você terá que Pagar: " + ((compra.getValorProduto() / parcelaSalva) * res));
                        }
                    break;
                }
            }
            if(!encontrado){
                System.out.println("Conta não Encontrada!");
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
