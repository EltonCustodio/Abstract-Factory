package br.edu.univas.si6.es4.abstractdaofactory;

public class ClienteRBDDAO implements ClienteDAO {

	@Override
	public void insert(Cliente cliente) {
		System.out.println("Inserindo cliente no banco de dados relacional...");
		System.out.println(cliente);
	}

	@Override
	public Cliente[] list() {
		System.out.println("Buscando produto na base de dados relacional...");
		return new Cliente[0];
	}

}
