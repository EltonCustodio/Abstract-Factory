package br.edu.univas.si6.es4.abstractdaofactory;

public class PedidoXMLDAO implements PedidoDAO {
	@Override
	public void insert(Pedido pedido) {
		System.out.println("Inserindo Pedido no arquivo XML...");
		System.out.println(pedido);

	}

	@Override
	public Pedido[] list() {
		System.out.println("Buscando pedido do arquivo XML...");
		return new Pedido[0];
	}

}
