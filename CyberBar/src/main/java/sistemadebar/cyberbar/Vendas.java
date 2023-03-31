package com.mycompany.trabalho;

import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * 
 * @Análista: Alan
 * @Desenvolvedor: Lucas Pessoli
 */
public class Vendas {
    Scanner sasa = new Scanner(System.in);
    private int idVenda;
    public int proximoId = 1;
    private String descricaoVenda;
    private ArrayList<Compra> compras;
    private String nomeProduto;
    public String formaPagamento;
    public double valorTotal;
    public Date dateVenda;
    
        public Vendas(){
        compras = new ArrayList<Compra>();
    }
    
        
        
    public void RegistrarVenda(){
        Scanner scn = new Scanner(System.in);
        String formaPagamento = null;
        System.out.println("Qual método de pagamento você deseja usar?\n[1] - PIX\n[2] - Cartão de crédito\n[3] - Boleto Bancário\n[4] - Recarga");
        try{
            int escolhaC = scn.nextInt();
            switch (escolhaC){
                case 1:
                    formaPagamento = "PIX";
                    System.out.println("Você escolheu a forma de pagamento: " + formaPagamento);
                    break;
                case 2:
                    formaPagamento = "Cartão de crédito";
                    System.out.println("Você escolheu a forma de pagamento: " + formaPagamento);
                    break;
                case 3:
                    formaPagamento = "Boleto bancário";
                    System.out.println("Você escolheu a forma de pagamento: " + formaPagamento);
                    break;
                case 4:
                    formaPagamento = "Recarga";
                    System.out.println("Você escolheu a forma de pagamento: " + formaPagamento);
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
            }
        }catch(InputMismatchException exception){
            System.out.println("Insira um número válido.");
            System.exit(0);
        }
        System.out.println(formaPagamento);
        System.out.println("Informe o nome do cliente: ");
        String nomeDoCliente = sasa.nextLine();
        System.out.println("Insira o CPF do cliente (vazio para não emitir cpf na nota)");
        Scanner aa = new Scanner(System.in);
        String cpfDoCliente = aa.nextLine();
        if(cpfDoCliente.equals("")|| cpfDoCliente.equals(null) || cpfDoCliente.equals(" ")){
            cpfDoCliente = "Não exibido por prefêrencia do cliente.";
        }
        System.out.println("Informe a descrição da venda: ");
        String descVenda = sasa.nextLine();
        System.out.println("Nome do produto comprado: ");
        String nomeDoProduto = aa.nextLine();
        Date data = new Date();
        Date datt = data;
        String dataVenda = datt.toString();
        compras.add(new Compra(proximoId, cpfDoCliente,nomeDoCliente, descVenda, nomeDoProduto, formaPagamento, dataVenda));
        System.out.println("Conta registrada com sucesso! ID da conta: " + proximoId);
        proximoId++;
    }
    
    public void Venda(){
        System.out.println("Você deseja:\n[1] - Exibir todas as vendas já realizadas\n[2] - Buscar uma venda por ID");
        try{
            int escolhaC = sasa.nextInt();
            switch(escolhaC){
                case 1:
                    for(Compra compra : compras){
                    System.out.println("\n...EMITINDO NOTA FISCAL...");
                    System.out.println("ID DA COMPRA: " + compra.getIdCompra());
                    System.out.println("CPF: " + compra.getCpfCliente());
                    System.out.println("Nome do cliente: " + compra.getNomeProduto());
                    System.out.println("Descrição da venda: " + compra.getDescricaoVenda());
                    System.out.println("Nome do produto:" + compra.getNomeProduto());
                    System.out.println("Forma de pagamento utilizada: " + compra.getFormaPagamento());
                    System.out.println("Data da venda: " + compra.getDateVenda());
            }
                    break;
                case 2:
                    System.out.println("Informe o ID da sua venda:");
                    int idd = sasa.nextInt();
                    for(Compra compra : compras){
                        if(compra.getIdCompra()== idd){
                            System.out.println("...EMITINDO NOTA FISCAL...");
                            System.out.println("ID DA COMPRA: " + compra.getIdCompra());
                            System.out.println("CPF: " + compra.getCpfCliente());
                            System.out.println("Nome do cliente: " + compra.getNomeProduto());
                            System.out.println("Descrição da venda: " + compra.getDescricaoVenda());
                            System.out.println("Nome do produto:" + compra.getNomeProduto());
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
    
    
        
private class Compra{
    private int idCompra;
    private String cpfCliente;
    private String nomeDoCliente;
    private String descricaoVenda;
    private String nomeProduto;
    private String formaPagamento;
    private String dateVenda;

        public Compra(int idCompra, String cpfCliente,String nomeCliente, String descricaoVenda, String nomeProduto, String formaPagamento, String dateVenda) {
            this.idCompra = idCompra;
            this.cpfCliente = cpfCliente;
            this.nomeDoCliente = nomeCliente;
            this.descricaoVenda = descricaoVenda;
            this.nomeProduto = nomeProduto;
            this.formaPagamento = formaPagamento;
            this.dateVenda = dateVenda;
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
