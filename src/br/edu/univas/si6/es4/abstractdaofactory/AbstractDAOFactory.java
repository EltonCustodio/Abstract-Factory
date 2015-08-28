package br.edu.univas.si6.es4.abstractdaofactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class AbstractDAOFactory {

	public abstract ProdutoDAO createProdutoDAO();

	public abstract ClienteDAO createClienteDAO();
	
	public abstract PedidoDAO createPedidoDAO();

	public static AbstractDAOFactory getFactory() {
		String filename = "daofactory.properties";
		InputStream is = AbstractDAOFactory.class.getClassLoader().getResourceAsStream(filename);
		if (is == null) {
			throw new RuntimeException("recurso não encontrado.");
		}
		Properties props = new Properties();
		try {
			props.load(is);
			String type = props.getProperty("daofactory.factorytype");
			if ("RDB".equalsIgnoreCase(type)) {
				return new RBDDAOFactory();
			} else if ("XML".equalsIgnoreCase(type)) {
				return new XMLDAOFactory();
			} else {
				throw new RuntimeException("Tipo não suportado :" + type);
			}
		} catch (IOException e) {
			throw new RuntimeException("Não foi possivel ler as propriedades.", e);
		}
		// switch (tipo) {
		// case TIPO_RBD:
		// return new RBDDAOFactory();
		// case TIPO_XML:
		// return new XMLDAOFactory();
		// default:
		// throw new RuntimeException("Tipo invalido...");
		// }
	}
}
