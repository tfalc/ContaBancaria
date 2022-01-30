package DioChallenges.amdocs.bancodigital.ContaBancaria.model;

import java.util.Scanner;

public class Menu {

    public void showMenu(){
        System.out.println("## MENU DE SELEÇÃO DE AÇÕES DE CONTA ##");
        System.out.println("Digite um número do menu para selecionar uma opção:");
        System.out.println("1 - Depositar valor");
        System.out.println("2 - Retirar valor");
        System.out.println("3 - Transferir saldo");
        System.out.println("4 - Visualizar saldo");

    }

    public void selecionaTipoConta(){
        System.out.println("## MENU DE SELEÇÃO DE CONTA ##");
        System.out.println("1 - Conta corrente");
        System.out.println("2 - Conta Poupança");
    }

    public void entradaDeDados(){
        System.out.println("## MENU DE ENTRADA DE DADOS ##");
    }
}
