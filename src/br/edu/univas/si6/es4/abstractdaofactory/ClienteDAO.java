package br.edu.univas.si6.es4.abstractdaofactory;

public interface ClienteDAO {
	public void insert(Cliente cliente);

	public Cliente[] list();
}
