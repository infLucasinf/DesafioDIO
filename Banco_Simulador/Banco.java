package Banco_Simulador;

import java.util.List;

public class Banco {

	private String nome;
	private int senha;
	private List<Conta> contas;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
