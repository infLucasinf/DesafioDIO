package Banco_Simulador;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente clientes) {
		super(clientes, clientes);
	}

	@Override
	public void Sacar(double Valor) {

	}

	@Override
	public void Depositar(double valor) {

	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\nExtrato CONTA POUPANÇA");
		Informações();
	}
}