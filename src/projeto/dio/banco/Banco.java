package projeto.dio.banco;

import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> contas;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Conta> getContas(){
		return contas;
	}
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	
	
	public Banco(String nome, List<Conta> contas) {
		super();
		this.nome = nome;
		this.contas = contas;
	}

	public void listaContas() {
		for(Conta contaAtual: contas) {
			System.out.println(contaAtual);
		}
	}
}
