package br.com.artnomic.desafioDio.projetoBancoYHWH;

public class Main {

	public static void main(String[] args) {
		Cliente Junior = new Cliente();
		Cliente Jota = new Cliente();
		
		Junior.setNome("Junior");
		Jota.setNome("Jota");
		
		Conta cc = new ContaCorrente(Junior);
		Conta poupanca = new ContaPoupanca(Jota);	
		
		System.out.println("*** BEM VINDO AO BANCO YHWH ***");
		System.out.println("---------------------------------");
		cc.ImprimirExtrato();
		System.out.println("---------------------------------");
		poupanca.ImprimirExtrato();
		System.out.println("---------------------------------");
	}

}
