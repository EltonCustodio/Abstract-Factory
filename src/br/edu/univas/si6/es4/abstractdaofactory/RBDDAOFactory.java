package br.edu.univas.si6.es4.abstractdaofactory;

public class RBDDAOFactory extends AbstractDAOFactory {

	@Override
	public ProdutoDAO createProdutoDAO() {
		return new ProdutoRBDDAO();
	}

	@Override
	public ClienteDAO createClienteDAO() {

		return new ClienteRBDDAO();
	}

	@Override
	public PedidoDAO createPedidoDAO() {
		return new PedidoRBDDAO();
	}

}
