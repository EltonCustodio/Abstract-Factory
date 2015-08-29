package br.edu.univas.si6.es4.abstractdaofactory;

public class ClienteMongoDAO implements ClienteDAO {

	@Override
	public void insert(Cliente cliente) {
		System.out.println("Inserindo cliente no MongoDB...");
		System.out.println(cliente);
	}

	@Override
	public Cliente[] list() {
		System.out.println("Buscando cliente no MongoDB...");
		return new Cliente[0];
	}

}
