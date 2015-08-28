package br.edu.univas.si6.es4.abstractdaofactory;

public class Runner {
	
	public static void main(String[] args) {

		// Buscar fabrica correta
		AbstractDAOFactory factory = AbstractDAOFactory.getFactory();

		// fabricar produto DAO
		ProdutoDAO produtoDAO = factory.createProdutoDAO();

		// fabricar cliente DAO
		ClienteDAO clienteDAO = factory.createClienteDAO();
		
		//fabricar pedido DAO
		PedidoDAO pedidoDAO = factory.createPedidoDAO();

		// Inserindo um produto novo
		Produto produto = new Produto("Macarrão");
		produtoDAO.insert(produto);

		// inserindo um novo cliente
		Cliente cliente = new Cliente("João");
		clienteDAO.insert(cliente);
		
		//inserindo novo pedido
		Pedido pedido = new Pedido("001");
		pedidoDAO.insert(pedido);

		// listando produtos
		Produto[] produtos = produtoDAO.list();

		// Listando Clietes
		Cliente[] clientes = clienteDAO.list();
		
		//listando novos pedido
		Pedido[] pedidos = pedidoDAO.list();
	}

}
