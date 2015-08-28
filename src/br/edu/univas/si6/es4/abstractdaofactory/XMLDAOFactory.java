package br.edu.univas.si6.es4.abstractdaofactory;

public class XMLDAOFactory extends AbstractDAOFactory {

	@Override
	public ProdutoDAO createProdutoDAO() {
		return new ProdutoXMLDAO();
	}

	@Override
	public ClienteDAO createClienteDAO() {
		return new ClienteXMLDAO();
	}

	@Override
	public PedidoDAO createPedidoDAO() {
		return new PedidoXMLDAO();
	}

}
