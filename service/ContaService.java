package DioChallenges.amdocs.bancodigital.ContaBancaria.service;

import DioChallenges.amdocs.bancodigital.ContaBancaria.model.Conta;

public interface ContaService {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
