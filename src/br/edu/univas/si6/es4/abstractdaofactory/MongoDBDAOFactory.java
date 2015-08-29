package br.edu.univas.si6.es4.abstractdaofactory;

public class MongoDBDAOFactory extends AbstractDAOFactory {
	@Override
	public ProdutoDAO createProdutoDAO() {
		return new ProdutoMongoDAO();
	}

	@Override
	public ClienteDAO createClienteDAO() {
		return new ClienteMongoDAO();
	}

	@Override
	public PedidoDAO createPedidoDAO() {
		return new PedidoMongoDAO();
	}

}
