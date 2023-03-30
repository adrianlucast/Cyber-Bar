/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;

import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * @author aluno
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
        System.out.println("Qual método de pagamento você deseja usar?\n1 - PIX\n2 - Cartão de crédito\n 3 - Boleto Bancário\n 4 - Recarga");
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
        String cpfDoCliente = scn.nextLine();
        System.out.println("Informe a descrição da venda: ");
        String descVenda = sasa.nextLine();
        System.out.println("Nome do produto comprado: ");
        String nomeDoProduto = scn.nextLine();
        Date data = new Date();
        Date datt = data;
        String dataVenda = datt.toString();
        compras.add(new Compra(proximoId, cpfDoCliente, descVenda, nomeDoProduto, formaPagamento, dataVenda));
        System.out.println("Conta registrada com sucesso! ID da conta: " + proximoId);
        proximoId++;
        System.out.println(compras.get(0).getFormaPagamento());
    }
    
        
private class Compra{
    private int idCompra;
    private String cpfCliente;
    private String nomeDoCliente;
    private String descricaoVenda;
    private String nomeProduto;
    private String formaPagamento;
    private String dateVenda;

        public Compra(int idCompra, String cpfCliente, String descricaoVenda, String nomeProduto, String formaPagamento, String dateVenda) {
            this.idCompra = idCompra;
            this.cpfCliente = cpfCliente;
            this.descricaoVenda = descricaoVenda;
            this.nomeProduto = nomeProduto;
            this.formaPagamento = formaPagamento;
            this.dateVenda = dateVenda;
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
