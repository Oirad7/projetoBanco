package projeto.dio.banco;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Conta> contas = new ArrayList<>();
		
		Cliente cliente1 = new Cliente("11800000010","Venilton");
		
		Conta cc1 = new ContaCorrente(cliente1);
		
		contas.add(cc1);
		
		Conta poupanca1 = new ContaPoupanca(cliente1);
		
		contas.add(poupanca1);

		cc1.depositar(100);
		cc1.transferir(100, poupanca1);
		
		

		Cliente cliente2 = new Cliente("11800000010","Osvaldo");
			
		Conta cc2 = new ContaCorrente(cliente2);
		
		contas.add(cc2);

		cc1.depositar(500);
		
		Banco banco = new Banco("Banco Unico", contas);
		
		banco.listaContas();

		
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();
		cc2.imprimirExtrato();
		
		
	}

}