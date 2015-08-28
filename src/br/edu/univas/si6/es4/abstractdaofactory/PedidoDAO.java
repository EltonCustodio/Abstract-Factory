package br.edu.univas.si6.es4.abstractdaofactory;

public interface PedidoDAO {
	public void insert(Pedido pedido);

	public Pedido[] list();

}
