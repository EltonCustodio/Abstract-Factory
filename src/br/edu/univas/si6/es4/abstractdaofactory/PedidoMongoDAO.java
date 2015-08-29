package br.edu.univas.si6.es4.abstractdaofactory;

public class PedidoMongoDAO implements PedidoDAO{

	@Override
	public void insert(Pedido pedido) {
		System.out.println("Inserindo pedido no MongoDB...");
		System.out.println(pedido);
		
	}

	@Override
	public Pedido[] list() {
		System.out.println("Buscando pedido no MongoDB...");
		return new Pedido[0];
	}

}
