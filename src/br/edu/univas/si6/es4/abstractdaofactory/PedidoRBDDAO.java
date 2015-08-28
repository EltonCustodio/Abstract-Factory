package br.edu.univas.si6.es4.abstractdaofactory;

public class PedidoRBDDAO implements PedidoDAO{
	@Override
	public void insert(Pedido pedido) {
		System.out.println("Inserindo pedido no banco de dados relacional...");
		System.out.println(pedido);
	}

	@Override
	public Pedido[] list() {
		System.out.println("Buscando pedido na base de dados relacional...");
		return new Pedido[0];
	}


}
