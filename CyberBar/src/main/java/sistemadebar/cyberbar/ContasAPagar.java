package sistemadebar.cyberbar;

import java.util.ArrayList;

/**
 *
 * Analista: Lucas Pessoli Desenvolvedor: Vinicius Sempkoski
 */
public class ContasAPagar {

    private double dblSaldo;
    private ArrayList<Conta> contas;

    public ContasAPagar() {
        contas = new ArrayList<Conta>();
    }

    public void adicionarConta(String nome, String empresa, double valor) {
        Conta conta = new Conta();
        conta.setNomeConta(nome);
        conta.setEmpresaConta(empresa);
        conta.setValorConta(valor);
        contas.add(conta);
    }

    public void pagarConta(int id) {
        for (int i = 0; i < contas.size(); i++) {
            Conta conta = contas.get(i);
            if (conta.getIdConta() == id) {
                dblSaldo -= conta.getValorConta();
                contas.remove(i);
                System.out.println("Conta paga com sucesso!\n");
                return;
            } else if (conta.getIdConta() != 0) {
                System.out.println("Digite um ID válido!");
            }
        }
    }

    public void listarConta() {
        System.out.println("Lista de contas:");
        for (Conta conta : contas) {
            System.out.println(conta.getIdConta() + " - " + conta.getNomeConta() + " - " + conta.getEmpresaConta() + " - R$" + conta.getValorConta());
            }
    }

    public void procurarConta(int id) {
        for (Conta conta : contas) {
            if (conta.getIdConta() == id) {
                System.out.println(conta.getIdConta() + " - " + conta.getNomeConta() + " - " + conta.getEmpresaConta() + " - R$" + conta.getValorConta() + "\n");
                return;
            }
        }
        System.out.println("Conta não encontrada!\n");
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            dblSaldo += valor;
            System.out.println("Saldo adicionado com sucesso!\n");
        } else {
            System.out.println("Digite um valor valido!");
        }
    }

    public void setSaldo(double saldo) {
        this.dblSaldo = saldo;
    }

    public double getSaldo() {
        return dblSaldo;
    }

    private class Conta {
        private static final int idContaAPagar = 1;
        private static final int primeiroIdConta = 1;
        private static final String nomeContaAPagar = "";
        private static final String empresaContaAPagar = "";
        private static final double valorContaAPagar = 0.0;
        private int idConta;
        private String nomeConta;
        private String empresaConta;
        private double valorConta;

        public Conta() {
            this.idConta = idContaAPagar + contas.size();
            this.nomeConta = nomeContaAPagar;
            this.empresaConta = empresaContaAPagar;
            this.valorConta = valorContaAPagar;
        }

        public void setNomeConta(String nomeConta) {
            this.nomeConta = nomeConta;
        }

        public String getNomeConta() {
            return nomeConta;
        }

        public void setEmpresaConta(String empresaConta) {
            this.empresaConta = empresaConta;
        }

        public String getEmpresaConta() {
            return empresaConta;
        }

        public void setValorConta(double valorConta) {
            this.valorConta = valorConta;
        }

        public double getValorConta() {
            return valorConta;
        }

        public int getIdConta() {
            return idConta;
        }

    }
}
