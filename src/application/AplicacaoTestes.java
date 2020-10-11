package application;

import negocio.entidades.Cliente;
import repositorios.RepositorioCliente;

public class AplicacaoTestes {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Maria", "752742888","1234","81-99999-8888","Rua teste", "maria@gmail.com");
		Cliente cliente2 = new Cliente("Joao", "752742888","12345","81-99999-8888","Rua teste", "joao@gmail.com");
		System.out.println(cliente);
		
		RepositorioCliente repo = new RepositorioCliente();
		repo.inserir(cliente);
		repo.inserir(cliente2);
		
		System.out.println(repo.localizarTodos());
		
		
		
		

	}

}
