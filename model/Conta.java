package DioChallenges.amdocs.bancodigital.ContaBancaria.model;

import DioChallenges.amdocs.bancodigital.ContaBancaria.service.ContaService;

public abstract class Conta implements ContaService {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroDaConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numeroDaConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Valor de " + valor + " depositado com sucesso! \n");
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimeInformacoes() {
        System.out.println(String.format("Cliente:................. %s", cliente));
        System.out.println(String.format("Agencia:................. %d", agencia));
        System.out.println(String.format("Número da conta:......... %d", numeroDaConta));
        System.out.println(String.format("Extrato:................. %.2f", saldo));
    }
}
