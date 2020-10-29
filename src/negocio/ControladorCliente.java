package negocio;

import java.util.List;
import java.util.Objects;

import negocio.entidades.Cliente;
import repositorios.RepositorioCliente;
import repositorios.RepositorioPeca;

public class ControladorCliente {

	private static ControladorCliente instancia;
	private RepositorioCliente reCliente;
	
	private ControladorCliente() {
		reCliente= new RepositorioCliente();
	}
	
	public static ControladorCliente getInstancia() {
		if ( instancia == null  )
			instancia= new ControladorCliente();
		return instancia;
	}
	
    public boolean inserir(Cliente cliente) {
    	return reCliente.inserir( cliente );
    }
    
	public Cliente localizar(String cpf) {
		return reCliente.localizar(cpf);
	}

	public List<Cliente> localizarTodos() {
		return reCliente.localizarTodos();
	}

	public boolean deletar(String cpf) {
		return reCliente.deletar(cpf);
	}

	public boolean atualizar(String cpf, Cliente cliente) {
		return reCliente.atualizar(cpf, cliente);
	}    
	
}
