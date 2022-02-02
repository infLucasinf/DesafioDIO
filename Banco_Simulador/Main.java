package Banco_Simulador;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String Nome;
		int opcao;

		Scanner informacoes = new Scanner(System.in);

		System.out.print("Cadastre seu primeiro nome para interagirmos: ");
		Nome = informacoes.next();

		Cliente Nomes = new Cliente();
		Nomes.setNome(Nome);

		Conta cc = new ContaCorrente(Nomes);
		Conta cp = new ContaPoupanca(Nomes);

		System.out.print("\n||Cadastre sua senha com 4 digitos: ");
		int CadastroSenha = informacoes.nextInt();
		System.out.print("||Entre com sua senha de 4 digitos: ");
		int AcessoSenha = informacoes.nextInt();

		if (CadastroSenha == AcessoSenha) {

			do {
				System.out.println("\nDigite uma opção: ");
				System.out.println("1 - Conta Corrente: ");
				System.out.println("2 - Conta Poupança: ");
				System.out.println("0 - Acessar extrato");
				opcao = informacoes.nextInt();

				switch (opcao) {

				case 1:

					System.out.print("            CONTA CORRENTE\n\n");
					System.out.print("Valor saque: ");
					double saque = informacoes.nextDouble();
					cc.sacar(saque);

					System.out.print("Valor deposito: ");
					double deposito = informacoes.nextDouble();
					cc.depositar(deposito);

					System.out.print("Valor transferencia: ");
					double transferencia = informacoes.nextDouble();
					cc.transferir(transferencia, cp);
					break;

				case 2:

					System.out.print("            CONTA POUPANÇA\n\n");
					System.out.print("Valor saque: ");
					double saquePoupanca = informacoes.nextDouble();
					cp.sacar(saquePoupanca);

					System.out.print("Valor deposito: ");
					double depositoPoupanca = informacoes.nextDouble();
					cp.depositar(depositoPoupanca);

					System.out.print("Valor transferencia: ");
					double transferenciaPoupanca = informacoes.nextDouble();
					cp.transferir(transferenciaPoupanca, cc);
					break;
				}

			} while (opcao != 0);

			cc.imprimirExtrato();
			cp.imprimirExtrato();
			return;

		} else {
			System.out.println("Senha incorreta");
			return;
		}
	}

}
