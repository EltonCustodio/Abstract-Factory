package br.edu.univas.si6.es4.abstractdaofactory;

public class ClienteXMLDAO implements ClienteDAO {

	@Override
	public void insert(Cliente cliente) {
		System.out.println("Inserindo Cliente no arquivo XML...");
		System.out.println(cliente);

	}

	@Override
	public Cliente[] list() {
		System.out.println("Buscando cliente do arquivo XML...");
		return new Cliente[0];
	}

}
